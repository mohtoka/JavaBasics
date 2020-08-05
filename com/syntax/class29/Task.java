package com.syntax.class29;

import java.util.ArrayList;

public class Task {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("New York");
		a.add("Los Angelos");
		a.add("Utah");
		a.add("Montana");
		a.add("Arizona");
		a.add("Oregon");
		
		if (a.isEmpty()) {
			System.out.println("a is empty");
		}else {
			System.out.println("a is NOT empty: " + a);
		}
		
		if(a.contains("Utah")) {
			System.out.println("a contains \"Utah\"");
		}else {
			System.out.println("a does NOT contain \"Utah\"");
		}
		
		System.out.println("size of a is: " + a.size());
		System.out.println(a);
		
		
		
	}

}
