package com.day8;

import java.util.Arrays;

/*Create the object of Main class
on the object of Main class call the findAndReturnPrimeNumbers method
by supplying the following array as the parameter
int[] arr = {10,12,5,50,11,14,15};
print each element from the returned array of findAndReturnPrimeNumbers method
if findAndReturnPrimeNumbers method returns an empty array then print the following
message:
"Prime number not found in the supplied Array" */

public class Solution3 {
	
	public int[] findAndReturnPrimeNumbers(int[] inputArray)
	{
		int[] secondArray= {};
		int l=0;
		for(int i=0;i<inputArray.length; i++)
		{
			int count=0;
			
			for(int k=2;k<=inputArray[i];k++) 
			{
				if(inputArray[i]%k==0)
				{
					count++;
				}
			}
			if(count==1)
			{
				l++;
				
				 secondArray = Arrays.copyOf(secondArray, l);
				
				secondArray[l-1] = inputArray[i];
			}
		}
		
		
		return secondArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution3 obj = new Solution3();
		
		int[] arr= {10,12,5,50,11,14,15,13};
		 
		int[] result = obj.findAndReturnPrimeNumbers(arr);
		
		if(result==null)
		{
			System.out.println("Prime number not found in the supplied Array" );
		}
		else
		{
			for(int i=0;i<result.length;i++)
			{
				System.out.print(result[i]+" ");
			}
		}
		

	}

}
