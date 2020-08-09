package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MoreExamplesWithEntry {
	
	public static void main(String[] args) {
		
		Map<String, String> movies = new TreeMap<>();
		
		movies.put("Comedy", "Movie 43");
		movies.put("Horror", "Bird Box");
		movies.put("Fiction", "Avengers");
		movies.put("Action", "James Bond");
		movies.put("Romance", "Titanic");
		
		System.out.println("Original movies map: " + movies);
		
		Set<Entry<String, String>> allEntries = movies.entrySet();
		
		Iterator<Entry<String, String>> iterate = allEntries.iterator();
		
		while(iterate.hasNext()) {
			Entry<String, String> e = iterate.next();
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " === " + value);
		}
		
		System.out.println(" --------------------------------- ");
		
		for (Entry<String, String> e : allEntries) {
			String pair = e.getKey() + " == " + e.getValue();
			System.out.println(pair);
		}
		
		
		
		
		
		
		
		
		
	}

}
