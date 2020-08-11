package com.syntax.class32;

import java.util.*;
import java.util.Map.Entry;

public class Task3 {

	/* Create a collection of integers in which you can keep duplicates. 
	 * Write a logic to find sum of all integers
	 */
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(1, 100);
		map.put(2, 100);
		map.put(3, 100);
		map.put(4, 100);
		map.put(5, 100);
		map.put(6, 100);
		map.put(7, 100);
		map.put(8, 100);
		map.put(9, 100);
		map.put(10, 100);
		
		
		int sum = 0;
		
		Set<Entry<Integer, Integer>> entry = map.entrySet();
		
		for (Entry<Integer, Integer> e : entry) {
			sum += e.getValue();
		}
		
		System.out.println(sum);
		
		sum = 0;
		
		Iterator<Entry<Integer, Integer>> iterator = entry.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, Integer> en = iterator.next();
			int value = en.getValue();
			sum += value;
		}
		
		System.out.println(sum);
		
	}
	
	
}
