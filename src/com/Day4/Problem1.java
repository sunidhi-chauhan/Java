//Q1) Differentiate between static and non-static variables?
//Taking input taking form the user.
package com.Day4;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*static variables:it is also name as class variables, we can access static variables 
		directly into the main methods.
		
		Non-Static:it's also name as Instance variables,we can't access non-static variables into the
        main methods directly, to access them we need to create object of that class.
		*/
		Scanner scan= new Scanner(System.in);
		int i=scan.nextInt();
		int j=scan.nextInt();
		int k=i+j;
		System.out.println(k);
		

	}

}
