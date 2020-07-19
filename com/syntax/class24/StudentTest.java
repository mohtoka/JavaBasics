package com.syntax.class24;

public class StudentTest {

	public static void main(String[] args) {
		
		System.out.println("=====STUDENT=====");
		Student student = new Student();
		student.canStudy();
		student.takesTest();
		student.goesToClass();
		student.parties();
		
		System.out.println("=====SYNTAXSTUDENT=====");
		Student syntax = new SyntaxStudent();
		syntax.canStudy();
		syntax.takesTest();
		syntax.goesToClass();
		syntax.parties();
		System.out.println("=====");
		
		System.out.println("=====COLLEGESTUDENT=====");
		Student college = new CollegeStudent();
		college.canStudy();
		college.takesTest();
		college.goesToClass();
		college.parties();
		System.out.println("=====");
		
		System.out.println("=====SCHOOLSTUDENT=====");
		Student school = new SchoolStudent();
		school.canStudy();
		school.takesTest();
		school.goesToClass();
		school.parties();
		System.out.println("=====");
	}
	
	
}
