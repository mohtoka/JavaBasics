package com.syntax.class24;

public class Student1 {
	
	public void study() {
		System.out.println("Student can study");
	}
	public void sleep() {
		System.out.println("Student can sleep");
	}
	public void test() {
		System.out.println("Student takes test");
	}

}
class SyntaxStudent1 extends Student1{
	public void study() {
		System.out.println("Syntax Student can study Java");
	}
	public void repl() {
		System.out.println("Syntax Student does Repl assignments");
	}
}
class CollegeStudent1 extends Student1{
	public void sleep() {
		System.out.println("College student can NOT sleep");
	}
}
class SchoolStudent1 extends Student1{
	public void test() {
		System.out.println("School Student takes test and quizzes");
	}
}