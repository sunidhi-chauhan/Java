package com.Day9;
/*Create a Main class with the main method as follows:  
  Bird b1 = new Parrot();
//with this b1 reference call the fly method of
Parrot
//and after downcasting this b1 reference to the
Parrot class object, call the sing method also */

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bird b1 = new Parrot();//parent class object reference to child class objects.
		
        b1.fly();
        
        
        Parrot p1 = (Parrot)b1;
        p1.sing(); 
	}
	

}
