/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author Aryan Soft
 */
import java.util.*;
 class ListIteratorInterface {
public static void main(String[] args) {
	//Creating list of Books
	List<Book> list=new ArrayList<Book>();
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
