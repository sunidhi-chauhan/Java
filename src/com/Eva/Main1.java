/*Q4) Write a Java class with a static method that will take 5 positive numbers as a parameter which will represent:
1s, 2s, 3s, fours and sixes scored by the bats man.
● implement the static runScored method to compute the total run scored by that bats man.
● Call this method from the main method of that class and print the result.
*/
package com.Eva;

public class Main1 {
	public static void runScored(int one,int two,int three,int four,int six) {

		int result=one+two+three+four+six;
		System.out.println(result);
	}

	public static void main(String[] args) {
	    int one=1;
	    int two=2;
	    int three=3;
	    int four=4;
	    int six=6;
		runScored(one,two,three,four,six);
  
	}

}
