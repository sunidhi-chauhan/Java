package com.Day10;

/* Q4) Define a Java class Parent with the following 3 methods:
method1(): void
method2(): void
method3(): void

And the following Final filed:
number: integer

Make sure that method1() must be overridden inside the child class.Make sure that method2() can
not be overridden inside the child class.

The method3() may or may not be overridden inside the child class.
Define method4() method inside the child class.

Make sure nobody can extend the child class.

While creating the child class object of the above class, take a positive number from
the user between the range of 1 to 10, and initialize the value of the number variable of the parent class otherwise print “Invalid number”.From method1() print the value of the
number variable.

Call method1(), method2(), method3() and method4() from the parent class variable.

Note: Inside each method body mention this method belongs to which class
*/

public  class Parent {
	
	final int number ;
	
	
	
     Parent(int i){
		
		number =i;
		
	}
	
     
	public  int getNumber()
	{
		return this.number;
	}
	
	
	void method1() {
		
		
		System.out.println("Inside method1 from class Parent");
		
	}
	

	final void method2() {
		
		System.out.println("Inside method2 from class  Parent ");
	
	}
	

	final void method3() {
		
		System.out.println("Inside method3 from class parent");
		
		
	}
	
	
	
	

}
