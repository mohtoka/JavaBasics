package com.syntax.class25;

public class SuperClass {
	
	protected static void enjoy() {
		System.out.println("I enjoy Sundays");
	}

}
class SubClass extends SuperClass{
	
	protected static void enjoy() {
		System.out.println("I enjoy everyday");
	}
}