import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class ReadHeaderInfo {

	public static void main(String[] args) {
		try{
		    URL url = new URL ("https://www.kbe.edu.np/");
		    URLConnection conn = url.openConnection ();
		    System.out.println (conn.getContentType ());
		     System.out.println (conn.getContentLength ());
		     System.out.println (conn.getContentEncoding ());
		                                                                       
		    Date date = new Date (conn.getDate());
		     System.out.println (date);
		     System.out.println ("Expiration:"+conn.getExpiration ());
		     System.out.println ("Last modified:"+conn.getLastModified () );
		     System.out.println ("Using arbitary method");
		     System.out.println (conn.getHeaderField ("content-type"));
		     System.out.println (conn.getHeaderField ("Content-length"));
		     System.out.println (conn.getHeaderField ("contnt-encoding"));
		     System.out.println (conn.getHeaderField("date"));
		     System.out.println (conn.getHeaderField ("expires"));
		     
		     System.out.println("Indexing Techniques");
		     System.out.println(conn.getHeaderFieldKey(1));
		     System.out.println();
		     System.out.println();
		     System.out.println();
		     System.out.println();
		     
		                                           
		 } catch (MalformedURLException ex) {
		     System.out.println (ex);
		}catch (IOException ex) {
		     System.out.println (ex);
		}
	}

}
