package com.syntax.class08;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter first number range:");
		int n1 = scan.nextInt();
		System.out.println("Please enter second number range:");
		int n2 = scan.nextInt();
		
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 1) {
				sumEven += i;
			} else if (i % 2 == 0) {
				sumOdd += i;
			}
		}
		
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
