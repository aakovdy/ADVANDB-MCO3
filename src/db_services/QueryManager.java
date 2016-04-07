package db_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db_manager.DBConnection;

public class QueryManager {
	public QueryManager(){}
	
	// Process the query here -> READ and WRITE
	public ResultSet processQuery(String query){
		
		Connection conn = DBConnection.getConnection();
		
		try{
			PreparedStatement pstmt = conn.prepareStatement(query);
			
			return pstmt.executeQuery();	// Returns the result set done by the query
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
}
