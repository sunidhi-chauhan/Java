////Creating an integer array with some value and printing each elements from that array


package com.day8;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//create an array
		int[] marks= {40,50,55,60};
		
		//Access each array elements
		
//		System.out.println("Assesing Elements of array:");
//		System.out.println("First Elements:"+marks[0]);
//		System.out.println("Second Elements:"+ marks[1]);
//		System.out.println("Third Elements:"+marks[2]);
//		System.out.println("Fourth Elements:"+marks[3]);
//		System.out.println("Fifth Elements:"+marks[4]);
		
		
		
		//loop through the array
//		for(int i=0;i<marks.length;i++)
//		{
//			System.out.println(marks[i]);
//		}
		
		
		//iterate through the for-each
		
		for(int m:marks)
		{
			System.out.println(m);
		}

	}
	
	

}
