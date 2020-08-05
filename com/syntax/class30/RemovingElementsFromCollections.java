package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollections {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("LA");
		cities.add("Istanbul");
		cities.add("DC");
		cities.add("New York");
		
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
		
		Iterator<String> citiesIt = cities.iterator();
		
		while(citiesIt.hasNext()) {
			if (citiesIt.next().equals("LA")) {
				citiesIt.remove();
			}
		}
		
		System.out.println(cities);
		
	}

}
