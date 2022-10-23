/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihsanullah.practical;

/**
 *
 * @author Aryan Soft
 */
// auto boxing and unboxing example
public class AutoBoxing {
    public static void main(String[] arg){
        //Converting int into Integer  (autoboxing)
        int a=20;
        Integer i=Integer.valueOf(a);//converting int into Integer (explicitly)
        Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally (explicitly)

        System.out.println(a+" "+i+" "+j);
        
        //converting integer into int (unboxing)
        Integer unbx=100;
        int k=unbx;
        System.out.println("unboxed variable value :"+k);
    }
    
}
