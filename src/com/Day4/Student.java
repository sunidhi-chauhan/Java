package com.Day4;

public class Student {
	int roll;
    String name;
	int marks;
	

	void displayStudentDetails(int roll,String name,int marks) {
		System.out.println("Roll is:"+roll);
		System.out.println("Name is:"+name);
		System.out.println("Marks is:"+marks);
		
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.roll=35;
		s1.name="Sita";
		s1.marks=40;
		s1.displayStudentDetails(s1.roll,s1.name,s1.marks);
		
		
		Student s2=new Student();
		s2.roll=45;
		s2.name="Ram";
		s2.marks=67;
		s2.displayStudentDetails(s2.roll,s2.name,s2.marks);
		s1=null;//Eligible for garbage collector.
	    s2=null;
	   
	}

}
