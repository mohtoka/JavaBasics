package com.syntax.class31;

import java.util.LinkedHashMap;
import java.util.Map;

public class HomeWork {
	
	public static void main(String[] args) {
		
		Map<Integer, String> building = new LinkedHashMap<>();
		
		building.put(1, "Google");
		building.put(2, "Facebook");
		building.put(3, "Microsoft");
		building.put(4, "Amazon");
		building.put(5, "Google");
		building.put(6, "Apple");
		building.put(7, "Amazon");
		System.out.println(building);
		
		int buildingSize = building.size();
		System.out.println(buildingSize);
		
		building.put(4, "Google");
		
		building.remove(7);
		
		System.out.println(building);
		
		
		
	}

}
