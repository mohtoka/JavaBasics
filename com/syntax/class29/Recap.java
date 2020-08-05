package com.syntax.class29;

public class Recap {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;

		int[] array = { 10, 20, 30, 40, 50 };
		System.out.println("Size of array = " + array.length);

		int[] arr = new int[2];
		arr[0] = 1;
		// arr[2] = 100; //runtime exception: out of bounds

		System.out.println("Size of arr = " + arr.length);
		System.out.println(arr[0]);

		String[] words = { "Hello", "Welcome", "How are you" };
		// WebDriver[] drivers = {new ChromeDriver()};
		
	}
}
