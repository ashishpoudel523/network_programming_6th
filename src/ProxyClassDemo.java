import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

public class ProxyClassDemo extends ProxySelector{

	public static void main(String[] args) {
		//suppose you have the server of ip address 192.24.14.15 http port number 80
		String ip = "192.24.14.15";
		SocketAddress address = new InetSocketAddress(ip, 80);
		Proxy proxy1 = new Proxy(Proxy.Type.HTTP, address);
		
		//suppose another is 178.48.14.56 and port 9000
		String ip2 = "178.48.14.56";
		SocketAddress address2 = new InetSocketAddress(ip2, 9000);
		Proxy proxy2 = new Proxy(Proxy.Type.DIRECT, address);

	}

	@Override
	public List<java.net.Proxy> select(URI uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void connectFailed(URI uri, SocketAddress sa, IOException ioe) {
		// TODO Auto-generated method stub
		
	}

}
