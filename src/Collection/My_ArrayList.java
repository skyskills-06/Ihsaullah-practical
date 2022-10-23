/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Aryan Soft
 *
 */
/**
 * Java ArrayList class uses a dynamic array for storing the elements.
 * It inherits AbstractList class and implements List interface.

The important points about Java ArrayList class are:

    Java ArrayList class can contain duplicate elements.
    Java ArrayList class maintains insertion order.
    Java ArrayList class is non synchronized.
    Java ArrayList allows random access because array works at the index basis.
    In Java ArrayList class, manipulation is slow because a lot of shifting needs
    to be occurred if any element is removed from the array list.
 * @author Aryan Soft
 */
public class My_ArrayList {
    public static void main(String[] args){
        
        //ArrayList al=new ArrayList();//creating old non-generic arraylist no need for type casting
        ArrayList<String> arrList= new ArrayList<String>();//we specify the type in angular braces.
        //Now ArrayList is forced to have only specified type of objects in it.
        //If you try to add another type of object, it gives compile time error.
        arrList.add("ihsanullah");
        arrList.add("Java");
        arrList.add("Html");
        arrList.add("CSS");
        arrList.add(2, "javascript");
        //iterating over for each loop
        
        for(String i : arrList){
            System.out.println(i);
        }
        ArrayList<String> arrList2=new ArrayList<String>();
        arrList2.add("Ravi");
        arrList2.add("Hanumat");
//        arrList.retainAll(arrList2);//is used to delete all the elements of invoking collection except the specified collection.
//        System.out.println("iterating the elements after retaining the elements of arrList2...");
//        Iterator itr=arrList.iterator();
//        while(itr.hasNext()){
//         System.out.println(itr.next());
//  }
//        arrList.removeAll(arrList);//remove all ellement from collection
         // arrList.clear();// It is used to remove all of the elements from this list.
//        System.out.println("\n now iterating over interator interface");
//        //iterating over iterator interface
//        Iterator it=arrList.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        arrList.addAll(arrList2); //It is used to append all of the elements in the specified
        //collection to the end of this list, in the order that they are returned by the specified collection's iterator.
        Iterator it=arrList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("last index is :"+arrList.lastIndexOf("javascript"));//return index of occurance object
        
        
    } 
}
