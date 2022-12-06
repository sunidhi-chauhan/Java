/* Q2) Create a Java Bean class Student with 3 private fields:
a. rollNumber
b. studentName
c. marks
And should have the following members also:
a. Zero-argument constructor
b. Parameterized overloaded constructor with all 3 fields.
c. public getter and setter method for the above 3 fields */

package com.Evaluation2;

public class Evaluation2Q2 {
	
	private int rollNumber;
	private String studentName;
	private int marks;
	
	public Evaluation2Q2(){
		
	}

	public Evaluation2Q2(int rollNumber, String studentName, int marks) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.marks = marks;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	

}
