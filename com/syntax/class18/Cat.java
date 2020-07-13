package com.syntax.class18;

public class Cat {

	//INSTANCE variables
	String name, color;
	int age;
	
	//STATIC variables
	static boolean tail = true;
	static int paws = 4;

	void displayInfo() {
		System.out.println("Name of cat is " + name + " and the cat is " + color + " and is " + age + " years old and has "
				+ paws + " paws");
	}
}
