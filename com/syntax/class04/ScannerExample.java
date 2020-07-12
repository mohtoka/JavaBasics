package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please type your name.");
		String name= scan.nextLine();
		System.out.println("----------------");
		System.out.println("Your name is " + name);
		System.out.println("Please enter your age.");
		String age = scan.nextLine();
		System.out.println("Your name is " + name + " and your age is " + age + ".");
		
		
		
	}
}
