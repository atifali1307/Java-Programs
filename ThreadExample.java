/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Atif Ali
 */

class Super extends Thread
{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Super Class Thread");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Super.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
class Sub extends Thread
{
    public void run(){
        for(int i=0;i<5;i++)
        {
            System.out.println("Sub Class Thread");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sub.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class ThreadExample {
    public static void main(String args[])
    {
        Super s=new Super();
        Super s2=new Super();
//        Sub s2=new Sub();
//        s.start();
//        s2.start();
        s.start();
        s2.start();
    }
}
