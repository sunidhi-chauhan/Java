package com.Day9;

public class ClassPractice  extends A{
	
	 void funC()
	{
		System.out.println("Inside classPractice");
	}
	
	 void funA()
	{
		System.out.println("Apna Bhai Apna Chaiye sab");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inheritance:
		
		ClassPractice obj = new  ClassPractice ();
		
		
		obj.funC();
		obj.funA();
		obj.funB();
		
		
		

	}

	
}

 