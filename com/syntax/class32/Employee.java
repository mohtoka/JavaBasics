package com.syntax.class32;

import java.util.*;
import java.util.Map.Entry;

public class Employee {
	/*
	 * Create a Map that will store Employee name and salary. Write a logic to
	 * retrieve an employee who gets the highest salary. Output should be in the
	 * below format
	 * John Smith=$100000
	 * 
	 */
	
	public static void main(String[] args) {
		
		Map<Integer, String> employee = new TreeMap<>();
		
		employee.put(100, "John");
		employee.put(300, "Jake");
		employee.put(90, "Joe");
		employee.put(120, "James");
		
		Set<Entry<Integer, String>> empEntry = employee.entrySet();
		
		System.out.println("==========Using For Loop==========");
		
		for (Entry<Integer, String> e : empEntry) {
			int key = e.getKey();
			String value = e.getValue();
			System.out.println(value + " = $" + key + ",000");
		}
		
		System.out.println("==========Using Iterator==========");
		
		Iterator<Entry<Integer, String>> iterator = empEntry.iterator();
		
		while(iterator.hasNext()) {
			Entry<Integer, String> e = iterator.next();
			int key = e.getKey();
			String value = e.getValue();
			System.out.println(value + " = $" + key + ",000");
		}
		
		
		
		
	}
}
