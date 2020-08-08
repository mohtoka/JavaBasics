package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<>();
		// storing objects inside map as a Key and Value Pair
		hmap.put(10, "John");// K+V=Entry
		hmap.put(11, "Jane");// K+V=Entry
		hmap.put(12, "James");// K+V=Entry

		System.out.println("OG hmap: " + hmap);
		//cannot have dupicate keys
		hmap.put(12, "Gozde");
		hmap.put(13, "Olga");
		//can have duplicate values
		hmap.put(1, "Olga");

		System.out.println("new hmap: " + hmap);

		// how many entry objects inside map?
		System.out.println("hmap size: " + hmap.size());
		
		//how to check if map has any elements
		System.out.println("is hmap empty?: " + hmap.isEmpty());
		
		//check if map has specific key or value
		System.out.println("does hmap contain 12 key?: " + hmap.containsKey(12));
		
		System.out.println("does hmap contain John value?: " + hmap.containsValue("John"));
		
		//how to retreive single value from the map
		
		System.out.println("return value of key 13: " + hmap.get(13));
		
		//how to remove key from map
		hmap.remove(10);
		System.out.println("hmap after removing 10 key: " + hmap);
	
	}

}
