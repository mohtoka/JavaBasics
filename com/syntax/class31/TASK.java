package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class TASK {
	
	public static void main(String[] args) {
		
		List<String> aList = new ArrayList<>();
		aList.add("Jane");
		aList.add("John");
		aList.add("Jasmine");
		aList.add("James");
		aList.add("Jane");
		aList.add("Joe");
		
		
		
		Set<String> set = new LinkedHashSet<>(aList);
		//set.addAll(aList);
		
		
		
		
	}

}
