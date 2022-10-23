/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Aryan Soft
 */
//    java TreeSet class implements the Set interface that uses a tree for storage.
//    It inherits AbstractSet class and implements NavigableSet interface.
//    The objects of TreeSet class are stored in ascending order.
//
//    The important points about Java TreeSet class are:
//
//    Contains unique elements only like HashSet.
//    Access and retrieval times are quiet fast.
//    Maintains ascending order.
public class TreeSet_inJava {
    public static void main(String[] args){
        TreeSet<String> ts=new TreeSet<String>();
        ts.add("wali Khan");
        ts.add("amjid khan");
        ts.add("raies Khan");
        ts.add("usman Khan");
        ts.add("hamdard Khan");
        
        Iterator<String> at= ts.iterator();
        while(at.hasNext()){
            System.out.println(at.next());
        }

        
    }
}
