
package javaapplication1;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Atif Ali
 */
public class WebsiteCopy {
        public static void main(String args[])
        {
            String line=null;
            try{
                URL web=new URL("https://www.kiet.edu/");
                InputStream is=web.openStream();
                InputStreamReader isr=new InputStreamReader(is);
                BufferedReader br=new BufferedReader(isr);
                FileWriter fw=new FileWriter("javaapplication1\\kiet.html");
                while((line=br.readLine())!=null){
                    fw.write(line);
                }
                System.out.println("URL converted into HTML Successfully");
                fw.close(); 
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(WebsiteCopy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}
