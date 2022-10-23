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
// encapuslation is mechanism that we define all instance member as privite
// and have setter and getter method for initilizing and getting varialble name
public class Encapsulation {
        //private data member
        private String name;
        //getter method for name
        public String getName(){
        return this.name;
        }
        //setter method for name
        public void setName(String name){
        this.name=name;
        }

    public static void main(String[] args){
        //creating instance of the encapsulated class
        Encapsulation s=new Encapsulation();
        //setting value in the name member
        s.setName("ahmad");
        //getting value of the name member
        System.out.println(s.getName());
        }
    
}
