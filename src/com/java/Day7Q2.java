/*Q2) Write a Java program to get the character at the given index within the String.Take 
       the input with the help of Scanner class

     Sample Output:
     
       Enter the String:
     “Java Exercises”
    Enter the character position you want to access:
      2
    Character at position 2 is :
      v
*/
package com.java;
import java.util.Scanner;

public class Day7Q2 {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String sunidhi=s.nextLine(); //Read user input and store in sunidhi varaibale.
		
		System.out.println("Enter the character position you want to access:");
		
		int position=s.nextInt();
		
		char c=sunidhi.charAt(position);//charAT will work on string
		System.out.println(" Character at position 2 is :"+c);
	}

}
