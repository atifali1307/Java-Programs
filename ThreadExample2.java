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
class Super2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Super Class Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Super2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
class Sub2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Sub Class Thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Sub2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class ThreadExample2 {
    public static void main(String args[])
    {
        Super2 s2=new Super2();
        Sub2 sub2=new Sub2();
        Thread t1=new Thread(s2);
        Thread t2=new Thread(sub2);   // when we use Runnable interface then, first we have to make object of Thread class then call start method using this Thread
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExample2.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadExample2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Method 2 to create Thread
        
        Runnable r=new Runnable(){        // this is anonymous class
            public void run(){
                System.out.println("Method 2 of creating Thread");
            }
        };
        Thread t5=new Thread(r);
        t5.start();
       
        
        
        // Method 3 of creating Thread
         
        new Thread(){
            public void run(){
                System.out.println("Method 3 of creating Thread");
            }
        }.start();
        
        
        
        // Method 4 of creating Thread
//        Thread t4=new Thread(()->{
//            System.out.println("Method 4 of creating Thread using Lambda funciton");
//        });
//        t4.start();
//        
        
        
        System.out.println("Successfully Terminated");
    }
}
