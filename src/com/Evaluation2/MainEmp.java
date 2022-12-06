package com.Evaluation2;

import java.util.Scanner;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Id :");
		 int id=sc.nextInt();
		 
		 System.out.println("Enter Name:");
		 String name=sc.next();
		 
//		 sc.nextLine();
		 
		 System.out.println("Enter Salary:");
	     double salary =sc.nextDouble();
	     
	     System.out.println("Enter PF");
	     int pfPercentage=sc.nextInt();
	     
	     Employee e1=new Employee();
	     
	     
	     e1.setEmployeeId(id);
	     e1.setEmployeeName(name);
	     e1.setSalary(salary);
	     
	     e1.calculateNetSalary(pfPercentage);
	     
	     
	     System.out.println("==================================");
	     
	     System.out.println("===Employee Details===========");
	     
	     System.out.println("----------------------------------");
	     
	     System.out.println("Is: "+e1.getEmployeeId());
	     System.out.println("Name: "+e1.getEmployeeName());
	     System.out.println("Salary: "+ e1.getSalary());
	     System.out.println("Net Salary: "+e1.getNetSalary());
		

	}

}
