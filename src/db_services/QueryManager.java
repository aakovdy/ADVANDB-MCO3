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
			
			ResultSet rs =  pstmt.executeQuery();	// Returns the result set done by the query
			
			pstmt.close();
			conn.close();
			return rs;
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
}
