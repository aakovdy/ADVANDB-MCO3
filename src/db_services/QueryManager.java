package db_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;

import db_manager.DBConnection;

public class QueryManager {
	public QueryManager(){}
	
	// Process the query here -> READ and WRITE
	public ResultSet processQuery(String query){
		
		Connection conn = DBConnection.getConnection();
		ResultSet rs = null;
		try{
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			if(query.contains("INSERT") || query.contains("UPDATE") || query.contains("DELETE")){
				pstmt.executeUpdate();
			}else{
			 rs =  pstmt.executeQuery();	// Returns the result set done by the query
			}
			
			pstmt.close();
			conn.close();
			if(query.contains("SELECT"))
				return rs;
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	public JTable displayQuery(ResultSet rs){
		try {
			while(rs.next()){
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
}
