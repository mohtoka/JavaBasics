package com.syntax.class18;

public class Employee {
	
	int eID, salary;
	static String CEO = "Sumair";
	
	void printInfo() {
		System.out.println("Company CEO: " + CEO + ", Employee ID: " + eID + ", Salary: " + salary);
	}
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.eID = 1073325;
		e1.salary = 75000;
		
		e1.printInfo();
		
		Employee e2 = new Employee();
		
		e2.eID = 1234567;
		e2.salary = 90000;
		
		e2.printInfo();
		
		
	}
	

}
