package com.syntax.class13;

public class HWFactory {
	public static void main(String[] args) {

		Phone iphone = new Phone();
		Phone samsung = new Phone();
		Phone nokia = new Phone();

		iphone.make = "11";
		samsung.make = "Flip";
		nokia.make = "Indestructable";
		
		iphone.model = "Max";
		samsung.model = "Fone";
		nokia.model = "Vessel";
		
		iphone.price = 1000;
		samsung.price = 999;
		nokia.price = 5;
		
		iphone.call();
		iphone.text();
		iphone.takePictures();
		
		samsung.call();
		samsung.text();
		samsung.takePictures();
		
		nokia.call();
		nokia.text();
		nokia.takePictures();
		
		
	}
}
