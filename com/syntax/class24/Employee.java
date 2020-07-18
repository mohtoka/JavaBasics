package com.syntax.class24;

public class Employee {
	
	double salary;
	void getPaid() {
		System.out.println("Employee gets paid salary = " + salary);
	}
	
}
class FullTime extends Employee{
	
}
class PartTime extends Employee{
	
}
class Contractor extends Employee{
	double hourly;
	void getPaid() {
		System.out.println("Contractor gets paid hourly rate = " + hourly);
	}
}
