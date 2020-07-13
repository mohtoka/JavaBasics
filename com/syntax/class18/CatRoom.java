package com.syntax.class18;

public class CatRoom {
	
	public static void main(String[] args) {
		
		Cat loaf = new Cat();
		loaf.name = "Destiel";
		loaf.color = "Black and White";
		loaf.age = 7;
		
		Cat molly = new Cat();
		molly.name = "Molly";
		molly.color = "Brown";
		molly.age= 2;
		
		Cat chino = new Cat();
		chino.name = "Chino";
		chino.color = "Orange";
		chino.age = 1;
		
		System.out.println(loaf.name);
		System.out.println(molly.color);
		
		loaf.name = "Loaf";
		System.out.println(Cat.paws);
		System.out.println(molly.paws);
		
		//when static value changes for 1 obj, changes for all objs
		chino.paws = 6;
		
		loaf.displayInfo();
		molly.displayInfo();
		chino.displayInfo();
	}

}
