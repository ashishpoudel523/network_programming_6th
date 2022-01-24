import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemo {
	public static void main(String [] args) throws IOException {
		String surl = "https://www.kbc.edu.np:443/media/organizationdetails/logo_1_zz4T052.png?key1=value1#ascb";
		URL url1 = new URL(surl);
		System.out.println(surl);
		System.out.println(url1);
		URL url2 = new URL("https://kbc.edu.np/media/organizationdetails/logo_1_zz4T052.png/gugk");
		URL url3 = new URL("https","kbc.edu.np", 443, "/media/organizationdetails/logo_1_zz4T052.png");
		
		
		System.out.println(url2);
		System.out.println(url3);
		
		URL baseurl = new URL("https://www.kbc.edu.np/");
		
		String rurl = "/program/1";
		
		URL absurl = new URL(baseurl, rurl);
		System.out.println(absurl);
		
		//url1
		System.out.println(url1.getProtocol());
		System.out.println(url1.getAuthority());
		System.out.println(url1.getPort());
		System.out.println(url1.getFile());
		System.out.println(url1.getQuery());
		System.out.println(url1.getUserInfo());
		System.out.println(url1.getHost());
		System.out.println(url1.getRef());
		
		URLConnection con  =  url1.openConnection();
	}
}	



