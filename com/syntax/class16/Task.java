package com.syntax.class16;

public class Task {

	void compare(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		}else if(b>a) {
			System.out.println(b + " is larger than " + a);
		}
	}
	
	void evenOrOdd(int a) {
		if(a%2==0) {
			System.out.println(a + " is even");
		}else if(a%2==1) {
			System.out.println(a + " is odd");
		}
	}
	
	void isPalindrome(String a) {
		String rev = "";
		for (int i = a.length()-1; i>=0; i--) {
			rev += a.charAt(i);
		}
		if (a.equalsIgnoreCase(rev)) {
			System.out.println(a + " is a palindrome");
		}else {
			System.out.println(a + " is not a palindrome");
		}
	}
	
	void sayHello(String country) {
		switch(country.toUpperCase()) {
		case "USA":
			System.out.println("Hello");
			break;
		case "MEXICO":
			System.out.println("Hola");
			break;
		case "FRANCE":
			System.out.println("Bonjour");
			break;
		case "CHINA":
			System.out.println("Nǐ hǎo");
			break;
		}	
	}
	
	void length(String a) {
		if (a.length()>=10) {
			System.out.println("Length of string a: \"" 
								+ a + "\" is long");
		}else if(a.length()<10) {
			System.out.println("Length of string a: \"" 
								+ a + "\" is short");
		}
	}
	
	int largest(int a, int b) {
		int largest = 0;
		
		if (a > b) {largest = a;}else if(b>a) {largest = b;}
		
		return largest;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
