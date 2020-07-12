package com.syntax.class14;

import java.util.Scanner;

public class BabyNames {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Mom's name:");
		String mom = scan.next();
		String mom1 = mom.substring(0,mom.length()/2);
		String mom2 = mom.substring(mom.length()/2);
		
		
		System.out.println("Dad's name:");
		String dad = scan.next();
		String dad1 = dad.substring(0,dad.length()/2);
		String dad2 = dad.substring(dad.length()/2);
		
		
		System.out.println("Expecting:");
		String gender = scan.next();
		
		
		if (gender.equalsIgnoreCase("BOY")) {
			System.out.println(dad1.concat(mom2).toUpperCase());
		}else if (gender.equalsIgnoreCase("GIRL")) {
			System.out.println(mom1.concat(dad2).toUpperCase());
		}
		
		
		
	}

}
