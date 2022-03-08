import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class SimpleHttpServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(8010);
		System.out.println("listening for connection on port 8010");
		while(true) {
			try(Socket socket = server.accept()){
				Date today = new Date();
				String httpsResponse = "HTTP/1.1 200 OK\r\n\r\n" + "<h1>" + today + "</h1>";
				socket.getOutputStream().write(httpsResponse.getBytes("UTF-8"));
			}
		}

	}

}
