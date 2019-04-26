package pe.com.tintegro.connection;

import java.sql.DriverManager;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.DriverManagerConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.ObjectPool;

@SuppressWarnings({"unchecked", "rawtypes"})
public class PoolConnectionFactory
{
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static final String ORACLE_DRIVER = "oracle.jdbc.OracleDriver";
	public static final String DBCP_DRIVER = "org.apache.commons.dbcp2.PoolingDriver";
	public static final String POSTGRESQL_DRIVER = "org.postgresql.Driver";
	
	public static Class driverClass;
	private static PoolingDriver driver;

	/**
	 * Registra el Driver para la base de datos
	 * 
	 * @param driver
	 */
	public static void registerJDBCDriver(String driver) throws Exception
	{
		driverClass = Class.forName(driver);
	}

	/**
	 * Obtiene un Connection Factory, por defecto la implementacion es un
	 * DriverManagerConnectionFactory
	 * 
	 * @param connectionURI
	 * @param user
	 * @param password
	 * @return el Factory
	 */
	public static ConnectionFactory getConnFactory(String connectionURI, String user, String password)
	{
		ConnectionFactory driverManagerConnectionFactory = new DriverManagerConnectionFactory(connectionURI, user, password);
		return driverManagerConnectionFactory;
	}

	/**
	 * 
	 * @return el Driver del Pool de Conexiones
	 */
	public static PoolingDriver getDBCPDriver() throws Exception
	{
		Class.forName(DBCP_DRIVER);

		driver = (PoolingDriver) DriverManager.getDriver("jdbc:apache:commons:dbcp:");

		return driver;
	}

	/**
	 * Registro de un Pool de Conexiones
	 * 
	 * @param poolName
	 * @param pool
	 */
	public static void registerPool(String poolName, ObjectPool pool) throws Exception
	{
		driver.registerPool(poolName, pool);
	}
}
