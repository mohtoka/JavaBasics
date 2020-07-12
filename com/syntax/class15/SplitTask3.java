package com.syntax.class15;

public class SplitTask3 {
	public static void main(String[] args) {
		
		String s = "Is it Saturday? Is it raining? Do we have Java class today?";
		int lengthOfS = s.split("[?]").length;
		System.out.println(lengthOfS);
		
		
	}

}
