/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;
import java.io.*;
import java.util.*;
/**
 *
 * @author Aryan Soft
 */
public class lock_example {
    String name="";
    static int count=0;
    public void geekName(String geek, List<String> list)
	{
		// Only one thread is permitted
		// to change geek's name at a time.
		synchronized(this){
                    try{
                        if(count==0){
                         count++;
                         System.out.println("thread entered to if block ");
                         this.wait(5000); 
                        
                        }
                        System.out.println("geeks changed "+count);
                        
                        name = geek;
                         // how many threads change geek's name.
                        
                    }catch(Exception ex){
                        System.out.println(ex);
                    }
                    
			
		
                }
		// All other threads are permitted
		// to add geek name into list.
		list.add(geek);
	}
    
}




class GFG extends Thread
{
    List list;
    lock_example object;

    public GFG(List list,String tname, lock_example obj){
        this.setName(tname);
        this.object=obj;
        this.list=list;
        this.start();
        
    }
    @Override
    public void run(){
        System.out.println(this.getName()+ " is running");
        object.geekName("name"+lock_example.count, this.list);
    }
	public static void main (String[] args)
	{
                
		lock_example gk = new lock_example();
		lock_example gk1 = new lock_example();
                
		List<String> list = new ArrayList<String>();
                GFG t1=new GFG(list,"firstThread",gk);
                System.out.println(gk.name);
                GFG t2=new GFG(list,"second thread",gk1);
                System.out.println(gk1.name);
		

	}
}
