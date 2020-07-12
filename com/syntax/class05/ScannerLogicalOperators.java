package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {

	public static void main(String[] args) {
		// take the age from user and then
		// if age is btwn 0-3 --> you're a baby
		// if age is btwn 4-5 --> you're a kid
		// if age is btwn 6-12 --> you're a child
		// if age is btwn 13-19 --> you're a teenager
		// if age is btwn 20-64 --> you're an adult
		// if age is btwn >65 --> you're a senior

		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter your age:");
//		int age = scan.nextInt();
//
//		if (age >= 0 && age <= 3) {
//			System.out.println("You're a baby.");
//		} else if (age >= 4 && age <= 5) {
//			System.out.println("You're a kid.");
//		} else if (age >= 6 && age <= 12) {
//			System.out.println("You're a child.");
//		} else if (age >= 13 && age <= 19) {
//			System.out.println("You're a teenager.");
//		} else if (age >= 20 && age <= 65) {
//			System.out.println("You're an adult.");
//		} else if (age >= 64) {
//			System.out.println("You're a senior.");
//		} else {
//			System.out.println("Invalid.");
//		}

		// short = under 60in
		// medium = 60-72in
		// tall = over 72in

//		System.out.println("Enter your height in inches:");
//		
//		int height = scan.nextInt();
//		
//		if (height <=0) {
//			System.out.println("Invalid.");
//		}else if (height <=60) {
//			System.out.println("You are short.");
//		}else if (height >60 && height <=72) {
//			System.out.println("You are medium.");
//		}else if (height >72) {
//			System.out.println("You are tall.");
//		}		

//		//int day = -0;
//		System.out.println("Please input day #:");
//		int day = scan.nextInt();
//		
//		if (day >=1 && day <=5) {
//			System.out.println("It is a weekday.");
//		}else if (day >=6 && day <=7) {
//			System.out.println("It is a weekend.");
//		}else {
//			System.out.println("Invalid.");
//		}

//		System.out.println("Please input quiz grade:");
//		int quiz= scan.nextInt();
//		
//		System.out.println("Please input midterm grade:");
//		int midterm= scan.nextInt();
//		
//		System.out.println("Please input finals grade:");
//		int finals= scan.nextInt();
//		
//		int av = (quiz + midterm + finals)/3;
//		
//		System.out.println("Your grade is: " + av);
//		
//		if (av >=90 && av <=100) {
//			System.out.println("Grade: A.");
//		}else if (av >= 70 && av <90) {
//			System.out.println("Grade: B.");
//		}else if (av >= 50 && av <70) {
//			System.out.println("Grade: C.");
//		}else if (av <50 && av >=0) {
//			System.out.println("Grade: F.");
//		}else {
//			System.out.println("Invalid.");
//		}

//		System.out.println("Please enter birth month:");
//		int month = scan.nextInt();
//		
//		if (month == 6 || month == 7 || month == 8) {
//			System.out.println("You were born in the Summer.");
//		}else if (month == 9 || month == 10 || month == 11) {
//			System.out.println("You were born in the Fall.");
//		}else if (month == 12 || month == 1 || month == 2) {
//			System.out.println("You were born in the Winter.");
//		}else if (month == 3 || month == 4 || month == 5) {
//			System.out.println("You were born in the Spring.");
//		}else {
//			System.out.println("Invalid.");
//		}
		  boolean a, b, c;
		     a = b = c = true;

		          if( !a || ( b && c ) ) {
		             System.out.println("If executed");
		          } else {
		             System.out.println("else executed");
		          }
	}
}
