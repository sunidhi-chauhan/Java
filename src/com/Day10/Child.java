package com.Day10;

import java.util.Scanner;

public class Child  extends Parent{
	
	
	
    @Override
	void method1() {
    	System.out.println(getNumber());
    	
		System.out.println("Inside method1 from class Child");
		
	}
    
    void method4() {
		System.out.println("Inside method4 from class Child");
		
	}
    
    Child(int i)
    {
    	super(i);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number range from 1 to 10");
		
		int num = sc.nextInt();
		
		 if(num>=1 && num<=10) {
			
			 
				Child c= new Child(num);
				
				c.method1();
				c.method2();
				c.method3();
				c.method4();
				
			 
		 }
		 
		 else 
			 System.out.println("Invalid Number");
			 
		
	
		

	}

}
