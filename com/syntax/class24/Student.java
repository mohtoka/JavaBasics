package com.syntax.class24;

public class Student {

	public void canStudy() {
		System.out.println("STUDENT studies");
	}
	public void takesTest() {
		System.out.println("STUDENT takes test");
	}
	public void goesToClass() {
		System.out.println("STUDENT goes to class");
	}
	public void parties() {
		System.out.println("STUDENT parties");
	}
	
}
class SyntaxStudent extends Student{
	public void doesRepl() {
		System.out.println("SYNTAX STUDENT does Repl assignments");
	}
	public void takesTest() {
		System.out.println("SYNTAX STUDENT takes test");
	}
}
class CollegeStudent extends Student{
	public void usesZoom() {
		System.out.println("COLLEGE STUDENT uses Zoom");
	}
	public void goesToClass() {
		System.out.println("COLLEGE STUDENT goes to class");
	}
}
class SchoolStudent extends Student{
	public void getsInTrouble() {
		System.out.println("SCHOOL STUDENT gets in trouble");
	}
	public void parties() {
		System.out.println("SCHOOL STUDENT parties");
	}
}
