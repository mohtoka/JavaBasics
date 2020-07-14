package com.syntax.class21;

public class Student {
	
	String name, address;
	
	Student(String name, String address){
		this.name = name;
		this.address = address;
	}
	
	void displayInfo() {
		System.out.println("Student's name is " + name + " and student's address is " + address);
	}
	
	
	public static void main(String[] args) {
		
		Student toka = new Student("Toka", "New York");
		toka.displayInfo();
		
		
	}

}
