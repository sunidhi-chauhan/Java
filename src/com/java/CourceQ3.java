/*Q3) Create a class Course with 3 instance variables:
1.courseId: int
2. courseName: String
3. courseFee: int

● Define a non-static method inside the Course class as follows:
   displayCourseDetails: void
Inside the above method print all the details of the course.


● Define a static method inside the Course class
   authenticate: void
     This method will take 2 parameters:
         username: String
         password: String

Implement this authenticate() method as follows:
   If the supplied username is "Admin" and the password is "1234" then inside this method create
   the Course class object by taking details from the user using scanner class. Set the value of
   courseId, courseName, courseFee on that object and call the displayCourseDetails() method on
   that course object. Otherwise, print "Invalid Username or password"


● Define the main method inside the Course class and call the authenticate() method 2 times first
   time with a valid username and password and the second time with an invalid username and
   password.
*/

package com.java;
import java.util.Scanner;

public class CourceQ3 {
	
	int courceId;
	String courceName;
	int courceFee;

	public void displayCourceDetails(){
		
		System.out.println(this.courceId);
		System.out.println(this.courceName);
		System.out.println(this.courceFee);	
	}
	
	public static void authenticate() {
		
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
		System.out.println("Enter user name");
		String username=scan.next();
		System.out.println("Enter Password");
		String password=scan.next();
		
		if(username.equals("Admin")&& password.equals("1234"))
		{
			CourceQ3 c=new CourceQ3();
			c.courceId=101;
			c.courceName="Java Developer";
			c.courceFee=20000;
			c.displayCourceDetails();
		}
		else
		{
			System.out.println("Invalid Username or Password");
		}
		
	}
	}
	
	public static void main(String[] args) {
		
		authenticate();
		}
		

}
