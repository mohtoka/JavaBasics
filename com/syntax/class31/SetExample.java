package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		//creating an object of hashset
		HashSet<String> brand = new HashSet<>();
		brand.add("Nike");
		brand.add("Adidas");
		brand.add("H&M");
		brand.add("Zara");
		brand.add("Uniqlo");
		brand.add("Adidas");
		brand.add("H&M");
		
		System.out.println("brand size: " + brand.size());
		System.out.println("brand elements: " + brand);
		
		//how to verify if element is there
		boolean isItThere = brand.contains("Nike");
		System.out.println("does brand contain \"Nike\"? : " + isItThere);
		
		//how to access element from a Set Collection?
		//brand.get is not available to objects of Set Type
		Iterator<String> iterator = brand.iterator();
		String obj = iterator.next();
		System.out.println(obj);
		
		obj = iterator.next();
		System.out.println(obj);
		
		System.out.println("---------- Using while loop to get values from \"iterator\" object ----------");
		
		while(iterator.hasNext()) {
			obj = iterator.next();
			System.out.println("in while loop: " + obj);
		}
		
		//if we need to iterate over entire collection again, we need NEW ITERATOR OBJECT
		
		System.out.println("---------- Using while loop to get values from \"it\" object ----------");

		Iterator<String> it = brand.iterator();
		while(it.hasNext()) {
			obj = it.next();
			System.out.println(obj);
		}
		
		//is there another way to get all elements from Set collection?
		System.out.println("---------- Using for each loop to get values from set collection ----------");

		for (String b : brand) {
			System.out.println(b);
		}
		
		System.out.println("---------- Creating an object of LinkedListSet ----------");
		LinkedHashSet<String> luxBrand = new LinkedHashSet<>();
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		
		System.out.println("luxBrand size: " + luxBrand.size());
		System.out.println("luxBrand elements: " + luxBrand);
		
		System.out.println("---------- Creating an object of TreeSet ----------");
		
		TreeSet<String> allBrands = new TreeSet<>(brand);
		
		allBrands.add("Calvin Klein");
		allBrands.addAll(luxBrand);
		System.out.println("allBrands elements: " + allBrands);
		
		System.out.println("---------- Retreiving elements from TreeSet ----------");
		Iterator<String> brandIterator = allBrands.iterator();
		while(brandIterator.hasNext()) {
			String br = brandIterator.next();
			System.out.println(br);
		}
		
		System.out.println("---------- Creating an object of TreeSet to store Double ----------");
		
		Set<Double> tset = new TreeSet<>();
		tset.add(10.99);
		tset.add(1.99);
		tset.add(1000.99);
		tset.add(10.01);
		tset.add(110.99);
		
		System.out.println("tset elements: " + tset);
		
		
	}

}
