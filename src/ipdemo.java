import java.net.*; 
import java.util.*; 

public class ipdemo 
{ 
	@SuppressWarnings("resource")
	public static void main(String[] args){ 
		String ip; 
		Scanner sc = new Scanner(System.in); 
		System.out.print("\n Enter IP Address: "); 
		ip = sc.nextLine(); 
		try { 
			InetAddress address = InetAddress.getByName(ip);
//			System.out.println("IP address: " + address.getHostAddress());
			System.out.println("Host name : " + address.getHostName());  
//			System.out.println("Host name and IP address: " + address.toString()); 

		} 
		catch (UnknownHostException ex) {
		     System.out.println("Could not find " + ip); 
		}
	} 
}