
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shubham
 */
public class HttpCleintRequestHeaderDemo {
    
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://www.kbc.edu.np");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestProperty("age","29");
//        System.out.println(conn.getRequestProperty("age"));
//        conn.setRequestProperty("cookie","username=ram; age=20;");
//        System.out.println(conn.getRequestProperty("cookie"));
//        conn.setRequestProperty("age","90");
//        System.out.println(conn.getRequestProperty("age"));
//        conn.addRequestProperty("age","89");
//        System.out.println(conn.getRequestProperty("age"));
        
        OutputStream out = conn.getOutputStream();
        OutputStream buffer = new BufferedOutputStream(out);
        OutputStreamWriter outwriter = new OutputStreamWriter(buffer,"8859_1");
        conn.setRequestMethod("POST");
        outwriter.write("username=ram;password=nepal123");
        outwriter.flush();
        outwriter.close();
        
    }
    
}
