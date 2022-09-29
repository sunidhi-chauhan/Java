package com.Day6;

public class A {
//--we can call the main method of another class inside another class also.
	static int i=10;
	
	
	static  void funA() {
		System.out.println("inside funA of A");
		System.out.println(Solution1.a);
		System.out.println(A.i);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside main of A");
		funA();
		
		

	}

}
