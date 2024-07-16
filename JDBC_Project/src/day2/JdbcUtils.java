package day2;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	//This is a utility class used to establish Connection and return the same.	
	public static Connection buildConnection() throws Exception {
		String connectionURL = "jdbc:mysql://localhost:3306/training?useSSL=false";
		String userId = "root";
		String password = "root";
		Connection dbConnection = DriverManager.getConnection(connectionURL, userId, password);
		return dbConnection;
	}
	
}
