package com.syntax.class22;

public class Employee {
	
	public static String company  = "Syntax";
	protected String fullName;
	double salary;
	private long ssn;
	
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
