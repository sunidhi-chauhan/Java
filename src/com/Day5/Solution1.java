package com.Day5;

public class Solution1 {
	
//	 static Problem1 a1=new Problem1();
	int x=10;
	Solution1 d1;
	static void fun1() {
		System.out.println("Hellooo");
	}
	 int y=100;
	 

	public static void main(String[] args) {
		
		Solution1 a1=new Solution1();
		System.out.println(a1.x);
		System.out.println(a1.d1);
		
		a1.d1=new Solution1();
		System.out.println(a1.d1.x);
		Solution1.fun1();
		System.out.println(a1.y);
	}

}
