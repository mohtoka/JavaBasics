package com.syntax.class07;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number from 1-20:");
		int number = scan.nextInt();
		
		while (number<=20 && number>=1) {
			if (number != 17) {
				System.out.println("Please enter a different number from 1-20:");
				number = scan.nextInt();
					
			}else if (number == 17) {
				System.out.println("Congrats, you won!");
				break;
			}
			
		}
		
	}

}
