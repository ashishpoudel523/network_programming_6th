import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddresTest {

	public static void main(String[] args) throws UnknownHostException {
	 String myip = "FF0E::11AF";
        InetAddress ip2 = InetAddress.getByName(myip);
        
        if(ip2.getAddress().length==4){
            System.out.println("IPv4");
        }else if(ip2.getAddress().length==16){
            System.out.println("IPv6");
        }
		
	}

}






