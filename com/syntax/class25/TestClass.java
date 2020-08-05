 package com.syntax.class25;

public class TestClass {
	
	public static void main(String[] args) {
		
		SuperClass c = new SubClass();
		c.enjoy(); //static method from parent class
		
		SuperClass.enjoy();
		SubClass.enjoy(); //method from own class 
	}

}
