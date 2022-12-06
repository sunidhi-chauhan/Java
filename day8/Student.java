package com.day8;

public class Student {
	
	private int roll_no;
	private String name;
	
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Student() {
		
	}

	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	
	public void printDetails() {
		System.out.println("Roll is :"+roll_no+" Name is:"+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Main{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Student[] students=new Student[3];//here total 4 object is created in the memory one for the student array object and three for the student object.
//		
//		students[0]=new Student(10,"Ram");
//		
//		students[1]=new Student(20,"Ramesh");
//		
//		students[2]=new Student(30,"Laxman");
		
		//The above student array we can create by using curly bracket also.
		Student[] students= {new Student(10,"Ram"),new Student(20,"shyam"),new Student(60,"Amit")};
		
		
		
		for(Student student:students) {
			
			student.printDetails();
			
		}
		

	}
	
}