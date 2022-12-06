package com.Day10;

public class Bank {
	
	 private Bank(){
	      System.out. println("Inside private constructor of Bank");
	   }

	 
	 
	 static Bank method() {
		 
		 return new Bank();
		 
	 }

}
