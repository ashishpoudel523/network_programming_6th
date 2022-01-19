
import java.net.InetAddress;
import java.net.UnknownHostException;
public class localhostaddress {
	public static void main(String[] args) throws UnknownHostException {
	      
        InetAddress ip = InetAddress.getByName("localhost");
        System.out.println(ip);
        
    }
}


