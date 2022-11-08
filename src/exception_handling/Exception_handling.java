/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

import java.sql.DriverManager;

/**
 *
 * @author Aryan Soft
 */
public class Exception_handling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // we will create devision class object and call the devision method
        Devide devisio=new Devide();
        devisio.devide(10, 0);
        // here the fuction will throws the exception
//            int a=10;
//            int b=0;
//            try{
//                if(b==0){
//                    throw new ArithmeticException("b value most not be zero");
//                    
//                }
//                int c=a/b;
//                System.out.println(c);
//                    
//            }catch(ArithmeticException e){
//                System.out.println(e.getMessage());
//            }
        
        
        
        
        
//        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con==DriverManager.getConnection("jdbc:mysql//localhost/mydb?username=root/password=");
//            
//        }
//        catch(Exception ex){
//            System.out.println("ex");
//        }
//        try{
//            String mystr="ahmad";
//            int a =Integer.parseInt(mystr);
//            System.out.println(a);
//            System.out.println("this must");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println(e);
//        }
//        finally{
//            System.out.println("this must");
//        }
//                System.out.println("ok i am here");
//        
    }
    
}
