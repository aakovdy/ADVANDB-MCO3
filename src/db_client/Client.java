package db_client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client implements Runnable {

	int portNum;
	String ipAddress;
	String query;
	boolean status;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	
	public Client(int portNum, String ipAddress){
		this.portNum = portNum;
		this.ipAddress = ipAddress;
	}
	
	public Client(int portNum, String ipAddress, String query, boolean status){
		this.portNum = portNum;
		this.ipAddress = ipAddress;
		this.query = query;
		this.status = status;
	}
	
	public void setQuery(String query){
		this.query = query;
	}
	
	@Override
	public void run() {
		try{
			// Connect to a server
			Socket clientSocket = new Socket(ipAddress, portNum);
			System.out.println("Connected to a client with IP Address " + ipAddress);
			
			
			// Write to socket using ObjectOutputStream
			oos = new ObjectOutputStream(clientSocket.getOutputStream());
			
			// Send query to server
			oos.writeObject(query);
			
			
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
