package com.syntax.class23;

public class IceCream {
	
	String flavor, brand, color;
	
	public IceCream(String flavor, String brand, String color) {
		this.flavor = flavor;
		this.brand = brand;
		this.color = color;
	}
	
	


}
class Gelato extends IceCream{
	
	public Gelato(String flavor, String brand, String color) {
		super(flavor, brand, color);
	}
	
}