package com.day8;

import java.util.Scanner;
 
public class Demo {
	
	void fun2(Student[] students){
		
		if(students!=null)
		{
		
		System.out.println("Inside fun1() of Demo");
		
		
		for(Student student:students) {
			
			System.out.println("Roll is :"+ student.getRoll_no());
			
			System.out.println("Name is: "+ student.getName());
			
			System.out.println("==================================");
		}
		}
		
		else
			System.out.println("null is not allowed");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Demo d1=new Demo();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many students?");
		int num=sc.nextInt();
		
		Student[] students=new Student[num];
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println("Enter details of student"+(i+1));
			
			System.out.println("Enter roll:");
			int roll=sc.nextInt();
			
			System.out.println("Enter name:");
			String name=sc.next();
			
//			students[i]=new Student(roll,name);
			
			students[i] =new Student();
			students[i].setRoll_no(roll);
			students[i].setName(name);
		}
		
		
		d1.fun2(students);
		

	}

}
