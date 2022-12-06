package com.Evaluation2;

import java.util.Scanner;

public class Main {
	
	
	public static EvQ4Laptop getLaptop(String laptopPurpose){
		
		if(laptopPurpose.equals("gaming"))
		{
			EvQ4Laptop gamingLaoptop=new EvQ4Laptop();
			
			System.out.println("Laptop details:");
			gamingLaoptop.setColor("Black");
			gamingLaoptop.setCompanyName("Radeon");
			gamingLaoptop.setPurpose("gaming");
			gamingLaoptop.setName("Acer");
			
			
			Cpu cpu=new Cpu("Radeon","Ryzen 95800H","3200");
			
			gamingLaoptop.setCpu(cpu);
			
			GraphicCard graphic=new GraphicCard("Radeon","RTX 3050 Ti","15GB");
			
			gamingLaoptop.setGraphicCard(graphic);
			
			return gamingLaoptop;
			
			
		}
		else if(laptopPurpose.equals("business"))
		{
			EvQ4Laptop businessLaptop = new EvQ4Laptop();
			  System.out.println("Laptop details:");
			   businessLaptop.setColor("Rose Gold");
			   businessLaptop.setCompanyName("HP");
			   businessLaptop.setPurpose("business");
			   businessLaptop.setName("Aero 13");
			   
			   Cpu cpu = new Cpu("Intel","i5 10210U", "1800");
			   businessLaptop.setCpu(cpu);
			   GraphicCard graphic = new GraphicCard("Intel", "Lris Xe","Inegrated");
			   businessLaptop.setGraphicCard(graphic);
			   
			   return businessLaptop;
			   
		}
		else
		
		return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("==================================");
		System.out.println(" Please Enter the Purpose: ");
		String purpose=sc.nextLine();
		
		EvQ4Laptop laptop=getLaptop(purpose);
		
		if(laptop!=null) {
			
			laptop.displayDetails();
		}
		else
			System.out.println("Please Enter the correct Purpose");
		

	}
	}
}
