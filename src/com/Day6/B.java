package com.Day6;

public class B {
	 int roll;
	String name;
	int marks;
	
 //zero argument constructor
	B(){
		System.out.println("hello");
		
	}
	
	//parameterized constructor
	B(int roll,String name,int marks){
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		
	}
	

	public void showDetails() {
		
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}

}
