/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.*;

/**
 *
 * @author Aryan Soft
 */
//Java LinkedList class uses doubly linked list to store the elements. It provides a linked-list data structure. It inherits the AbstractList class and implements List and Deque interfaces.
//
//The important points about Java LinkedList are:
//
//Java LinkedList class can contain duplicate elements.
//Java LinkedList class maintains insertion order.
//Java LinkedList class is non synchronized.
//In Java LinkedList class, manipulation is fast because no shifting needs to be occurred.
//Java LinkedList class can be used as list, stack or queue.

 class Book {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.quantity = quantity;
    }
    }

public class My_LinkList {
    
    
    
    public static void main(String[] args){
        LinkedList<String> LL=new LinkedList<String>();
        LL.add("java");
        LL.add("javascript");
        LL.addFirst("Ihsanullah");
        LL.addLast("php");
        LL.add("react");
        Iterator<String> at= LL.iterator();
        while(at.hasNext())
        {
            System.out.println(at.next());
        }
        System.out.println(LL.size());
        System.out.println("first ellement :"+LL.getFirst()+" last ellement : "+LL.getLast());
        System.out.println("is there a javascript in list : "+LL.contains("javascript"));
        LL.remove("php");//remove specified ellement from list
        Iterator<String> at2= LL.iterator();
        
        while(at2.hasNext())
        {
            System.out.println(at2.next());
        }
        System.out.println("we will add book object to list");
        //Creating list of Books
	List<Book> list=new LinkedList<Book>();
	//Creating Books
	Book b1=new Book(101,"Let us C","ihsanullah yasar","BPB",8);
	Book b2=new Book(102," Networking","ahmad","comp net top down apprach",4);
	Book b3=new Book(103,"Operating System","samullah","OP system",6);
	//Adding Books to list
	list.add(b1);
	list.add(b2);
	list.add(b3);
	//Traversing list
	for(Book b:list){
	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	}
        
                
    }
    
}
