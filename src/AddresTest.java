import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddresTest {

	public static void main(String[] args) throws UnknownHostException {
	 String myip = "192.168.123.111";
        InetAddress ip2 = InetAddress.getByName(myip);
        
        if(ip2.getAddress().length==4){
            System.out.println("IPv4");
        }else if(ip2.getAddress().length==16){
            System.out.println("IPv6");
        }
		
	}

}






