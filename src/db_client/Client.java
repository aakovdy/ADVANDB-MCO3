package db_client;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client implements Runnable {

	int portNum;
	String ipAddress;
	String query;
	
	public Client(int portNum, String ipAddress){
		this.portNum = portNum;
		this.ipAddress = ipAddress;
	}
	
	public Client(int portNum, String ipAddress, String query){
		this.portNum = portNum;
		this.ipAddress = ipAddress;
		this.query = query;
	}
	
	public void setQuery(String query){
		this.query = query;
	}
	
	@Override
	public void run() {
		try{
			// Connect to a server
			Socket clientSocket = new Socket(ipAddress, portNum);
			
			DataOutputStream sendToServer = new DataOutputStream(clientSocket.getOutputStream());
			
			// Send query or result set to server
			
		} catch(Exception e){
			System.out.println("Client not found!");
		}
	}
	
	public void sendQuery(){
		
	}
	
	public void sendResultSet(){
		
	}
}
