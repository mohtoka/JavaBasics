package com.syntax.class32;

import java.util.*;
import java.util.Map.Entry;

/*Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the length of the city 
 * (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
 *If any city name is more than 7 characters remove that city . 
 */

public class Cities {

	public static void main(String[] args) {

		Map<String, Integer> city = new TreeMap<>();
		
		city.put("Paris", 5);
		city.put("Moscow", 6);
		city.put("Washington DC", 13);
		city.put("New York", 3);
		
		Set<Entry<String, Integer>> entry = city.entrySet();
		
		System.out.println("==========Using For Loop==========");
		
		for (Entry<String, Integer> set : entry) {
			String key = set.getKey();
			int value = set.getValue();
			if(value < 7) {
				System.out.println(set);
				//System.out.println("----------");
			}
		}
		
		System.out.println("==========Using Iterator==========");
		
		Iterator<Entry<String, Integer>> iterator = entry.iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> ent = iterator.next();
			//String key = ent.getKey();
			int value = ent.getValue();
			if(value < 7) {
				System.out.println(ent);
			}
		}
		
		
		
		
	}

}
