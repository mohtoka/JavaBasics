package com.syntax.class23;

public class Shape {

	int radius;
	
	Shape(int radius){
		this.radius = radius;
	}
	
}

class Circle extends Shape{
	
	Circle(int radius){
		super(radius);
	}
	
	double area() {
		
		double area = (radius * radius) * 3.14;
		
		return area;
	}
	
}
