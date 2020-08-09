package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//import java.util.Map.Entry;

public class Task {
	
	//Create a map of countries with its capital that will store countries in alphabetical order.
	//Print all keys from a country map using for each loop and iterator.
	//Print all values from a country map using for each loop and iterator.

	public static void main(String[] args) {
		
		Map<String, String> country = new TreeMap<>();
		country.put("USA", "Washington DC");
		country.put("New York", "Albany");
		country.put("California", "Sacremento");
		country.put("Illinois", "Chicago");
		
		Set<String> countryKeys = country.keySet();
		
		Collection<String> countryValues = country.values();
		
		for(String keys: countryKeys) {
			System.out.println(keys);
		}
		
		for(String values: countryValues) {
			System.out.println(values);
		}
		
		Iterator<String> iteratorKeys = countryKeys.iterator();
		Iterator<String> iteratorValues = countryValues.iterator();
		
		while(iteratorKeys.hasNext()) {
			System.out.println(iteratorKeys.next());
		}
		
		while(iteratorValues.hasNext()) {
			System.out.println(iteratorValues.next());
		}
		
		
		
	}

}
