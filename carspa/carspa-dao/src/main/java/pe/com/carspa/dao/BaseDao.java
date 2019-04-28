package pe.com.carspa.dao;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pe.com.carspa.util.Constantes;
import pe.com.carspa.util.MensajeError;
import pe.com.carspa.util.Response;

public class BaseDao
{
	/**
	 * Método publico para el acceso desde otras clases.
	 * 
	 * @param spName
	 *            nombre del stored procedure.
	 * 
	 * @param parameters
	 *            parámetros del stored procedure.
	 * 
	 * @param connection
	 *            conexion a la base de datos.
	 * 
	 * @param outputClass
	 *            {@link Class} al que pertenece el objeto de retorno.
	 * 
	 * @param mapColumnToAttributte
	 *            objeto que contiene el mapeo del resulset con el objeto
	 *            deseado.
	 * 
	 * @return una lista de objeto de la clase T. La clase T tiene que ser la
	 *         misma que outputClass.
	 */
	@SuppressWarnings("rawtypes")
	public static <T> Response<T> baseData(String spName, Object[][] parameters, Connection connection, Class outputClass, Map<String, String> mapColumnToAttributte)
	{
		return base(spName, parameters, connection, outputClass, mapColumnToAttributte);
	}

	/**
	 * Método private de acceso a datos.
	 * 
	 * @param spName
	 *            objeto String con el nombre del stored procedure
	 * 
	 * @param parameters
	 *            arreglo genérico de la forma Object[][] que contiene los
	 *            parámetros de entrada del stored. Ejemplo: {{ 1,
	 *            Integer.class },{ "Juan Perez", String.class }, { 34.6,
	 *            Double.class }, { "2016/11/16", Date.class }, { 67.2f,
	 *            Float.class }}
	 * 
	 * @param connection
	 *            objecto de la clase {@link Connection} que contiene la
	 *            conexion a la base de datos que se quiere consultar.
	 * 
	 * @param outputClass
	 *            es el objeto de la clase {@link Class} que indica la clase a
	 *            la que pertenece el objeto a retornar. Ejemplo: Persona.class
	 *            indica que el stored procedure retorna una lista de objetos de
	 *            la clase Persona.
	 * 
	 * @param mapColumnToAttributte
	 *            objeto de la interface {@link Map} que con tiene un mapeado
	 *            row/object perteneciente al resultado de ejecutar el
	 *            storedProcedure. Sus objetos son pares de la forma <
	 *            "nombre_de_columna", "atributoDeLaClaseCorrespondiente" >
	 * 
	 * @return una lista de objeto de la clase T. La clase T tiene que ser la
	 *         misma que outputClass.
	 */
	@SuppressWarnings(
	{ "rawtypes", "unchecked" })
	private static <T> Response<T> base(String spName, Object[][] parameters, Connection connection, Class outputClass, Map<String, String> mapColumnToAttributte)
	{
		Response<T> response = null;
		CallableStatement storedProcedure = null;

		try
		{
			Object parameter;
			Type type;

			// Se obtiene el nombre completo del stored procedure
			String storedProcedureFullName = getStoredProcedureFullName(spName, parameters);
			storedProcedure = connection.prepareCall(storedProcedureFullName);
			int numParameters = parameters.length;

			// Se insertan los parámetros al stored procedure
			for (int i = 0; i < numParameters; i++)
			{
				parameter = parameters[i][0];
				type = (Type) parameters[i][1];

				if( parameter == null )
				{
					storedProcedure.setObject( i + 1, parameter ); 
				}
				else if (type == Integer.class)
				{
					storedProcedure.setInt(i + 1, (Integer) parameter);
				}
				else if (type == String.class)
					storedProcedure.setString(i + 1, (String) parameter);
				else if (type == Boolean.class)
					storedProcedure.setBoolean(i + 1, (Boolean) parameter);
				else if (type == Double.class)
					storedProcedure.setDouble(i + 1, (Double) parameter);
				else if (type == Float.class)
					storedProcedure.setFloat(i + 1, (Float) parameter);
				else if (type == Date.class)
				{
					storedProcedure.setDate(i + 1, (java.sql.Date) parameter);
				}
				else if( type == java.util.Date.class )
				{
					java.util.Date uDate = ( java.util.Date ) parameter;
					
					java.sql.Date sqlDate = new Date( uDate.getTime() );
					
					storedProcedure.setDate( i + 1, sqlDate ); 
				}
				else if (type == Object.class)
				{
					storedProcedure.setObject(i + 1, parameter);
				}

			}

			// Se ejecuta el stored procedure
			ResultSet resultSet = storedProcedure.executeQuery();
			List<T> lsOutPut = new ArrayList<T>();

			if (resultSet != null)
			{
				// Si la salida es un tipo de dato primitivo o similar
				if (outputClass.equals(Integer.class) || outputClass.equals(String.class) || outputClass.equals(Boolean.class) || outputClass.equals(Date.class)
						|| outputClass.equals(java.sql.Date.class) || outputClass.equals(Float.class))
				{
					while (resultSet.next())
					{
						lsOutPut.add((T) resultSet.getObject(1));
					}
				}
				else
				{
					ResultSetMetaData rsmd = resultSet.getMetaData();

					Field[] fields = outputClass.getDeclaredFields();

					T bean = null;

					while (resultSet.next())
					{
						// Se instancia un objeto de la clase de retorno.
						bean = (T) outputClass.newInstance();

						// Se itera sobre cada fila del resultset
						for (int i = 0; i < rsmd.getColumnCount(); i++)
						{
							String columnName = rsmd.getColumnName(i + 1);
							Object columnValue = resultSet.getObject(i + 1);

							for (Field field : fields)
							{
								if (field.getName().equals(mapColumnToAttributte.get(columnName)))
								{
									field.setAccessible(true); // si el atributo
																// es privado,
																// internamente
																// en tiempo de
																// ejecucion se
																// hace public.
									field.set(bean, columnValue);
									break;
								}
							}
						}

						// si la lista es vacía se instancia
						if (lsOutPut == null)
							lsOutPut = new ArrayList<T>();

						// se agrega objeto a la lista
						lsOutPut.add(bean);
					}
				}
			}

			// Se arma el response
			response = new Response<T>(Constantes.ESTADO_TRAMA_OK, MensajeError.OK, lsOutPut);
		}
		catch (Exception e)
		{
			response = new Response<T>(Constantes.ESTADO_TRAMA_ERROR_APP, MensajeError.ERROR_STORED_PROCEDURE, null);
			response.setException(e);
		}
		finally
		{
			try
			{
				storedProcedure.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
		return response;
	}

	/**
	 * Arma el nombre completo de la instrucción perteneciente al stored
	 * procedure.
	 * 
	 * @param spName
	 *            nombre del stored procedure (sin parámetros)
	 * @param parameters
	 *            arreglo genérico que contiene los parámetros. Ejemplo: {{ 1,
	 *            Integer.class },{ "Juan Perez", String.class }, { 34.6,
	 *            Double.class }, { "2016/11/16", Date.class }, { 67.2f,
	 *            Float.class }}
	 * @return String con el nombre completo de la instrucción perteneciente al
	 *         stored procedure.
	 */
	private static String getStoredProcedureFullName(String spName, Object[][] parameters)
	{
		String spFullName = "{ call " + spName + "(";

		for (int i = 0; i < parameters.length; i++)
		{
			if (i == parameters.length - 1)
				spFullName += "? ";
			else
				spFullName += "?, ";
		}

		spFullName += ")}";

		return spFullName;
	}
}