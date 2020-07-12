package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter a number.");
	int number1 = scan.nextInt();
	
	System.out.println("Please enter another number.");
	int number2 = scan.nextInt();
	
	if (number1 > number2) {
		System.out.println(number1 + " is larger than " + number2 + ".");
	}else if (number2 > number1) {
		System.out.println(number2 + " is larger than " + number1 + ".");
	}else {
		System.out.println(number1 + " is equal to " + number2 + ".");

	}
}
}

