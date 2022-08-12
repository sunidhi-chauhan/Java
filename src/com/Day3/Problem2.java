/*Q2) The prime factors of a number are all of the integers below that number that are
divisible into the number as well as 1. For example, the prime factors of 12 are 1,2,3,4,6,
and 12.
● Write a Java class with a static method that will take a number and print all the prime factorial
of that number.
● The Supplied number should be between 2 and 100. otherwise, it should print “Invalid
number”.
● Call this method from the main method by supplying any valid argument.*/

package com.Day3;

public class Problem2 {
	
	static void PrimeFactorial(int n) {
		
		if(n>100)
		{
			System.out.println("Invalid number");
		}
		else
		{
		
		for(int div=2;div*div<n;div++)
		{
			while(n%div==0) {
			n=n/div;
			System.out.print(div+" ");
			}
			
		}
		if(n!=1)
		{
			System.out.print(n);
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int n=12;
			PrimeFactorial(n);
			
		}
	}



