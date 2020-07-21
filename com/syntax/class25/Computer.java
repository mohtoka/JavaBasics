package com.syntax.class25;

public class Computer {
	String name;
	
	public Computer(String name) {
		this.name = name;
	}
	
	public void turnOn() {
		System.out.println("Computer is on");
	}
	public void type() {
		System.out.println(name + " can type");
	}
	public void turnOff() {
		System.out.println(name + " is off");
	}

}
class Apple extends Computer{
	public Apple(String name) {
		super(name);
	}
	public void turnOn() {
		System.out.println(name + " is on");
	}
}
class Lenovo extends Computer{
	public Lenovo(String name) {
		super(name);
	}
	public void turnOn() {
		System.out.println(name + " is on");
	}
}
class HP extends Computer{
	public HP(String name) {
		super(name);
	}
	public void turnOn() {
		System.out.println(name + " is on");
	}
}
class Dell extends Computer{
	public Dell(String name) {
		super(name);
	}
	public void turnOn() {
		System.out.println(name + " is on");
	}
}