package com.syntax.class31;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefinedObjectsInSet {

	public static void main(String[] args) {
		//we need to store obj oh Health, Pet, Car
		Set<Insurance> lset = new LinkedHashSet<>();
		lset.add(new Pet("Pet", "Cat"));
		lset.add(new Car("Car", "Tesla"));
		lset.add(new Health("Blue Cross"));
		
		//how to acces variables & methods
		
		System.out.println("---------- USING FOR LOOP ----------");
		for (Insurance ins : lset) {
			System.out.println(ins.insuranceName);
			ins.getQuote();
			ins.cancelInsurance();
			System.out.println("----------");
		}
		
		System.out.println("---------- USING ITERATOR ----------");
		Iterator<Insurance> it = lset.iterator();
		
		while(it.hasNext()) {
			Insurance i = it.next();
			System.out.println(i.insuranceName);
			i.getQuote();
			i.cancelInsurance();
			System.out.println("----------");
		}
	}

}
