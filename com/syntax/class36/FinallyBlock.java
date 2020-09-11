package com.syntax.class36;

public class FinallyBlock {
	
	public static void main(String[] args) {
		
		String str = "Java";
		
		try {
			System.out.println("I am a try block");
			char letter = str.charAt(10);
			System.out.println(letter);
		}catch(Exception e) {
			System.out.println("I am a catch block");
			System.out.println(e);
		}finally {
			System.out.println("I am a finally block");
		}
		
		System.out.println("I am the end of the code");
		
		
		
	}

}
