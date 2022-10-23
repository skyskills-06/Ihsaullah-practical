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
//interface printable{
//void print();
//}
//class A6 implements printable{
//public void print(){System.out.println("Hello");}
//
//public static void main(String args[]){
//A6 obj = new A6();
//obj.print();
// }
//}
public class InterFace{
    
}
interface Drawable{
void draw();
}
//Implementation: by second user
class Rectangles implements Drawable{
public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable{
public void draw(){System.out.println("drawing circle");}
}
//Using interface: by third user
class TestInterface{
public static void main(String args[]){
Drawable d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
d.draw();
}}
