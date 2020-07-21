package com.syntax.class25;

public class ComputerTest {

	public static void main(String[] args) {

		Computer[] comp = { new Computer("Comp"), 
							new Apple("Apple"), 
							new Lenovo("Lenovo"), 
							new HP("HP"),
							new Dell("Dell") };

		for (Computer c : comp) {
			System.out.println("--------------" + c.name + "--------------");
			c.turnOn();
			c.type();
			c.turnOff();

		}

	}

}
