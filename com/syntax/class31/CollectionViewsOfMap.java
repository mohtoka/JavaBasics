package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionViewsOfMap {

	public static void main(String[] args) {

		Map<String, Double> grocery = new HashMap<>();
		grocery.put("Apple", 1.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 2.99);

		System.out.println(grocery);

		double value = grocery.get("Milk");
		System.out.println(value);

		// how to get all values
		Collection<Double> values = grocery.values();

		System.out.println("----------Get all values 1 by 1 using loop----------");
		for (Double v : values) {
			System.out.println(v);
		}

		System.out.println("----------Get all values 1 by 1 using iterator----------");
		Iterator<Double> it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<String> key = grocery.keySet();
		

		System.out.println("----------Get all keys 1 by 1 using iterator----------");
		Iterator<String> keys = key.iterator();
		while (keys.hasNext()) {
			String k = keys.next();
			System.out.println(k + " = "+grocery.get(k));
		}
		
		System.out.println("----------Get all keys 1 by 1 using loop----------");

		for (String s : key) {
			System.out.println(s + " === " + grocery.get(s));
		}

	}

}
