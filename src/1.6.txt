
import java.net.*;
public class SameOrNot {
	public static void main (String args[]) {
		try {
		InetAddress facebook = InetAddress.getByName("www.facebook.com");
		InetAddress fb = InetAddress.getByName("www.fb.com");
		if (facebook.equals(fb)) {
		System.out.println
		("Yes, www.facebook.com is the same as www.fb.com");
		} else {
		System.out.println
		("No, www.facebook.com isn't the same as www.fb.com");
		}
		} catch (UnknownHostException ex) {
		System.out.println("Host lookup failed.");
		}
		}
}





