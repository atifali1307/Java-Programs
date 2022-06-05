/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// passing objects into the ArrayList and printing data of objects


package javaapplication1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Atif Ali
 */
public class ArrayListDemo2 {
    public static void main(String args[])
    {
        ArrayList<ArrayListDemo2Student> listOfStudents=new ArrayList();
        ArrayListDemo2Student s1=new ArrayListDemo2Student();
        s1.setRollNo(101);
        s1.setName("Atif Ali Khan");
        ArrayListDemo2Student s2=new ArrayListDemo2Student();
        s2.setRollNo(107);
        s2.setName("Zeeshan Khan");
        listOfStudents.add(s1);
        listOfStudents.add(s2);
        
        Iterator<ArrayListDemo2Student> itr=listOfStudents.iterator();
        while(itr.hasNext()){
            ArrayListDemo2Student s=itr.next();
            System.out.println(s.getName());
            System.out.println(s.getRollNo());
        }
    }
}
