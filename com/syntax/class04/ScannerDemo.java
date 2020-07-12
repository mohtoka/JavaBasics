package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int i = 65;
		String str = "blah";
				
		Scanner scan = new Scanner(System.in);
			
		System.out.println("Please write some text and press enter!");
		String text = scan.nextLine();
		System.out.println("--------------");
		System.out.println("Hello " +  text);
		
		
		//Let me read an integer (age)
		System.out.println("enter age");
		int age =scan.nextInt();
		System.out.println("The age that you entered is " + age);
		
		
		
		
	}

}
