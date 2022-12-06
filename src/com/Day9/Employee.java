package com.Day9;

public class Employee  extends Member{
	
	String Specialisation;
	
	String Department;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String name, int age, String phnNumber, String address, double salary) {
		super(name, age, phnNumber, address, salary);
		// TODO Auto-generated constructor stub
	}


	public String getSpecialisation() {
		return Specialisation;
	}


	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	}


	public String getDepartment() {
		return Department;
	}


	public void setDepartment(String department) {
		Department = department;
	}


	
	
	
	
	

}
