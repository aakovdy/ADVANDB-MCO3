package db_manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static final String url = "jdbc:mysql://localhost:3306/<SCHEMA_NAME>";
	static final String username = "<USERNAME_OF_DATABASE>";
	static final String password = "<PASSWORD_OF_DATABASE>";
	
	public DBConnection(){}
	
	public static Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		return null;
	}
}
