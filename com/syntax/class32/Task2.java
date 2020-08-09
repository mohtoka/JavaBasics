package com.syntax.class32;

import java.util.*;

/*
 * Create the collection that will store single uniques 
 * Objects of a String type in which order is preserved.
 * Write a logic to concatenate all string from the collection.
 */

public class Task2 {

	public static void main(String[] args) {

		Collection<String> obj = new LinkedHashSet<>();

		obj.add("Hello");
		obj.add(",");
		obj.add("how");
		obj.add("are");
		obj.add("you");
		obj.add("?");
		
		String sent = "";

		for (String s : obj) {
			sent += s + " ";
		}
		
		System.out.println("Using for loop: " + sent);
		sent = "";
		
		Iterator<String> iterator = obj.iterator();
		
		while(iterator.hasNext()) {
			sent += iterator.next() + " ";
		}
		
		System.out.println("Using iterator: " + sent);
		
	}

}
