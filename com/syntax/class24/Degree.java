package com.syntax.class24;

public class Degree {
	
	void getPrereq() {
		System.out.println("To get degree, you need a highschool diploma");
	}
}
class Bachelors extends Degree{
	
}
class Masters extends Degree{
	void getPrereq() {
		System.out.println("===");
	}
}
