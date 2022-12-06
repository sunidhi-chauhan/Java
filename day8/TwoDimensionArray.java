package com.day8;


public class TwoDimensionArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Example1	
		int[][]a= {
		{1, -2, 3},
		{-4 ,-5 ,6 ,9},
		{7},
     };

		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.println(a[i][j]);
			}	
		
			
	//Print the above 2d array using for..each loop.
			
			for(int[] ar:a) {
				
				for(int k:ar)
				{
					System.out.print(k);
				}
				System.out.println();
			}
			
	//==================================================	
		
		
//		int[][] a=new int[4][4];
		

//		for(int i=0; i<a.length; i++)
//		{
//			for(int j=0; j<a[i].length; j++)
//			{
//				a[i][j]=j;
//			}
//		}
		

		
		
		//used Enhance for loop to access.
		
//		for(int[] ar:a)
//		{
//		for(int i:ar) {
//			
//		System.out.print(i+" ");	
//		
//		}
//		System.out.println();
//		}
//
	}
      
}
}
