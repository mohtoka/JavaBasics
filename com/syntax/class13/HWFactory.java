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
		
		
		System.out.println("=============Dogs============");
		
		
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = new Dog();
		
		d1.breed = "Husky";
		d2.breed = "Bulldog";
		d3.breed = "Labrador";
		
		d1.color = "White";
		d2.color = "Brown";
		d3.color = "Blonde";
		
		d1.size = "Medium";
		d2.size = "Small";
		d3.size = "Large";
		
		d1.bark();
		d1.nap();
		d1.cuddle();
		
		d2.bark();
		d2.nap();
		d2.cuddle();
		
		d3.bark();
		d3.nap();
		d3.cuddle();
		
		
	}
}
