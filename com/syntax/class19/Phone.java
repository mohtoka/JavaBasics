package com.syntax.class19;

public class Phone {
	
	//instance
	String model, color;
	int memory;
	double price;
	
	//static variables
	static String brand = "Apple";
	static String OS = "iOS";
	static boolean touchScreen = true;
	
	void displayInfo() {
		System.out.println("iPhone belongs to brand " + brand 
				+ " and had OS " + OS 
				+ " and all iPhones have touchscreen = " + touchScreen);
	}
	
	void displayDetails() {
		System.out.println("We built iPhone " + model 
				+ " with memory= " + memory 
				+ " in color " + color 
				+ " for price: " + price );
		
	}
	
	

}
