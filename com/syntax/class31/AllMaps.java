package com.syntax.class31;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	
	public static void main(String[] args) {
		
		//create a map of grocery that will hold (item: price) 
		//System.out.println("----------HashMap/grocery----------");
		//HashMap does NOT preserve insertion order of keys
		Map<String, Double> grocery = new HashMap<>();
		grocery.put("Apple", 1.99);
		grocery.put("Milk", 4.99);
		grocery.put("Ice cream", 2.99);
		grocery.put("Eggs", 4.99);
		grocery.put("Juice", 5.99);
		grocery.put("Milk", 2.99);

		
		System.out.println(grocery);
		
		//System.out.println("----------LinkedHashMap/mall----------");
		//LinkedHashMap preserves insertion order of keys
		Map<String, Double> mall = new LinkedHashMap<>();
		mall.put("Cologne", 99.99);
		mall.put("T-Shirt", 15.99);
		mall.put("Shoes", 99.99);
		mall.put("Soap", 1.99);
		mall.put("Cologne", 99.99);
		mall.put("Tea", 3.99);

		
		System.out.println(mall);
		
		//TreeMap sorts them in order
		Map<String, Double> shoppingList = new TreeMap<>();
		shoppingList.putAll(grocery);
		shoppingList.putAll(mall);
		shoppingList.put("Computer", null);
		//shoppingList.put(null, 10.99);
		
		System.out.println(shoppingList);
		
		Map<String, Double> htable = new Hashtable<>();
		
		htable.put("House", 600000.00);
		htable.put("Car", 60000.00);
		htable.put("Food", 100.00);
		htable.put("Cup", 10.00);
		//htable.put(null, 1.99);	//Hashtable does not allow null keys
		//htable.put("Cup", null);	//Hashtable does not allow null values
		
		System.out.println(htable);
		
		//adding null keys and null values in the HashMap
		
		grocery.put(null, 0.99);	//Hashmap can have at least 1 null key
		grocery.put(null, null);	//Hashmap can have multiple null values
		
		System.out.println(grocery);
		
		//adding null keys and null values in the LinkedHashMap
		mall.put(null, 0.99);
		mall.put(null, null);
		mall.put("Water", 2.99);
		
		System.out.println(mall);
		
		
		
		
		
		
		
		
		
		
	}

}
