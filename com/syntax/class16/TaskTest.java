package com.syntax.class16;

public class TaskTest {
	
	public static void main(String[] args) {
		
		Task t = new Task();
		
		t.compare(10, 20);
		
		t.evenOrOdd(15);
		
		t.isPalindrome("racecar");
		
		t.sayHello("mexico");
		
		t.length("I love youuuuuu");
		
		int large = t.largest(10, 20);
		System.out.println("the larger number is " +large);
	}

}
