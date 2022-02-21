
import java.net.MalformedURLException;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author shubham
 */
public class UrlConfigureDemo {
    public static void main(String[] args) throws MalformedURLException {
        URL url=new URL("https//www.kbc.edu.np");
        URLCOnnection conn=url.OpenConnection();    
    }
 
}
