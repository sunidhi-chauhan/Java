package com.Evaluation2;

public class Cpu {
	
	private String manufacturer;
	private String processor;
	private String clockSpeed;
	
	Cpu(){
		
	}
	
	Cpu(String manufacturer,String processor ,String clockSpeed){
		this.manufacturer=manufacturer;
		this.processor=processor;
		this.clockSpeed=clockSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(String clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	
	
}
