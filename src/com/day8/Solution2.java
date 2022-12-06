package com.day8;

import java.util.Scanner;

/* Even Sum in Columns
Description
● You have to create a 2D array, whose dimensions are N, M, and take the input from the user.
● The value stored in N denotes the number of rows, and the value in M denotes the number of
columns
● If the array looks like arr = [1,2,3],[4,5,6],[7,8,9]
● For all columns, you have to print the sum of even elements present in the column
4 (Even numbers in the column are, [4]. Therefore, the sum becomes 4)
10 (Even numbers in the row are, [2,8]. Therefore, the sum becomes 10)
6 (Even numbers in the row are, [6]. Therefore, the sum becomes 6)*/

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of rows:");
		int N = sc.nextInt();
		
		System.out.println("Enter no of columns:");
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		int a = 1;
		
		for(int i=0; i<M;i++)
		{
			for(int j=0; j<N ;j++)
			{
				arr[i][j] = a;
				
				System.out.print(arr[i][j]+" ");
				
				a++;
			}
			System.out.println();
		}
		
		System.out.println("******Output**********");
		
		for(int j=0; j<M; j++)
		{
			int sum=0;
			for(int i=0; i<N; i++)
			{
				
				if(arr[i][j]%2==0)
				{
					sum+=arr[i][j];
				}
				
			}
			System.out.println(sum);
			
		}
		
		

	}

}
