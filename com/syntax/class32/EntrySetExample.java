package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class EntrySetExample {
	
	public static void main(String[] args) {
		
		Map<Integer, String> floors = new LinkedHashMap<>();
		floors.put(1, "Google");
		floors.put(2, "Facebook");
		floors.put(3, "Microsoft");
		floors.put(4, "Amazon");
		floors.put(5, "Google");
		floors.put(6, "Apple");
		floors.put(7, "Amazon");
		System.out.println("Original Map:	" + floors);
		
		
		Set<Entry<Integer, String>> entries = floors.entrySet();
		System.out.println("Set of Entry objects: " + entries);
		
		System.out.println("----------retrieving key and value pair from Entry using for loop----------");
		
		for(Entry<Integer, String> ent:entries) {
			System.out.println(ent.getKey() + " === " + ent.getValue());
		}
		
		System.out.println("----------retrieving key and value pair from Entry using iterator----------");
		
		Iterator<Entry<Integer, String>> it = entries.iterator();
		while(it.hasNext()) {
			Entry<Integer, String> e = it.next();
			System.out.println(e.getKey() + " === " + e.getValue());
		}
	}

}
