package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {

		boolean hasAllergy = true;
		boolean peanutAllergy = false;
		boolean lasctoseAllergy = true;
		boolean beeAllergy = true;
		boolean seafoodAllergy = false;

		if (hasAllergy) {
			if (peanutAllergy) {
				System.out.println("Don't eat peanuts.");
			}
			if (lasctoseAllergy) {
				System.out.println("Don't drink milk.");
			}
			if (beeAllergy) {
				System.out.println("Don't mess with bees!!!");
			}
			if (seafoodAllergy) {
				System.out.println("Don't eat fish.");
			}

		} else if (!hasAllergy) {
			System.out.println("You're Healthy.");
		}

		System.out.println("--------------");

		boolean diploma = true;
		boolean degreeProgram = false;
		double gpa = 3.4;

		if (diploma) {
			System.out.println("Congratulations!");
		} else { 
			if (degreeProgram) {
				if (gpa >=3.5) {
					System.out.println("You are eligable for scolership.");
				}else {
					System.out.println("You should have studied harder.");
				}
			} else {
				System.out.println("Get a degree.");

			}
		}
		
		System.out.println("--------------");
		
		double mortgageRate = 5.0;
		int housePrice = 300000;
		
		
		if (mortgageRate > 4.5) {
			System.out.println("You can buy a house.");
			if (housePrice < 200000) {
				System.out.println("You can take a loan.");
			}else {
				System.out.println("You can pay cash.");
			}
		}else {
			System.out.println("You cannot buy a house.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
