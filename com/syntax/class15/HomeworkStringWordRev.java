package com.syntax.class15;

public class HomeworkStringWordRev {

	public static void main(String[] args) {

		// to reverse STRING class:

		// 1. create String object
		String s = "Hello!";

		// 2. make a second String where reversed value will go
		String rev = "";

		// 3. create for loop
		for (int i = s.length() - 1; i >= 0; i--) {

			// 4. use charAt() method to add chars from s to rev
			rev += s.charAt(i);
		}

		// 5. print
		System.out.println(rev);
	}
}
