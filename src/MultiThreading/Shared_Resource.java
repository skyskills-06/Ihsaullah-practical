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
class multhTreading_block extends Thread{
    private int i=0;
    synchronized public void increment(){
       
        i++;
    }
    public int getValue(){
        return i;
    }
}
public class Shared_Resource {
    // Java program that need Synchronization


	public static void main (String[] args)
	{
            try{
                multhTreading_block t1 = new multhTreading_block();
                multhTreading_block t2 = new multhTreading_block();
                t1.start();
                t2.start();
                
                for(int i=0;i<10;i++){
                    t1.increment();
                   
                    System.out.println(t2.getValue());
                    t2.increment();

                    System.out.println(t1.getValue());
                }
                
            }catch(Exception ex){
                System.out.println(ex);
            }
		
	}
}

