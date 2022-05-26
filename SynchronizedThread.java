/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Atif Ali
 */

class Display1
{
    public synchronized void wish(String name)
    {
        for(int i=0;i<5;i++)
        {
             System.out.print("Good Morning:");
            try
            {
                Thread.sleep(100);
            }
            catch (InterruptedException e){}
            System.out.println(name);
        }
    }
}
class MyThread extends Thread
{
    Display1 d;
    String name;
    MyThread(Display1 d,String name)
    {
        this.d=d;
        this.name=name;
    }
    public void run()
    {
        d.wish(name);
    }
}
public class SynchronizedThread 
{
    public static void main(String[] args)
    {
        Display1 d1=new Display1();
        MyThread t1=new MyThread(d1,"M S Dhoni");
        MyThread t2=new MyThread(d1,"Virat Kohli");
        t1.start();
        t2.start();
    }
}



