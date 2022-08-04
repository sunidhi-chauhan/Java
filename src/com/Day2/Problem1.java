package com.Day2;

public class Problem1 {
	
//Widening casting/Implicit/upcasting:
//Converting a smaller type to a larger size type. 
	
	 int i=9;
	 double myDouble=i;//Automatic casting int to double
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//explicit/manual/Narrowing casting/downcasting
		//Narrowing casting must be done manually by placing the type in parentheses in front of the value:
		double myDouble=9.78d;
		int i=(int) myDouble;//Manual casting:double to int 
		Problem1 d1=new Problem1();
		System.out.println("implict typecasting:"+d1.i);
		System.out.println("implicit typecasting:"+d1.myDouble);
		System.out.println("explicit typecasting:"+myDouble);
		System.out.println("explicit typecasting:"+i);

	}

}
