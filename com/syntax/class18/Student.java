package com.syntax.class18;

public class Student {

	String name;
	int bday;
	static int num = 0;

	void display() {
		System.out.println("Name: " + name);
		System.out.println("Bday: " + bday);
		System.out.println("===================");
	}
	void addStudent() {
		num++;
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.name = "Toka";
		s1.bday = 11271996;
		s1.addStudent();

		Student s2 = new Student();
		s2.name = "Tasnim";
		s2.bday = 6271998;
		s2.addStudent();
		
		Student s3 = new Student();
		s3.name = "Selsabil";
		s3.bday = 4132003;
		s3.addStudent();
		
		s1.display();
		s2.display();
		s3.display();
		

		System.out.println("There are: " + num + " students");

	}
}
