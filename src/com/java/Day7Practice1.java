package com.java;
//There are two ways to create string object....
//1-String literal
//2-new keyword
public class Day7Practice1 {

	public static void main(String[] args) {
		
		//string literal
		String a="Sunidhi";//literal===create one object in CPA
		System.out.println(a);
		
		String b="Sunidhi";//literal===it will check in string constant pool area if it match thn refer it.
		System.out.println(b);
		
		a=a.concat("chauhan");// jabsdasti mutable krte hai..making new object of a now jvm knows add chauhan with new object.
		System.out.println(a);
		

	}

}
