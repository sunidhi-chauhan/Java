package com.Day9;

/* Create another class called Parrot as a child class of the above Bird
class and override the fly method with the following implementation:
System.out.println("I am Flying");
Inside this parrot class define another method as follows:
public void sing(){
System.out.println("I am Singing");*/

public class Parrot extends Bird{
	
	@Override
	public void fly() 
	{
		System.out.println("I am Flying");
	}
	
	public void sing()
	{
		System.out.println("I am Singing");
	}

}
