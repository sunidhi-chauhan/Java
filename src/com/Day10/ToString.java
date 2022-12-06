package com.Day10;
//This method belong to Object class and Object class belong to java.lag package
public class ToString {
	
	@Override
	public String toString()
	{
		return "welcome to java";
	}
	
	
	 public static void main(String[] args) {
		 ToString obj = new ToString();
		 
		  String s = obj.toString();
		  
		  System.out.println(s);//hashcode of the address
		  System.out.println(obj);//same output hashcode 
	 }
	 

}
