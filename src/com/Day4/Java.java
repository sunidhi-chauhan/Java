package com.Day4;

public class Java {
	
	void WholeNumber(int n) {
		 if(n<0) {
			System.out.println("Error");
		}
		
		 else if(n%2==1)
		{
			System.out.println(n);
		}
		else if(n%2==0)
		{
			
				int m=n%10;
				int p=10-m;
				System.out.println(n+p);	
		}	
	}
	

	public static void main(String[] args) {
		Java s1=new Java();
		int a=-4;
		s1.WholeNumber(a);

	}

}
