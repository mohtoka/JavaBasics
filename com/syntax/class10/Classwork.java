package com.syntax.class10;

import java.util.Scanner;

public class Classwork {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Floors:");
		int floor = scan.nextInt();
		System.out.println("Rooms:");
		int room = scan.nextInt();
		
		for (int i = 1; i <= floor; i++) {
			System.out.print("For floor #: " + i + ", the rooms are: ");
			for (int j = 1; j<= room; j++) {
				System.out.print( i + "." + j + " ");
			}
			System.out.println();
			}
		
	}

}
