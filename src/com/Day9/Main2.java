package com.Day9;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		///Hard code one way
		
		Animal[] arr = new Animal[3];
		
//		for(int i=0; i<arr.length; i++)
//		{
//		
//		arr[i] = new Dog();
//		arr[i] = new Cat();
//		arr[i] = new Tiger();
//		
//		
//		arr[i].eat();
//		arr[i].walk();
//		arr[i].makeNoise();
//		
//		System.out.println("*********************");
//		
//		
//		}
//		
//		arr[0].eat();
//		arr[0].walk();
//		arr[0].makeNoise();
//		
//		System.out.println("*********************");
//		
//		
//		arr[1].eat();
//		arr[1].walk();
//		arr[1].makeNoise();
//		
//		System.out.println("*********************");
//		
//		arr[2].eat();
//		arr[2].walk();
//		arr[2].makeNoise();
//		
//		System.out.println("*********************");
		
		
		
//		//Other way
		
		
//		//create an array of Animal class with size 3
		Dog dog = new Dog();
		Cat cat = new Cat();
		Tiger tiger= new Tiger();
		
		//initialize all 3 elements of this Animal class with
        //Dog, Cat and Tiger class object.
		
		Animal[] arrr = {dog,cat,tiger};
		//initialize all 3 elements of this Animal class with
        //Dog, Cat and Tiger class object.
		
		for(int i=0; i<arrr.length; i++)
		{
			arrr[i].eat();
			arrr[i].walk();
			arrr[i].makeNoise();
			
			System.out.println("********************");
		}
		
		
		
	}

}
