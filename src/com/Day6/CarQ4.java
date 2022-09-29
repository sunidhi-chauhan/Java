/*Question 4:
Make a Class named Car that has-A class Engine class.
Class Car has following fieldsString model;
String model;
String companyName;
String Color;
Engine engine;
Class Engine has following fields;
int rmp;
int Power;
String manufacturer;
boolean hasTurbo;
Inside this class make one method that can enable turbo in the engine.
(Initially make sure that engine does n’t have a turbo but you have to enable it from the method call.)
Make a main class and inside that make two Car objects one with no-Argument Constructor and other with the
Parameterised Constructor.
Print the details of each car object.
Sample OutPut:
Car Model : Harrier
Car companyName : Tata
Car color : black
Car RPM : 10000
Car power : 110
Car Engine Manufacture : tata
Car Has Turbo : true*/

package com.Day6;

public class CarQ4 {
	
   String model;
   String companyName;
   String color;
   Engine engine;
   
   CarQ4(){
	   
   }
   
   CarQ4(String model,String companyName, String color){
	   
	   System.out.println("Car Model:"+model);
	   System.out.println("Car CompanyName:"+companyName);
	   System.out.println("Car color:"+color); 
   }
  
   
 
}
 class Engine {
	 int rpm;
	 int power;
	 String manufacturer;
	 boolean hasTurbo;
	 
	 
	 
	 
	public static boolean  Turbo(boolean hasTurbo) {
		
		
		System.out.println("Car Has Turbo:"+hasTurbo);
		  
		 return hasTurbo;
		  
	 }
	  
 }
 
