package com.Day6;

public class Constructor {
	int p;
	
	 Constructor() {
		 this(10);
		 int a=10;
			int b=20;
		 System.out.println("inside cons1");
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(p);
		 this.p=55;
		 System.out.println(p);
		 
		
	}
	 Constructor(int a) {
		 this("hello");
//		 int a=10;
//			int b=20;
		 System.out.println("inside cons2");
		 System.out.println(a);
//		 System.out.println(b);
		 
	}
	 
	 Constructor(String s) {

		 System.out.println("inside cons3");
		 System.out.println(s);

		 
	}

//	 static void fun1() {
//		int a=10;
//		int b=20;
//		 System.out.println("hello");
//		 System.out.println(a);
//		 System.out.println(b);
//		 
//	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c=new Constructor();
//		c.fun1();
//		c.fun1();
		
		
//	      
	}

}
