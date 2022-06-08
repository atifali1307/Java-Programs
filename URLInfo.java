/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Atif Ali
 */
public class URLInfo {
    public static void main(String args[])
    {
        try{
            URL url=new URL("https://www.kiet.edu:80/");
            System.out.println("Domain Name: "+url.getHost());
            System.out.println("PortName: "+url.getPort());
            System.out.println("PathName: "+url.getPath());
            System.out.println("ProtocolName: "+url.getProtocol());
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(URLInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
