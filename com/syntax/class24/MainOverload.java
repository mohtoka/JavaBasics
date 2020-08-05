package com.syntax.class24;

public class MainOverload {
	
	public static void main(String[] args) {
		System.out.println("main method with string array");
		main("main");
		main("HELLO", 1);
	}

	public static void main(String str) {
		System.out.println("main method with string: " + str);
		
	}
	
	public static void main(String str, int i) {
		System.out.println("main method with string: "+ str + " and int: " + i);
		
	}
}
