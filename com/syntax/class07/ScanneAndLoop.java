package com.syntax.class07;

import java.util.Scanner;

public class ScanneAndLoop {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
//		while (i< 5) { 
//		System.out.println("Please enter your name:");
//		String name = scan.nextLine();
//		System.out.println("Hello " + name);
//		System.out.println("---------------------");
//		i++;
//		}
		
		do {
			System.out.println("Please enter your name:");
			String name = scan.nextLine();
			System.out.println("Hello " + name);
			System.out.println("---------------------");
			i++;
		} while (i< 5);
		
		scan.close();
		
		
	}

}
