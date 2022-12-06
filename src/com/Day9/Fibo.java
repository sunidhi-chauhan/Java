package com.Day9;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0,1,1,2,3,5,8
		
	int n=6;	
	int a=0;
	int b=1;
	
	
	for(int i=1; i<=n; i++)
	{
		int c=a+b;
		
		a=b;
		b=c;
		
	}
		System.out.println(b);
		

	}

}
