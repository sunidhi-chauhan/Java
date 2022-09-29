/*  Question 3:
Create a Student class with the following fields:
● roll: Integer
● name: String
● address: String
● collageName: String
Include appropriate getter methods
Create a static method inside this class as follows:
public static Student getStudent(boolean isFromNIT)
Assume most of the students are from “NIT” college. So the user has to call the above
method by passing true or false input whether the student is from NIT or not.
1.If the student belongs to NIT, then create a student object with a 3-argument
constructor to initialize the values for (roll, name, address) and set the collageName
as “NIT” and return that Student object.
2. If the student belongs to another college, create the student object with a 4-
argument constructor to initialize all the values and return that Student object.
Call the above method from the main method of the Demo class 2 times and print both
the Student details. */

package com.Day6;

public class StudentQ3 {
	int roll;
	String name;
    String address;
	String collageName;
	
	
	StudentQ3(){
		
	}
	
	StudentQ3(int roll, String name,String address){
		
		this.roll=roll;
		this.name=name;
		this.address=address;
		
		
		System.out.println(roll);
		System.out.println(name);
		System.out.println(address);
		
	}
	
	StudentQ3(int roll,String name,String address,String collageName){
		
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
		
		
		System.out.println(roll);
		System.out.println(name);
		System.out.println(address);
		System.out.println(collageName);
	}
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	
	
	public static  StudentQ3 getStudent(boolean isFromNIT) {
		
		
		if(isFromNIT) {
			
			 StudentQ3 a1=new StudentQ3(23,"sunidhi","Dehradun");
	
			 return a1;
		}
		else
		System.out.println("========================================");
		
		StudentQ3 a2=new StudentQ3(34,"Ram","UP","GEHU");
		
		return a2;
	}
	
	

}





