package com.Evaluation2;

public class GraphicCard {

	private String manufacturer;
	private String capacity;
	private String series;
	
	GraphicCard(){
		
	}
	
	GraphicCard(String manufacturer,String capacity,String series)
	{
		this.manufacturer=manufacturer;
		this.capacity=capacity;
		this.series=series;
		
	}
	
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	

}
