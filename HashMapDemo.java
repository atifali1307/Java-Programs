/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;

/**
 *
 * @author Atif Ali
 */
public class HashMapDemo {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"KIET Group of Institutions");
        map.put(2,"GL Bajaj");
        map.put(3,"JSS Academy");
        map.put(4,"ABES");
        map.put(5,"AKG");
        System.out.println(map.get(2));
        for(Integer i:map.keySet()){
            System.out.println(map.get(i));
        }
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
