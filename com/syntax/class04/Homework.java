package com.syntax.class04;

public class Homework {
	public static void main(String[] args) {
		//Task 1
		int month = 1;
		
		if (month == 1) {
			System.out.println("January");
		}else if (month == 2) {
			System.out.println("February");
		}else if (month == 3) {
			System.out.println("March");
		}else if (month == 4) {
			System.out.println("April");
		}else if (month == 5) {
			System.out.println("May");
		}else if (month == 6) {
			System.out.println("June");
		}else if (month == 7) {
			System.out.println("July");
		}else if (month == 8) {
			System.out.println("August");
		}else if (month == 9) {
			System.out.println("September");
		}else if (month == 10) {
			System.out.println("October");
		}else if (month == 11) {
			System.out.println("November");
		}else if (month == 12) {
			System.out.println("December");
		}
		
		//Task 2
		int posNeg= 10;
		
		if (posNeg == 0) {
			System.out.println("zero");
		}else if (posNeg > 0) {
			System.out.println("Positive");
		}else if (posNeg < 0) {
			System.out.println("Negative");
		}
		
		//Task 3
		int num = 11;
		int rem = num%2;
		
		if (rem == 1) {
			System.out.println("Odd");
		}else if (rem == 0) {
			System.out.println("Even");
		}
	}

}
