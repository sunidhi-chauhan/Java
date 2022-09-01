package com.Day5;

public class CheckWeather {
	

	public static void main(String[] args) {
		
    boolean isSnowing=true;
    boolean isRaining=true;
    double tempreature=60.0;
    
    if(isSnowing && isRaining && tempreature<50)
    {
    	System.out.println(" Let's stay home.");
    }
    else
    {
    	System.out.println("Let's go out");
    }
    
    
    
	}

}
