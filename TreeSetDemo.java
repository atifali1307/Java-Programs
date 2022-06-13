/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Atif Ali
 */
public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<String> cities=new TreeSet<String>();
        cities.add("Mumbai");
        cities.add("Ahmadabad");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Hyderabad");
        cities.add("Pune");
        Iterator<String> itr=cities.iterator();
        while(itr.hasNext()){
            String s=itr.next();
            System.out.println(s);
        }
    }
}
