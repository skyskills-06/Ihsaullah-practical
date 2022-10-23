/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Aryan Soft
 */
//Java HashSet class is used to create a collection that uses a hash table for storage.
//        It inherits the AbstractSet class and implements Set interface.
//
//The important points about Java HashSet class are:
//
//HashSet stores the elements by using a mechanism called hashing.
//HashSet contains unique elements only.
//Difference between List and Set
//List can contain duplicate elements whereas Set contains unique elements only.
//
//Hierarchy of HashSet class
//The HashSet class extends AbstractSet class which implements Set interface.
//        The Set interface inherits Collection and Iterable interfaces in hierarchical order.
public class HashSet_InJava {
    public static void main(String[] args) {
	HashSet<Book> set=new HashSet<Book>();
	//Creating Books
	Book b1=new Book(101,"Let us C","ihsanullah yasar","BPB",8);
	Book b2=new Book(102," Networking","ahmad","comp net top down apprach",4);
	Book b3=new Book(103,"Operating System","samullah","OP system",6);
	//Adding Books to HashSet
	set.add(b1);
	set.add(b2);
	set.add(b3);
	//Traversing HashSet
	for(Book b:set){
	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
        HashSet<String> hs=new HashSet<String>();
        hs.add("ihsanullah");
        hs.add("java");
        hs.add("javascript");
        Iterator at=hs.iterator();
        while(at.hasNext()){
            System.out.println(at.next());
        }
        
}
}
