package com.syntax.class06;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please input your country:");
//		String country = scan.nextLine();
//		System.out.println("You entered: " + country.toUpperCase());
//		String language;
//		
//		switch (country.toUpperCase()) {
//		case "USA":
//			language = "English";
//			break;
//		case "FRANCE":
//			language = "French";
//			break;
//		case "CHINA":
//			language = "Mandarin";
//			break;
//		default:
//			language = "Probably English";
//		}
//		
//		System.out.println("Your language is " + language);
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your grade;");
//		String grade = scan.next();
//		String exp;
//		
//		switch(grade.toUpperCase()) {
//		case "A":
//			exp = "Excellent";
//			break;
//		case "B":
//			exp = "Good";
//			break;
//		case "C":
//			exp = "Average";
//			break;
//		case "D":
//			exp = "Bad";
//			break;
//		default:
//			exp = "Not acceptable";
//		}
//		
//		System.out.println("Your grade is " + grade.toUpperCase() + " and is " + exp);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first number:");
		int num1 = scan.nextInt();
		System.out.println("Please enter operator:");
		String op = scan.next();
		System.out.println("Please enter second number:");
		int num2 = scan.nextInt();
		System.out.println("Your numbers are: " + num1 + " and " + num2);
		System.out.println("Your operator is: " + op);

		int answer;
		
		switch(op) {
		case "+":
			answer = num1 + num2;
			break;
		case "-":
			answer = num1 - num2;
			break;
		case "*":
			answer = num1 * num2;
			break;
		case"/":
			answer = num1 / num2;
			break;
		default:
			answer = 0;
		}
		System.out.println("Your answer is: " + answer);
		
	}

}
