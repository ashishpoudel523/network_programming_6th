import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class UriResolve {
	public static void main (String [] args) throws URISyntaxException, UnsupportedEncodingException {
	    URI absolute = new URI ("https://www.example.com");
	    URI rev = new URI ("/images/logo.png");
	    System.out.println (absolute.resolve (rev));
	    
	    
	    URI ab2 = new URI ("https://www.example.com/images/logo.png");
	    URI top = new URI ("https://www.example.com/");
	    
	    System.out.println(top.relativize (ab2) );
	    
	    URI u1 = new URI("https://www.abc.com/A");
        URI u2 = new URI("hTTPs://www.abc.com/èr");
        System.out.println(u1.equals(u2));
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        
        System.out.println(u2.toString());
        System.out.println(u2.toASCIIString());
        
        
        String encode = URLEncoder.encode("https://www.google.com/search?hl=en&as_q=Java&as_epq=I/O","UTF-8");
        System.out.println(encode);
        
        
        String url = "https://www.google.com/search?";
        url += URLEncoder.encode("hl", "UTF-8");
        url += "=";
       // "https://www.google.com/search?hl=";
        url += URLEncoder.encode("en", "UTF-8");
        url += "&";
        //"https://www.google.com/search?hl=en&";
        url += URLEncoder.encode("as_q", "UTF-8");
        //"https://www.google.com/search?hl=en&as_q";
        url += "=";
        url += URLEncoder.encode("Java", "UTF-8");
        //"https://www.google.com/search?hl=en&as_q=java"
        url += "&";
        url += URLEncoder.encode("as_epq", "UTF-8");
        url += "=";
        url += URLEncoder.encode("I/O", "UTF-8");
        System.out.println(url);
        
        System.out.println(URLDecoder.decode(url,"UTF-8"));
	
	    
	}
}
