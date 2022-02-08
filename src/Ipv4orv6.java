import java.net.*; 
import java.util.*; 

public class Ipv4orv6 
{ 
	@SuppressWarnings("resource")
	public static void main(String[] args){ 
		String ip; 
		Scanner input = new Scanner(System.in); 
		System.out.print("\n Enter IP Address: "); 
		ip = input.nextLine(); 
		try { 
			InetAddress address = InetAddress.getByName(ip);
			if (address instanceof Inet6Address) {
			    System.out.println("ipv6");
			} else if (address instanceof Inet4Address) {
				System.out.println("ipv4");
			}
//			InetAddress address = InetAddress.getByName(ip);
////			System.out.println("IP address: " + address.getHostAddress());
//			System.out.println("Host name : " + address.getHostName());  
////			System.out.println("Host name and IP address: " + address.toString()); 

		} 
		catch (UnknownHostException ex) {
		     System.out.println("Could not find " + ip); 
		}
	} 
}