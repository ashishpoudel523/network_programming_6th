
import java.net.InetAddress;
import java.net.UnknownHostException;
public class IPAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		 String ipaddress = "FF01:1111::";
	       
	        InetAddress ip = InetAddress.getByName(ipaddress);
	        
//	        System.out.println(ip.isAnyLocalAddress());
//	        System.out.println(ip.isLoopbackAddress());
//	        System.out.println(ip.isLinkLocalAddress());
//	        System.out.println(ip.isSiteLocalAddress());
//	        System.out.println(ip.isMulticastAddress()); //true
//	        System.out.println(ip.isMCGlobal()); //false
//	        System.out.println(ip.isMCOrgLocal());//false
//	        System.out.println(ip.isMCSiteLocal()); //true
//	        System.out.println(ip.isMCLinkLocal());
//	        System.out.println(ip.isMCNodeLocal());
	        
	          
	        System.out.print("\nHost Address : " +ip.getHostAddress());  
	        System.out.print("\nisAnyLocalAddress : " +ip.isAnyLocalAddress());  
	        System.out.print("\nisLinkLocalAddress : " +ip.isLinkLocalAddress());  
	        System.out.print("\nisLoopbackAddress : " +ip.isLoopbackAddress());  
	        System.out.print("\nisMCGlobal : " +ip.isMCGlobal());  
	        System.out.print("\nisMCLinkLocal : " +ip.isMCLinkLocal());  
	        System.out.print("\nisMCNodeLocal : " +ip.isMCNodeLocal());  
	        System.out.print("\nisMCOrgLocal : " +ip.isMCOrgLocal());  
	        System.out.print("\nisMCSiteLocal : " +ip.isMCSiteLocal());  
	        System.out.print("\nisMulticastAddress : " +ip.isMulticastAddress());  
	        System.out.print("\nisSiteLocalAddress : " +ip.isSiteLocalAddress());  
	        System.out.print("\nhashCode : " +ip.hashCode());  
	      

	}

}







