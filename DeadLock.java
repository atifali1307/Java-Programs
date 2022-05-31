/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Atif Ali
 */
class A
{
    public synchronized void foo(B b){
        System.out.println("Thread 1 starts execution of foo() method");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Thread 1 trying to call b.last()");
        b.last();
    }
    public synchronized void last()
    {
        System.out.println("Inside A, this is last() method");
    }
}
class B{
    public synchronized void bar(A a){
        System.out.println("Thread 2 starts execution of bar() method");
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            
        }
        System.out.println("Thread 2 trying to call a.last()");
        a.last();
    }
    public synchronized void last()
    {
        System.out.println("Inside B, this is last() method");
    }
}
public class DeadLock implements Runnable{
    A a=new A();
    B b=new B();
    DeadLock(){
        Thread t=new Thread(this);
        t.start();
        a.foo(b); // main thread
    }
    public void run(){
        b.bar(a);//child thread
    }
    public static void main(String args[]){
        new DeadLock();  // main thread
    }
}
