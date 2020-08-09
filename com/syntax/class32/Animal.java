package com.syntax.class32;

public abstract class Animal {
	
	protected String type, color;							//instance variables
	
	public Animal(String type, String color){				//constructor(with parameters)
		this.type = type;
		this.color = color;
	}
	
	abstract void eat();									//abstract methods(unimplemented)
	abstract void sleep();
}
class Dog extends Animal{
	public Dog(String type, String color) {
		super(type, color);
	}
	
	void eat() {
		System.out.println(type + " eats bones");
	}
	void sleep() {
		System.out.println(type + " sleeps at home");
	}
}
class Zebra extends Animal{
	public Zebra(String type, String color) {
		super(type, color);
	}
	protected void eat() {
		System.out.println(type + " eats grass");
	}
	protected void sleep() {
		System.out.println(type + " sleeps");
	}
}
class Monkey extends Animal{
	public Monkey(String type, String color) {
		super(type, color);
	}
	void eat() {
		System.out.println(type + " eats bananas");
	}
	void sleep() {
		System.out.println(type + " sleeps on trees");
	}
}