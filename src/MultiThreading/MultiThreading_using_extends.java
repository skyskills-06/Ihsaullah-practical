/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author Aryan Soft
 */

//Multithreading is a Java feature that allows concurrent execution of two or more parts of a program
//for maximum utilization of CPU. Each part of such program is called a thread. So, threads
//are light-weight processes within a process.
//
//Threads can be created by using two mechanisms : 
//
//Extending the Thread class 
//Implementing the Runnable Interface

// Java code for thread creation by extending
// the Thread class
class MultithreadingDemo extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println(
				"Thread " + Thread.currentThread().getId()
				+ " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class

public class MultiThreading_using_extends {
  
    public static void main(String[] args)
	{
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object
				= new MultithreadingDemo();
			object.start();
		}
	}
}
