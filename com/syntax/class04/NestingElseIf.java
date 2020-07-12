package com.syntax.class04;

public class NestingElseIf {
	public static void main(String[] args) {
		System.out.println("--------------");

		boolean quizComplete = true; 
		int score = 82;
		
		
		
		if (quizComplete) {
			System.out.println("We'll check the quiz.");
			if (score >= 90) {
				System.out.println("Your score is " + score + ". Great Job!");
			}else if (score >= 80) {
				System.out.println("Your score is " + score + ". Well done!");
			}else if (score >= 70) {
				System.out.println("Your score is " + score + ". Just passed.");
			}else {
				System.out.println("Your score is " + score + ". Your Failed!");
			}
		}else {
			System.out.println("Please complete the quiz.");
		}
		
		
		
		
		
		
  	}
}
