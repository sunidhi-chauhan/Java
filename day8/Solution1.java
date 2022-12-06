package com.day8;
 
import java.util.Scanner;

//Q1) Write the logic to reverse the String given in the parameter without the help of predefined
//reverse method and return the reversed String:(HINT use Array)
public class Solution1 {
	
	public static String reversString(String input){
		//write the logic
		
		//int len=input.length();
		String bag="";
		for(int i=0;i<input.length();i++)
		
		bag=input.charAt(i)+bag;
		
		return bag;
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String You want to reverse: ");
		String orignalString = sc.next();
		String result=reversString(orignalString);
		
		System.out.println("Orignal string is :"+orignalString);
		System.out.println("Reversed String is :"+result);
		
	
		
	}

}
