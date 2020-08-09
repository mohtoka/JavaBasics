package com.syntax.class32;

import java.util.*;
import java.util.Map.Entry;

public class BestBuy {
	
//	Create a map of Best Buy store. 
//	Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//	Retrieve all keys and values from a Best Buy map using EntrySet.

	public static void main(String[] args) {
		
		Map<Integer, String> bestBuy = new LinkedHashMap<>();
		
		bestBuy.put(7664847, "Printer");
		bestBuy.put(7879885, "TV");
		bestBuy.put(4529847, "DVD Player");
		bestBuy.put(8927950, "Game Console");
		bestBuy.put(1239474, "Laptop");
		
		Set<Entry<Integer, String>> entry = bestBuy.entrySet();
		
		System.out.println("==========Entry Set Using For Loop==========");
		
		for(Entry<Integer, String> e: entry) {
			int key = e.getKey();
			String value = e.getValue();
			System.out.println("ID: " + key + ". Item: " + value);
			System.out.println("----------");
		}
		
		System.out.println("==========Entry Set Using Iterator==========");
		
		Iterator<Entry<Integer, String>> iterator = entry.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			int key = next.getKey();
			String value = next.getValue();
			System.out.println("ID: " + key + ". Item: " + value);
			System.out.println("----------");
		}
		
		
		
		
	}
	
}
