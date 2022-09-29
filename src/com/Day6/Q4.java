package com.Day6;

public class Q4 {

	public static void main(String[] args) {
		
		CarQ4 obj1=new CarQ4();
		CarQ4 obj2=new CarQ4("Harrier","Tata","black");
		
		
		System.out.println("================================");
	
		Engine e=new Engine();
		e.rpm=10000;
		e.power=110;
		e.manufacturer="tata";
		
		
		System.out.println("Car RPM:"+e.rpm);
		System.out.println("Car Power:"+e.power);
		System.out.println("Car Engine Manufacture:"+e.manufacturer);
		
		
		Engine.Turbo(true);
		
		
		
		 
	}

}
