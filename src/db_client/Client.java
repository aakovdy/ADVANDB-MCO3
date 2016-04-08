package db_client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client implements Runnable {

	int portNum;
	String ipAddress;
	String query;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
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
			
			// Write to socket using ObjectOutputStream
			oos = new ObjectOutputStream(clientSocket.getOutputStream());
			System.out.println("Sending request to SocketServer");
			
			// Send query or result set to server
			
			
			clientSocket.close();
			
		} catch(Exception e){
			System.out.println("Client not found!");
		}
	}
	
	public void sendQuery(){
		
	}
	
	public void sendResultSet(){
		
	}
}
