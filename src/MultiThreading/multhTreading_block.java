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
   public class multhTreading_block implements Runnable{
    private static Integer[] arr={30,20,10,40};
    public static void sortaccend(){
        try{
           int smallest; // index of smallest element
        // loop over data.length - 1 elements
        for ( int i = 0; i < arr.length - 1; i++ )
        {
        smallest = i; // first index of remaining array
        // loop to find index of smallest element
        for ( int index = i + 1; index < arr.length; index++ )
        if ( arr[ index ] < arr[ smallest ] )
        smallest = index;
        swap( i, smallest ); // swap smallest element into position
        } // end outer for
        }catch(Exception ex){
            System.out.println(ex);
        }
        
       
        
    }
    public static void swap( int first, int second )
     {
     int temporary = arr[ first ]; // store first in temporary
     arr[ first ] = arr[ second ]; // replace first with second
     arr[ second ] = temporary; // put temporary in second
     } // end method swap
    
    public static void sortdescend(){
        try{
           int smallest; // index of smallest element
        // loop over data.length - 1 elements
        for ( int i = 0; i < arr.length - 1; i++ )
        {
        smallest = i; // first index of remaining array
        // loop to find index of smallest element
        for ( int index = i + 1; index < arr.length; index++ )
        if ( arr[ index ] > arr[ smallest ] )
        smallest = index;
        swap( i, smallest); // swap smallest element into position
        } // end outer for
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
 class Shared_Resource {
    // Java program that need Synchronization


	public static void main (String[] args)
	{
            try{
                
                multhTreading_block t1=new multhTreading_block();
                multhTreading_block t2=new multhTreading_block();
                t1.run();
                t2.run();
                
                t1.sortdescend();
                t2.sortaccend();
                
            }catch(Exception ex){
//                System.out.println(ex);
            }
		
	}
}

