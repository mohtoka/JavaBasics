package com.syntax.class17;

public class Task {
	
	String createEmail(String name, String lastName, String emailType) {
		String s = name+lastName+"@"+emailType+".com";
		return s.toLowerCase();
	}
	
	boolean prime(int a) {
		boolean isPrime = true;
		
		if(a>0) {
		for (int i = 2; i<a; i++) {
			if (a%i==0) {
				isPrime= false;
				break;
			}
		}
		}else {
			isPrime = false;
		}
		
		return isPrime;
	}
	
	char grade(int a) {
		char grade = ' ';
		if (a >= 90) {
			grade = 'A';
		}else if(a >= 80 && a< 90) {
			grade = 'B';
		}else if(a >= 70 && a< 80) {
			grade = 'C';
		}else if(a >= 50 && a< 70) {
			grade = 'D';
		}else if(a < 50) {
			grade = 'F';
		}
		
		return grade;
	}

}
