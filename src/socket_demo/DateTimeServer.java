package socket_demo;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateTimeServer {
	public static int DEFAULT_PORT = 1856;
	public static void main(String[] args) throws IOException {
		try(ServerSocket server = new ServerSocket(DEFAULT_PORT)){
			while(true) {
				try(Socket sc = server.accept()){
					Writer out = new OutputStreamWriter(sc.getOutputStream());
					Date date = new Date();
					out.write("Current Date and Time: " + date.toString());
					out.flush();
					out.close();
				}catch(IOException ex) {
					System.out.println(ex.getMessage());
				}
			}
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
		}
	}
}