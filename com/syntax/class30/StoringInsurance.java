package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class StoringInsurance {

	public static void main(String[] args) {

		ArrayList<Insurance> insurance = new ArrayList<>();

		insurance.add(new Car("Car", "Audi"));
		insurance.add(new Pet("Pet", "puppy"));
		insurance.add(new Health("Health"));

		System.out.println("=== for loop ===");
		for (int i = 0; i < insurance.size(); i++) {
			insurance.get(i).getQuote();
		}

		System.out.println();
		System.out.println("=== advanced loop ===");
		for (Insurance i : insurance) {
			i.getQuote();
		}
		
		System.out.println();
		System.out.println("=== iterator ===");
		Iterator<Insurance> it = insurance.iterator();
		while (it.hasNext()) {
			it.next().getQuote();
		}
	}

}
