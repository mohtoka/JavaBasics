package com.syntax.class14;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Username:");
		String username = scan.next();
		System.out.println("Password:");
		String password = scan.next();
		System.out.println("Confirm Password:");
		String confirmPassword = scan.next();

		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("Username or Password cannot be empty.");
		} else {
			if (password.length() < 8) {
				System.out.println("Password is too short.");
			} else {
				if (password.contains(username)) {
					System.out.println("Password cannot contain username.");
				} else {
					if (!password.equals(confirmPassword)) {
						System.out.println("Passwords do not match.");
					} else {
						System.out.println("Your username and password have been created.");
					}}}}
		
	}
	
}
