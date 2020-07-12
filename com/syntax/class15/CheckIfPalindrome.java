package com.syntax.class15;

public class CheckIfPalindrome {

	public static void main(String[] args) {

		// 1. create String object
		String s = "racecar";

		// 2. make a second String where reversed value will go
		String rev = "";

		// 3. create for loop
		for (int i = s.length() - 1; i >= 0; i--) {

			// 4. use charAt() method to add chars from s to rev
			rev += s.charAt(i);
		}
		
		// 5. use if statement to see if s == rev
		if (s.equalsIgnoreCase(rev)) {
			System.out.println(s + " is a palindrome");
		}
	}

}
