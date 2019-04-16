package pe.com.carspa.connection;

import java.sql.Connection;

public class PostgreSQL
{
	public Connection con;

	private static String user = "postgres";
	private static String password = "postgres";
	private static String port = "5432";
	private static String database = "carwash";

	public Connection conectar(String IP) throws Exception
	{
		con = CARSPAConnection.getInstance(user, password, IP, port, database);

		return con;
	}
	
	public void cerrar() throws Exception
	{
		// Cierra la conexión para devolverlos al grupo. En lugar de connection.close();
//		Utils.closeQuietly(con);
		if( con != null )
		{
			con.close();
			con = null;
			System.out.println( "Conexion liberada." );
		}
	}
}
