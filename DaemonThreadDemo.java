/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Atif Ali
 */
class MyThread2 extends Thread{

}

public class DaemonThreadDemo {
    public static void main(String args[]){
        System.out.println(Thread.currentThread().isDaemon());
        MyThread2 t=new MyThread2();
        System.out.println(t.isDaemon());
        t.start();
        t.setDaemon(true);
        System.out.println(t.isDaemon());
    }
}
