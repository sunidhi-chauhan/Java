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

public class SeparateQ1 {

	public static void main(String[] args) {
		

			int age=0;
			int marks=400;
			int roll=23;
			String name="sunidhi";
			
			if(18<age&&age<60  && 0<marks&&marks<500)
			{
				StudentQ1 s1= new StudentQ1();
				s1.setAge(age);
				s1.setMarks(marks);
				s1.setRoll(roll);
				s1.setName(name);
				
//				System.out.println(s1);
				
				System.out.println(s1.getAge());
				System.out.println(s1.getMarks());
				System.out.println(s1.getRoll());
				System.out.println(s1.getName());
			}
			else 
			{
				StudentQ1 s2=new StudentQ1(23,"chauhan",0,5);
//				s2.setAge(age);
//				s2.setMarks(marks);
//				s2.setRoll(roll);
//				s2.setName(name);
//				System.out.println(s2);
				
				System.out.println(s2.getAge());
				System.out.println(s2.getMarks());
				System.out.println(s2.getRoll());
				System.out.println(s2.getName());
				
			}
	    
			
		}
		
	}
