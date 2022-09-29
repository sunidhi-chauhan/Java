/*Question 1:
Create a Java Bean class Student with the following fields :
● roll: Integer
● name: String
● age: Integer
● marks: Integer

Make sure that encapsulation is maintained.
Make validation checks before setting the age and marks of the Student (i.e. are they in
the valid range,18<age<60, 0<marks<500).
Inside a Separate class main method, Create 2 objects of the Student class one by
using the zero-argument constructor and the second by using the parameterized
constructor.
Print the details of both the Student objects*/

package com.Day6;

public class StudentQ1 {
   //data Hiding
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	
	public void  setRoll(int roll) {  //data Abstraction
		this.roll=roll;
	}
	
	public int getRoll() {
		return roll;
		
	}
	
	public void  setName(String name) {  //data Abstraction
		this.name=name;
	}
	
	public String getName() {
		return name ;
		
	}
	
	public void  setAge(int age) {  //data Abstraction
		this.age=age;
	}
	
	public int getAge() {
		return age;
		
	}
	
	public void  setMarks(int marks) {  //data Abstraction
		this.marks=marks;
	}
	
	public int getMarks() {     //data Abstraction
		return marks;
		
	}

	public StudentQ1(int roll, String name, int age, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}

	public StudentQ1() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public String toString() {
//		return "StudentQ1 [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
//	}
//	
//	
	
	
	
}
