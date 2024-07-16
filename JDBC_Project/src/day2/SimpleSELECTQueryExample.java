package day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleSELECTQueryExample {

	public static void main(String[] args) {
		String driverClassName = "com.mysql.cj.jdbc.Driver";//oracle.jdbc.OracleDriver
		String connectionURL = "jdbc:mysql://localhost:3306/training?useSSL=false";
		String userId = "root";
		String password = "root";
		Connection dbConnection = null;
		Statement stmt = null;
		ResultSet recordSet = null;
		try {
			//Step 1
			Class.forName(driverClassName);//Loading the driver
			System.out.println("Driver loaded successfully.");
			
			//Step 2
			dbConnection = DriverManager.getConnection(connectionURL, userId, password);//Establishing connection
			System.out.println("Connection established successfully.");
			
			//Step 3
			stmt = dbConnection.createStatement();
			
			//Step 4
			String sqlQuery = "select rest_name, rest_branch_count, rest_cuisine from restaurant_master";
			recordSet = stmt.executeQuery(sqlQuery);
			
			//Step 5
			while(recordSet.next()) {
				String name = recordSet.getString(1);
				int brCount = recordSet.getInt(2);
				String cuisine = recordSet.getString(3);
				System.out.println(name + ", " + brCount + ", " + cuisine);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				recordSet.close();
				stmt.close();
				dbConnection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
