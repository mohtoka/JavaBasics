package com.syntax.class22;

public class Employee {
	
	static String company  = "Syntax";
	double salary;
	
	void work() {
		System.out.println("I work hard");
	}
	void getPaid() {
		System.out.println("I get paid");
	}
	void display() {
		System.out.println("I work at " + company + " and my salary is " + salary);
	}
}
