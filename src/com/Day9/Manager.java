package com.Day9;

public class Manager extends Member {
	
	String Specialisation;
	
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

	String Department;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, String phnNumber, String address, double salary) {
		super(name, age, phnNumber, address, salary);
		// TODO Auto-generated constructor stub
	}

	

	
	
	


}
