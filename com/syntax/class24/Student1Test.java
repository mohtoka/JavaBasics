package com.syntax.class24;

public class Student1Test {
	
	public static void main(String[] args) {
		
		Student1 syntax = new SyntaxStudent1();
		Student1 college = new CollegeStudent1();
		Student1 school = new SchoolStudent1();
		
		syntax.study();
		syntax.sleep();
		syntax.test();
		//syntax.repl();
		
		college.study();
		college.sleep();
		college.test();
		
		school.study();
		school.sleep();
		school.test();
		
		
		
	}

}
