package com.syntax.class08;

import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("How much is the item?");
		double price = scan.nextDouble();
		System.out.println("How much would you like to pay?");
		double payment = scan.nextDouble();
		double total = price - payment;

		for (int i = 0; i < price; i++) {
			System.out.println("Your total is: " + total);
			System.out.println();

			System.out.println("Enter another payment:");
			total -= scan.nextDouble();

			if (total <= 0) {
				break;
			}
		}

		if (total == 0) {
			System.out.println("Thank you for shopping!");
		} else {
			System.out.println("Your change is " + (0 - total));
			System.out.println("Thank you for shopping!");

		}

	}

}
