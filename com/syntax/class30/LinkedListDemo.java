package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> food = new LinkedList<>();

		food.add("beshmarmak");
		food.add("pizza");
		food.add("biryani");
		food.add("tacos");

		String myFood = food.get(2);
		System.out.println(myFood);

		LinkedList<String> deserts = new LinkedList<>();
		deserts.add("cake");
		deserts.add("ice cream");
		deserts.add("cookies");

		food.addAll(deserts);
		System.out.println("LinkedList after adding another collection = 	" + food);

		food.remove("pizza");
		System.out.println("LinkedList after removing element = 		" + food);

		food.set(3, "brownie");
		System.out.println("LinkedList after replacing element = 		" + food);

		Iterator<String> foodIT = food.iterator();

		System.out.print("LinkedList before Iterator = 			-");
		while (foodIT.hasNext()) {
			String fooood = foodIT.next();
			System.out.print(fooood + ". ");
			if (fooood.equals("cookies") || fooood.equals("brownie")) {
				foodIT.remove();
			}
		}
		
		System.out.println();
		System.out.println("LinkedList after Iterator = 			" + food);
		
		System.out.println("=====");
		
		LinkedList<Country> countries = new LinkedList<>();
		
		countries.add(new USA("USA"));
		countries.add(new Kazakstan("Kazakstan"));
		countries.add(new Afghanistan("Afghanistan"));
		
		System.out.println("Collection of Country Objects has " + countries.size() + " elements");
		System.out.println("---Enhanced for loop---");
		for(Country c : countries) {
			c.election();
		}
		
		
		
		
	}

}
