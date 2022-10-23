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

//bellow topic coverd in interface
//interface , static method in interface ,default method in interface , multiple inheratince by help of interface
// marker or tagged interface also coverd : an interface that have no member is known as marker
// they are used to provide some essential information to JVM and Jvm perform usefull operation
interface Printable{
    void print();
    default void msg(){
        System.out.println("default method is called");
    }
}
interface Showable{
    void show();
    static void StaticMethod(){
        System.out.println("Hi there i am static method");
    }
}

public  class Multiple_Inheratence implements Printable,Showable {
    public void print(){
        System.out.println("printing something");
    }
    public void show(){
        System.out.println("Showing something");
    }
    
    public static void main(String[] args){
        Multiple_Inheratence obj=new Multiple_Inheratence();
        obj.msg();
        obj.print();
        obj.show();
        Showable.StaticMethod();
        
    }
}
