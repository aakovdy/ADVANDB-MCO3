package db_services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.swing.JTable;

import com.sun.rowset.CachedRowSetImpl;

import db_manager.DBConnection;

public class QueryManager {
	public QueryManager(){}
	
	// Process the query here -> READ and WRITE
	public CachedRowSet processQuery(String query, int isolationLevel){
		
		Connection conn = DBConnection.getConnection();
		ResultSet rs = null;
		CachedRowSetImpl crsi = null;
		
		try{
			switch(isolationLevel){
				case 1:
					conn.setTransactionIsolation(conn.TRANSACTION_SERIALIZABLE);
					break;
				case 2:
					conn.setTransactionIsolation(conn.TRANSACTION_READ_COMMITTED);
					break;
				case 3:
					conn.setTransactionIsolation(conn.TRANSACTION_READ_UNCOMMITTED);
					break;
				case 4:
					conn.setTransactionIsolation(conn.TRANSACTION_REPEATABLE_READ);
					break;
				default:
					conn.setTransactionIsolation(conn.TRANSACTION_NONE);
			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
		try{
			
			PreparedStatement pstmt = conn.prepareStatement(query);
			if(query.contains("INSERT") || query.contains("UPDATE") || query.contains("DELETE")){ //WRITE
				pstmt.executeUpdate();
			}else{ //READ
				rs =  pstmt.executeQuery();			// Returns the result set done by the query
			}
			
			pstmt.close();
			conn.close();
			
			if(query.contains("SELECT")){
				crsi = new CachedRowSetImpl();
				crsi.populate(rs);
				return crsi;
			}
			
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
