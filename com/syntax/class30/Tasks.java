package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		
		System.out.println("===TASK ONE===");
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Honda");
		a.add("Audi");
		a.add("BMW");
		a.add("Toyota");
		a.add("Jeep");
		
		System.out.print("First way->			");
		for (int i = 0; i<a.size(); i++) {
			System.out.print(a.get(i) + ". ");
		}
		
		System.out.println();
		
		System.out.print("Second way->			");
		Iterator<String> aI = a.iterator();
		while(aI.hasNext()) {
			System.out.print(aI.next() + ". ");
		}
		System.out.println();
		
		System.out.print("Third way->			");
		for (String b : a) {
			System.out.print(b + ". ");
		}
		
		System.out.println();
		
		System.out.println();
		System.out.println("===TASK TWO===");
		
		ArrayList<String> words = new ArrayList<>();
		
		words.add("apple");
		words.add("pear");
		words.add("grape");
		words.add("orange");
		words.add("banana");
		
		
		Iterator<String> w = words.iterator();
		while(w.hasNext()) {
			if(w.next().endsWith("e")) {
				w.remove();
			}
		}
		System.out.println("Words that don't end with \"e\" :	" + words);
		
		System.out.println();
		System.out.println("===TASK THREE===");
		
		ArrayList<String> drinks = new ArrayList<>();
		
		drinks.add("cofee");
		drinks.add("milk");
		drinks.add("lemonade");
		drinks.add("sunkist");
		drinks.add("crush");
		
		for (int i = 0; i < drinks.size(); i++) {
			if (drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
		
//		Iterator<String> d = drinks.iterator();
//		while(d.hasNext()) {
//			String drink = d.next();
//			if (drink.contains("e") || drink.contains("a")) {
//				//drinks.add("water");
//				d.remove();
//			}
//		}
		
		System.out.println();
		System.out.println("===TASK FOUR===");
		
		ArrayList<Integer> even = new ArrayList<>();
		
		for (int i = 1; i <= 50; i++) {
			if (i%2 == 0 && !(i%5 == 0)) {
				even.add(i);
			}
		}
		
		System.out.println(even + ". ");
		

	}
	
	
}
