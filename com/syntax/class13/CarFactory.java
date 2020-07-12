package com.syntax.class13;

public class CarFactory {

	public static void main(String[] args) {

		System.out.println("-----------Car 1-----------");

		Car c1 = new Car();
		c1.make = "Tesla";
		c1.model = "X";
		c1.color = "Red";
		c1.year = 2020;
		c1.speed = 200;

		System.out.println(	"Make is " + c1.make + 
							" and model is " + c1.model + 
							" and color is " + c1.color + 
							" and year is " + c1.year + 
							" and speed is " + c1.speed);
		
		c1.drive();
		c1.reverse();
		c1.transportPeople();
		
		System.out.println("-----------Car 2-----------");
		
		Car c2 = new Car();
		c2.make = "BMW";
		c2.model = "A";
		c2.color = "White";
		c2.year = 2018;
		c2.speed = 150;
		
		System.out.println(	"Make is " + c2.make + 
							" and model is " + c2.model + 
							" and color is " + c2.color + 
							" and year is " + c2.year + 
							" and speed is " + c2.speed);
		
		c2.drive();
		c2.reverse();
		c2.transportPeople();
		
		System.out.println("-----------Car 3-----------");

		Car c3 = new Car();
		c3.make = "Toyota";
		c3.model = "Camry";
		c3.color = "Blue";
		c3.year = 2019;
		c3.speed = 180;
		
		System.out.println(	"Make is " + c3.make + 
							" and model is " + c3.model + 
							" and color is " + c3.color + 
							" and year is " + c3.year + 
							" and speed is " + c3.speed);
		
		c3.drive();
		c3.reverse();
		c3.transportPeople();
		
		System.out.println("-----------Car 4-----------");
		
		Car c4 = new Car();
		c4.make = "Volvo";
		c4.model = "S40";
		c4.color = "Black";
		c4.year = 2010;
		c4.speed = 1;
		
		System.out.println(	"Make is " + c4.make + 
							" and model is " + c4.model + 
							" and color is " + c4.color + 
							" and year is " + c4.year + 
							" and speed is " + c4.speed);
		
		c4.drive();
		c4.reverse();
		c4.transportPeople();
	}

}
