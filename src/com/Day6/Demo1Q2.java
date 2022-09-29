/*Question 2:
Create a Java class Demo with 4 parameterized constructors as follows:
1. Demo1()
2. Demo1(String s)
3. Demo1(int i)
4. Demo1(float f)
Put a statement in all the constructors which will denote it is the part of the respected
constructor.
Create a Single java object of the Demo1 class in such a way that it will call all the 4
Constructors.*/


package com.Day6;

public class Demo1Q2 {
	
	
	Demo1Q2(){
		this("Radha");
		System.out.println("Constructor as a defalut parimeter");
		
	}
	
	Demo1Q2(String s){
		this(5);
		System.out.println("Constructor as a String parimeter");
		
	}
	
	Demo1Q2(int i){
		this(33.5f);
		System.out.println("Constructor as a Integer parimeter");
		
	}
	
	Demo1Q2(float f){
		
		System.out.println("Constructor as a Float parimeter");
		
	}

	
	public static void main(String[]args) {
		
		Demo1Q2 d1=new Demo1Q2();
		
		
		
	}
}
