package db_server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {

	int portNum;
	ServerSocket socket;
	
	public Server(int portNum){
		this.portNum = portNum;
	}
	
	@Override
	public void run() {
		try {
			socket = new ServerSocket(portNum);
			
			System.out.println("Connected to port " + portNum);
			System.out.println();
			
			// Listen to clients
			while(true){
				Socket connectSocket = socket.accept();
				System.out.println("Connected to a client");
				System.out.println();
				
				// Receive SQL statement
				String clientIP = connectSocket.getInetAddress().getHostAddress();
				int clientPort = connectSocket.getPort();
				
				// Process query
				// Return result to client
				
				// Receive result and process query
			}
			
		} catch (Exception e) {
			System.out.println("Port not open!");
		}
	}
	
}
