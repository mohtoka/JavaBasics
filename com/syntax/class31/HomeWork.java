package com.syntax.class31;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HomeWork {
	
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
		
		int buildingSize = floors.size();
		System.out.println("Size of map:	" + buildingSize);
		
		floors.put(4, "Google");
		
		floors.remove(7);
		
		System.out.println("New Map:	" + floors);
		
		Set<Integer> keys = floors.keySet();
		
		for(Integer key: keys) {
			System.out.println(key + " --- " + floors.get(key));
		}
		
		Iterator<Integer> iterator = keys.iterator();
		
		while(iterator.hasNext()) {
			int k = iterator.next();
			System.out.println(k + " --- " + floors.get(k));
			//System.out.println(iterator.hasNext() + " --- " + floors.get(iterator.next()));
		}
		
		Collection<String> values = floors.values();
		
		for(String val: values) {
			System.out.println(val);
		}
		
		Iterator<String> it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
