package com.syntax.class19;

public class AppleStore {
	
	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		
		iphone.model = "11 Pro";
		iphone.memory = 256;
		iphone.color = "Green";
		iphone.price = 1299.99;
		
		iphone.displayInfo();
		iphone.displayDetails();

		
		
	}

}
