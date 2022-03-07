package socket_demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
	public static void main(String [] args) throws IOException{
		System.out.println("Server is running.");
		ServerSocket server = new ServerSocket(1856);
		Socket sc = new Socket();
		BufferReader
}

}