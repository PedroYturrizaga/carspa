package pe.com.tintegro.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.ConnectionFactory;
import org.apache.commons.dbcp2.PoolableConnection;
import org.apache.commons.dbcp2.PoolableConnectionFactory;
import org.apache.commons.dbcp2.PoolingDriver;
import org.apache.commons.pool2.ObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPool;

public class SICConnection
{
	private static List<String> ipList;

	private static SICConnection INSTANCE;

	private SICConnection(){}

	public static Connection getInstance(String user, String password, String IP, String port, String database) throws Exception
	{
		Connection connection = null;

		if (INSTANCE == null)
		{
			INSTANCE = new SICConnection();

			ipList = new ArrayList<>();
		}
		
		boolean existIP = ipList.contains(IP);

		if (!existIP)
		{
			String URI = String.format("jdbc:postgresql://%s:%s/%s", IP, port, database);

			// 1. Registra el driver en la propiedad jdbc.driver de java
			PoolConnectionFactory.registerJDBCDriver(PoolConnectionFactory.POSTGRESQL_DRIVER);

			// 2. Crea el Connection Factory (DriverManagerConnectionFactory)
			ConnectionFactory connectionFactory = PoolConnectionFactory.getConnFactory(URI, user, password);

			// 3. Instancia el factory de pool de objetos
			PoolableConnectionFactory poolfactory = new PoolableConnectionFactory(connectionFactory, null);

			// 4. Crea el pool con PoolableConnection objects
			ObjectPool<PoolableConnection> connectionPool = new GenericObjectPool<PoolableConnection>(poolfactory);

			// 5. Establece el pool para imponer la asociacion (evita errores)
			poolfactory.setPool(connectionPool);

			// 6. Obtiene el driver del pool y lo registra
			PoolingDriver dbcpDriver = PoolConnectionFactory.getDBCPDriver();
			dbcpDriver.registerPool(String.format("sic-dbcp-%s", IP), connectionPool);

			ipList.add(IP);
		}

		connection = DriverManager.getConnection(String.format("jdbc:apache:commons:dbcp:sic-dbcp-%s", IP));

		return connection;
	}
}
