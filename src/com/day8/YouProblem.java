//Write a non-static method inside class Main, which will take an initialized integer array and return the
//largest number from the supplied array. call this method from the main method of main class by
//supplying an initialized integer array and print the returned result.

package com.day8;

public class YouProblem {
	
	//int[] a= {12,20,30,40};
	
	int fun1(int[] arr)
	{
		System.out.println("Inside the fun1");
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num<arr[i])
			{
				num=arr[i];
			}
		}
		
		return num;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		YouProblem obj=new YouProblem();
		
//		int[] arr5=new int[]{45,12,22,33};
//		
//		int result=obj.fun1(arr5);
//		System.out.println(result);
		
		//declaration of an array=====
		int[] arr6= {12,23,45,56};
		
	
//	 int result=obj.fun1(arr6);
//	 System.out.println(result);
		

	}

}
