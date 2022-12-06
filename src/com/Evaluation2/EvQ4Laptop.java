/*Q4) Create a java bean class Laptop with the following members
String color;
String companyName;
String name;
String purpose;
CPU cpu;
GraphicCard graphicCard;
displayDetails() : void */

package com.Evaluation2;

public class EvQ4Laptop {
	
	private String color;
	private String companyName;
	private String name;
	private String purpose;
	private Cpu cpu; //Has-A relationship
	private GraphicCard graphicCard;//Laptop Has-A a graphicard...Has-A relationship.
	
	EvQ4Laptop(){
		
	}
	
	EvQ4Laptop( String color,String companyName,String name,String purpose,Cpu cpu,GraphicCard graphicCard){
		
		this.color=color;
		this.companyName=companyName;
		this.name=name;
		this.purpose=purpose;
		this.cpu=cpu;
		this.graphicCard=graphicCard;
		
	}
	
	
	
void displayDetails()
{
	System.out.println("Laptop Color =>"+color);
	System.out.println("Company Name => "+companyName);
	System.out.println("Laptop Name => "+name);
	System.out.println("Laptop Purpose => "+purpose);
	System.out.println("Cpu's Manufacturer =>"+cpu.getManufacturer());
	System.out.println("Cpu's Processor =>"+cpu.getProcessor());
	System.out.println("Cpu's ClockSpeed =>"+cpu.getClockSpeed());
	System.out.println("Graphic card's Manufacturer =>"+graphicCard.getManufacturer());
	System.out.println("Graphic card's Series =>"+graphicCard.getSeries());
	System.out.println("Graphic card's Capacity =>"+graphicCard.getCapacity());
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public String getCompanyName() {
	return companyName;
}



public void setCompanyName(String companyName) {
	this.companyName = companyName;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getPurpose() {
	return purpose;
}



public void setPurpose(String purpose) {
	this.purpose = purpose;
}



public Cpu getCpu() {
	return cpu;
}



public void setCpu(Cpu cpu) {
	this.cpu = cpu;
}



public GraphicCard getGraphicCard() {
	return graphicCard;
}



public void setGraphicCard(GraphicCard graphicCard) {
	this.graphicCard = graphicCard;
}

}
