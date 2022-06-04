/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Atif Ali
 */
public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList<String> names=new ArrayList();
        names.add("KIET GROUP OF INSTITUTIONS");
        names.add("GL BAJAJ");
        names.add("JSS ACADEMY");
        names.add("GALGOTIA");
        for(String s:names){
            System.out.println(s);        
        }
        
        // usiing Iterator
        Iterator<String> itr=names.iterator();
        while(itr.hasNext()){
            String s2=itr.next();
            System.out.println(s2);
        }
    }
}
