package com.Day10;

public class Main {
	
	public static Person generatePerson(Person person) {
		
		
		
			return  person;
		
	
	}
	

	public static void main(String[] args) {
		
		
		Person newStudent = generatePerson(new Student());

		Person newInstuctor = generatePerson(new Instuctor());

		System.out.println(newStudent);
		System.out.println(newInstuctor);

		
		
		
		

	}

}
