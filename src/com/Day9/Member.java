package com.Day9;
/* Q3) Create a class named 'Member' having the following members:
● Name : String
● Age : int
● Phone number : String
● Address : String
● Salary : double
It also has a method named 'printSalary' which prints the salary of the members.
Create two classes 'Employee' and 'Manager' that inherits the 'Member' class.
The 'Employee' and 'Manager' classes have members :
● Specialisation : String
● Department : String
Now, create a Main class which has the main method in it and assign name, age, phone
number, address and salary to an employee and a manager by making an object of both of these
classes and print the same.

*/

public class Member {
	
	
	private String name;
	private int age;
	private String phnNumber;
	private String Address;
	private double salary;

	
	




public Member() {
		super();
		// TODO Auto-generated constructor stub
	}







public Member(String name, int age, String phnNumber, String address, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phnNumber = phnNumber;
		Address = address;
		this.salary = salary;
	}







public String getName() {
	return name;
}







public void setName(String name) {
	this.name = name;
}







public int getAge() {
	return age;
}







public void setAge(int age) {
	this.age = age;
}







public String getPhnNumber() {
	return phnNumber;
}







public void setPhnNumber(String phnNumber) {
	this.phnNumber = phnNumber;
}







public String getAddress() {
	return Address;
}







public void setAddress(String address) {
	Address = address;
}







public double getSalary() {
	return salary;
}







public void setSalary(double salary) {
	this.salary = salary;
}







void printSalary()
{
	System.out.println("Salary is: "+salary);
}



}
