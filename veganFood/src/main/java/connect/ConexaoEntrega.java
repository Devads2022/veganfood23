package connect;

import java.sql.DriverManager;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

public class ConexaoEntrega {
	
	public static Connection getConnection() throws Exception{
		
		Connection conn = null;
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		String urlConnection = "jdbc:mysql://127.0.0.1/veganFood1";
		
		String user = "root";
		
		String senha = "";
		
		conn = (Connection) DriverManager.getConnection(urlConnection, user, senha);
		
		return conn;
	}

}
