/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.net.*;
import java.io.*;
/**
 *
 * @author Atif Ali
 */
public class MyClient {
    public static void main(String args[])throws Exception{
        Socket s=new Socket("localhost",3333);
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="",str2="";
        while(!str.equals("Stop")){
            str=br.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2=din.readUTF();
            System.out.println("Server Says: "+str2);
        }
        dout.close();
        s.close();
    }
}
