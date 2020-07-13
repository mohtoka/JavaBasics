package com.syntax.class19;

public class Employee {
	
	public static String company; //any class in same PROJECT
	public String name, lastName;
	protected int age;//only same PACKAGE 
	double salary;	//default
	private long ssn;//only same CLASS
	
	
	public static void displayCompany() {
		System.out.println("Employee works at " + company);
	}
	
	public void displayName() {
		System.out.println("Employee name is " + name + " " + lastName);
	}

	protected void displayAge() {
		System.out.println("Employee age is " + age);
	}
	
	void displaySalary() {
		System.out.println("Employee salary is " + salary);
	}
	
	private void displaySSN() {
		System.out.println("Employee ssn is " + ssn);
	}
	
	public static void main(String[] args) {
		company = "Google";
		Employee emp = new Employee();
		emp.name = "Ahmet";
		emp.lastName = "Smith";
		emp.age = 21;
		emp.salary = 80000;
		emp.ssn = 1234567890;
		
		displayCompany();
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		emp.displaySSN();
	}
}
