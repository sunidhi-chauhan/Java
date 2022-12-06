package com.Day9;

import  java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Manager mg = new Manager();
		Employee emp = new Employee();
		
		
		
		
		
		System.out.println("Enter Manager details:");
		
		System.out.println("Manager Department:");
		String dep = sc.next();
		mg.setDepartment(dep);
		
		System.out.println("Manager Specialisation");
		String specialsation = sc.next();
		mg.setSpecialisation(specialsation);
		
		
		System.out.println("Enter the name");
	     String name = sc.next();
	     mg.setName(name);
	     
	     
	     System.out.println("Enter the age");
	     int age = sc.nextInt();
	     mg.setAge(age);
	    
	     
	     System.out.println("Enter the phone number");
	     String phnNumber = sc.next();
	     mg.setPhnNumber(phnNumber);
	     
	     
	     System.out.println("Enter the address");
	     String address = sc.next();
	     mg.setAddress(address);
	     
	     System.out.println("Enter the salary");
	     int salary = sc.nextInt();
	     mg.setSalary(salary);
	     
	     
	     
	     
	     System.out.println("Enter Employee details:");
			
			System.out.println("Employee Department:");
			String empDep = sc.next();
			emp.setDepartment(dep);
			
			System.out.println("Employee Specialisation");
			String empSpecialsation = sc.next();
			emp.setSpecialisation(specialsation);
			
			
			System.out.println("Enter the name");
		    String empName = sc.next();
		    emp.setName(name);
		     
		     
		     System.out.println("Enter the age");
		     int empAge = sc.nextInt();
		     emp.setAge(age);
		    
		     
		     System.out.println("Enter the phone number");
		     String empPhnNumber = sc.next();
		     emp.setPhnNumber(phnNumber);
		     
		     
		     System.out.println("Enter the address");
		     String empAddress = sc.next();
		     emp.setAddress(address);
		     
		     System.out.println("Enter the salary");
		     int empSalary = sc.nextInt();
		     emp.setSalary(salary);
	     
		
		
		     //Print
		     
		     System.out.println("****Manager Details:****");
		     System.out.println("Specialisation :- "+mg.getSpecialisation());
		     System.out.println("Department :- "+mg.getDepartment());
		     System.out.println("Name        :- "+mg.getName());
		     System.out.println("Age          :-"+mg.getAge());
		     System.out.println("Phone Number     :-"+mg.getPhnNumber());
		     System.out.println("Address      :-"+ mg.getAddress());
		     System.out.println("Salary       :- "+mg.getSalary());
		     
		     
		     System.out.println("**********************************************");
		     
		     System.out.println("*******Employee Details:*******");
		     System.out.println("Specialisation :- "+emp.getSpecialisation());
		     System.out.println("Department :- "+emp.getDepartment());
		     System.out.println("Name        :- "+emp.getName());
		     System.out.println("Age          :-"+emp.getAge());
		     System.out.println("Phone Number     :-"+emp.getPhnNumber());
		     System.out.println("Address      :-"+ emp.getAddress());
		     System.out.println("Salary       :- "+emp.getSalary());
		     
		  
	}

}
