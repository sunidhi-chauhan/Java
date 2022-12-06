package com.day8;
//Compute Sum and Average of Array Elements


public class WeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number= {2,-9,0,5,12,-25,22,8,12};
		
		int sum=0;
	   double avg;
	   
	   
	   for(int num:number) {
		   sum=sum+num;
	   }
	   avg=(double) sum/number.length;
	   
	   System.out.println("sum="+sum);
	   System.out.println("Average=" +avg);

	}

}
