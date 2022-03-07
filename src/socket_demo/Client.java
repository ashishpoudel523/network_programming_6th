package socket_demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		Socket sc = new Socket("127.0.0.1", 1856);
		PrintWriter out = new PrintWriter(sc.getOutputStream());
		Scanner 
	}

}
