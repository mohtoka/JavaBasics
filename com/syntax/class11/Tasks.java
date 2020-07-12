package com.syntax.class11;

public class Tasks {
	public static void main(String[] args) {

		String cars[] = { "toyota", "ford", "audi", "bmw", "lexus", "jeep" };
		for (int i = 0; i < cars.length; i++) {
			System.out.println(cars[i]);
		}

		int n[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (int a = 0; a < n.length; a++) {
			sum += n[a];
			System.out.println("Adding " + n[a] + " equals " + sum);
		}

		String c[] = { "USA", "CANADA", "ENGLAND" };
		for (int z = 0; z < c.length; z++) {
			if (c[z].equals("USA")) {
				System.out.println("The capital of " + c[z] + " is Washington DC.");
			}else if (c[z].equals("CANADA")) {
				System.out.println("The capital of " + c[z] + " is Ottowa.");
			}else if (c[z].equals("ENGLAND")) {
				System.out.println("The capital of " + c[z] + " is London.");
			}
		}

	}

}
