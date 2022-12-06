package com.day8;

public class Demo1 {
	
	Student[] getStudents(String username,String password)
	{
		
		if(username.equals("admin") && password.equals("123"))
		{
			
			//we can connect with DB and get multiple student object from the DB and return them
			//in the form an array.
			
			Student[] students=new Student[3];
			
			
				students[0]=new Student(10,"N1");
				students[1]=new Student(11,"N2");
				students[2]=new Student(12,"N3");
			
			
			return students;
		}
		
		else
			return null;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Demo1 d1=new Demo1();
		
	Student[] students 	=d1.getStudents("admin", "123");
//	Object obj 	=d1.getStudents("admin", "123");
	
	
	if(students!=null)
	{
		for(Student student:students) {
			System.out.println("Roll is: " +student.getRoll_no());
			System.out.println("Name is :"+student.getRoll_no());
			
			System.out.println("================================");
		}
		
		
	}
	else
		System.out.println("invalid username or password...");
	
	}

}
