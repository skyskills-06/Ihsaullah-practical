/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Aryan Soft
 */
//        Java Queue interface orders the element in FIFO(First In First Out) manner.
//        In FIFO, first element is removed first and last element is removed at last.
          //vs
//        The PriorityQueue class provides the facility of using queue.
//        But it does not orders the elements in FIFO manner. It inherits AbstractQueue class.
public class QueueAndPriorietyQueue {
    public static void main(String args[]){
        //queue is an abstract class and cannot be instanciated
        Queue<String> q=new PriorityQueue<String>();
        q.add("ihsanullah");
        q.add("attaullah");
        q.add("rahimullah");
        q.add("hekmatullah");
        Iterator i=q.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
//        priority queue
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("ihsan");
        queue.add("yasir");
        queue.add("Kiramat");
        queue.add("kabir");
        queue.add("haroon");
        queue.offer("usman offered");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr=queue.iterator();
        while(itr.hasNext()){
        System.out.println(itr.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2=queue.iterator();
        while(itr2.hasNext()){
        System.out.println(itr2.next());
        }
    }
}
