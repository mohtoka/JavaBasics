package com.syntax.class08;

import java.util.Scanner;

public class BreakAndContinue {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			if (i == 4) {
//				break;
//			}
//			
//		}
//		System.out.println("We are outside the loop");
//	
//		for (int j = 1; j< 11; j++) {
//			if (j == 5 || j == 7 || j==6) {
//				continue;
//			}
//			System.out.println(j);
//		}

//		for (int k = 1; k <= 100; k++) {
//			if (k >= 35 && k <= 55) {
//				continue;
//			}
//			System.out.println(k);
//		}

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0) {
				continue;
			}

			System.out.println(i);
		}

		for (int i = 1; i < 10; i++) {
			System.out.println("Would you like to apply for a credit card?");
			String yesno = scan.nextLine();

			if (yesno.equals("Yes")) {
				break;
			}
		}
		System.out.println("Okay!");

	}

}
