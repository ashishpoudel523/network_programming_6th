import java.io.IOException;
import java.net.ServerSocket;

public class GettingInfo {

	//retrieving Server information 
	public static void main(String[] args) throws IOException {
		try (ServerSocket server = new ServerSocket(90)) {
			System.out.println(server.getInetAddress());
			System.out.println(server.getLocalPort());
		}
	}

}
