/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Atif Ali
 */
public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> cities=new HashSet<String>();
        cities.add("Dehradun");
        cities.add("Saharanpur");
        cities.add("Mussoorie");
        cities.add("Manali");
        cities.add("Srinagar");
        Iterator<String> itr=cities.iterator();
        while(itr.hasNext()){
            String s=itr.next();
            System.out.println(s);
        }
    }
}
