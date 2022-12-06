package com.day8;


public class SafeMethod {
	
	
	void fun2(int[] marks)
	
	{
		
		if(marks!=null) {
		System.out.println("Inside fun1 method");
		int total=0;
		
		for(int m:marks) {
			total+=m;
		}
		
		System.out.println("Total is:"+ total);
	}
	
	else
	
		System.out.println("null is not allowed");
	
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		SafeMethod d1=new SafeMethod();
		
		int[] nums={100,120,150,180,200};
		d1.fun2(nums);
		 
		 
		 

	}

}
