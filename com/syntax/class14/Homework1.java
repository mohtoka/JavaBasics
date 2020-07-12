package com.syntax.class14;

public class Homework1 {
	
	public static void main(String[] args) {
		
		String word = "Sunday";
		String reversed = "";
		
		for (int i = word.length()-1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		
		System.out.println(word + " reversed is " +reversed);
		
	}

}
