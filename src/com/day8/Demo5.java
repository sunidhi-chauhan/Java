package com.day8;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number How many student Objects need to be created");
		
		int n = sc.nextInt();
		
		Student5[] student = new Student5[n];
		
		for(int i=0;i<student.length;i++)
		{
			System.out.println("Enter Roll Number :");
			int roll = sc.nextInt();
			
			
			System.out.println("Enter Name :");
			String name =sc.next();
			
			
			System.out.println("Enter Address : ");
			String address = sc.next();
			
			System.out.println("Enter Marks : ");
			int marks = sc.nextInt();
			
		
			student[i] = new Student5();
			student[i].setRoll(roll);
			student[i].setName(name);
			student[i].setAddress(address);
			student[i].setMarks(marks);
		}
		
		for(int j=0; j<student.length;j++)
		{
			
			
			System.out.println("Student Roll :"+student[j].getRoll());
			System.out.println("Student Name :"+student[j].getName());
			System.out.println("Student address :"+student[j].getAddress());
			System.out.println("Student marks :"+student[j].getMarks());
			
		}
		
		System.out.println("*******output***********");
		
		float total=0;
		for(int m=0; m<student.length ; m++)
		{
			 total=total+student[m].getMarks();
		}
		
		total=total/student.length;
		
		System.out.println("Average of all the Student marks is:"+total);

	}
      
}
