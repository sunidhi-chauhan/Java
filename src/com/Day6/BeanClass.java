package com.Day6;

public class BeanClass {
	
	private int roll;
	private String name;
	private int age;
	private int marks;

	 BeanClass(){
		
	}
	
	

	public BeanClass(int roll, String name, int marks) {
//		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
//		System.out.println(roll);
	}
	
	
	//setter used to set the value
 public void setRoll(int roll) {
	 this.roll=roll;
	 
 }
 
 //getter is used to use the value
 public int getRoll()
 {
	 return roll;
 }
	
 public  void  setName(String name) {
	 this.name=name;
	 
 }
 
 public String getName()
 {
	 return name;
 }
 
 

}
