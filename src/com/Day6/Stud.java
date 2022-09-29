package com.Day6;

public class Stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
		BeanClass b1=new BeanClass(10,"Ram",780);
		
		BeanClass b2=new BeanClass();
		
		b2.setRoll(23);
		b2.setName("Sita");
		
		
		System.out.println("Roll no is:"+b2.getRoll());
		System.out.println("Name is:"+b2.getName());
		
		
		System.out.println("=================");
	
		System.out.println("Roll no is:"+b1.getRoll());
		System.out.println("Name is:"+b1.getName());
		

	}

}
