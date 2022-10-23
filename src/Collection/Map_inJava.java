/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Aryan Soft
 */

//    A map contains values on the basis of key i.e. key and value pair.
//    Each key and value pair is known as an entry. Map contains only unique keys.
//
//    Map is useful if you have to search, update or delete elements on the basis of key.
//
//    Java Map Hierarchy
//    There are two interfaces for implementing Map in java: Map and SortedMap,
//    and three classes: HashMap, LinkedHashMap and TreeMap. The hierarchy of Java Map is given below:
//
//    Map doesn't allow duplicate keys, but you can have duplicate values.
//    HashMap and LinkedHashMap allows null keys and values but TreeMap doesn't allow any null key or value.
//
//    Map can't be traversed so you need to convert it into Set using keySet() or entrySet() method.
//
//    Class                             Description
//    HashMap           HashMap is the implementation of Map but it doesn't maintain any order.
//    LinkedHashMap	LinkedHashMap is the implementation of Map, it inherits HashMap class. It maintains insertion order.
//    TreeMap           TreeMap is the implementation of Map and SortedMap, it maintains ascending order.
//
//Method                                      Description
//Object put(Object key, Object value)	It is used to insert an entry in this map.
//void putAll(Map map)                    It is used to insert the specified map in this map.
//Object remove(Object key)       	It is used to delete an entry for the specified key.
//Object get(Object key)                  It is used to return the value for the specified key.
//boolean containsKey(Object key)         It is used to search the specified key from this map.
//Set keySet()                            It is used to return the Set view containing all the keys.
//Set entrySet()                          It is used to return the Set view containing all the keys and values.
public class Map_inJava {
   public static void main(String[] String){
       Map<String,String> mp=new HashMap<String , String>();
       mp.put("name", "ihsanullah");
       mp.put("fatherName", "hazratgul");
       mp.put("skills", "java,javascript");
       System.out.println("is there a key skills : "+mp.containsKey("skills"));
       System.out.println("is there a key myskills : "+mp.containsKey("myskills"));
       System.out.println("get the ellement with key : "+mp.get("name"));
       Set set=mp.entrySet();
       Iterator i=set.iterator();
       while(i.hasNext())
       {
           System.out.println(i.next());
       }
       
       mp.remove("fatherName");
       for(Map.Entry m:mp.entrySet())
       {
           System.out.println(m.getKey()+" "+m.getValue());
       }
       
       
   } 
}
