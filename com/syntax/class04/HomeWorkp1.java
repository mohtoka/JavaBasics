package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkp1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		//
//		System.out.println("Enter loan request amount:");
//		int loan = scan.nextInt();
//
//		if (loan <= 200000) {
//			System.out.println("Your loan request was accepted.");
//		} else if (loan > 200000) {
//			System.out.println("Your loan request was rejected.");
//		}
//		//
//		System.out.println("Enter age:");
//		int age = scan.nextInt();
//
//		if (age >= 18) {
//			System.out.println("You are old enough for a Driver's License.");
//		} else {
//			System.out.println("You are not old enough for a Driver's License.");
//			System.out.println("You are old enough for a Learner's Permit.");
//		}
//		//
		System.out.println("Please enter city:");
		String city = scan.nextLine();
		
		
		System.out.println("Please enter temp:");
		double tempF = scan.nextDouble();
		double tempC = (tempF - 32) * 5 / 9;

		System.out.println("The tempurature in the city " + city + ", is " + tempC);
		//

	}

}
