package com.Day4;

public class Lion {
	String name;
	boolean isHungry;
	int age;
	
	static int totalDeaths;
	
	static void printKillings(int totalDeaths) {
		System.out.println("Total killings by lions in jungle = "+ totalDeaths);

	}
	void thinking(String name,boolean isHungry,int age) {
		if(isHungry==false)
		{
			System.out.println(name+" "+"is sleeping");
		}
		
		 if(isHungry && age>12)
		{
			totalDeaths+=2;
			System.out.println(name+ " "+"has killed two animals");
		}
	   if(isHungry&& age<=12 && age >=2)
		{
			totalDeaths+=1;
			System.out.println(name+" "+ "has killed one animal");
		}
	   
		 if(isHungry && age<2 )
		{
			System.out.println(name + "is calling Mom");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion lion1= new Lion();
		lion1.name="Lion1";
		lion1.isHungry=false;
		lion1.age=5;
		lion1.thinking(lion1.name,lion1.isHungry,lion1.age);
		
		
		Lion lion2= new Lion();
		lion2.name="Lion2";
		lion2.isHungry=true;
		lion2.age=13;
		lion2.thinking(lion2.name,lion2.isHungry,lion2.age);
		
		Lion lion3= new Lion();
		lion3.name="Lion3";
		lion3.isHungry=true;
		lion3.age=16;
		lion3.thinking(lion3.name,lion3.isHungry,lion3.age);
		
		printKillings(totalDeaths);

	}

}
