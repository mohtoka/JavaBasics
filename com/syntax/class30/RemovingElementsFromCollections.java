package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollections {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("New York");
		cities.add("DC");
		cities.add("LA");
		
		System.out.println("Original = " + cities);
		
		for (int i = 0; i<cities.size(); i++) {
			if(cities.get(i).equals("LA") || cities.get(i) == "DC") {
				cities.remove(i);
			}
		}
		
		System.out.println("New for loop = " + cities);
		
		
//		for(String city : cities) {
//			if(city.equals("New York")) {
//				cities.remove(city);
//			}
//		}	
		
		System.out.println("New enhanced loop = " + cities);
		
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Moscow");
		
		System.out.println("Before = " + cities);
		
		Iterator<String> citiesIt = cities.iterator();
		
		while(citiesIt.hasNext()) {
			String ci = citiesIt.next();
			if (ci.equals("LA") || ci .equals("New York")) {
				citiesIt.remove();
			}
		}
		
		System.out.println("After = " + cities);
		
	}

}
