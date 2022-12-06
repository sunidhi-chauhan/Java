/* 
  2. Create the Main class with the main method and inside the main method do the
following things:
a. Ask the User about the number of students he wants to add. (use Scanner class to take the input).
b. With the help of the Scanner class take the input for rollNumber,
studentName, and marks for each student.
c. With these inputs compose the required objects of the Student class by using the
parameterized constructor.
d. With the help of getter methods print all the details of the student from the
above Student object.


Sample output =>
Enter Number of Students you want to enter
2
===========================================
Enter the Roll Number :
1
Enter the Name :
Sam
Enter the marks :
567
Student Detail 01
Student Roll Number:567.0
Student Name:Sam
Student Mark:567.0
==================================
Enter the Roll Number :
2
Enter the Name :
Ram
Enter the marks :
669
Student Detail 11
Student Roll Number:669.0
Student Name:Ram
Student Mark:669.0
==================================

  */

package com.Evaluation2;

import java.util.Scanner;

public class EvQ2Main {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Number of students you want to Add");
		int num=scan.nextInt();
		System.out.println("========================================");
		for(int i=1;i<=num;i++) {
			
		
		System.out.println("Enter the RollNumber");
		int rollNumber=scan.nextInt();
		
		System.out.println("Enter the studentName");
		String studentName=scan.next();
		
		System.out.println("Enter the Marks");
		int marks=scan.nextInt();
		
		Evaluation2Q2 obj=new Evaluation2Q2(rollNumber,studentName,marks);
		
		System.out.println("Student Detail:"+i);
		System.out.println("Student Roll Number:"+obj.getRollNumber());
		System.out.println("Student Name:"+obj.getStudentName());
		System.out.println("Student Mark:"+obj.getMarks());
		
//		System.out.println("Student Roll Number:"+rollNumber);
//		System.out.println("Student Name:"+studentName);
//		System.out.println("Student Mark:"+marks);
		
		
		System.out.println("==========================================");
		
		
		
		
		}
	}

}
