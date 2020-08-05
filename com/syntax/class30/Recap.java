package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {

		double[] array = { 10, 20, 10.99 };

		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(10.99); // boxing
		numbers.add(9.99);
		numbers.add(8.99);
		numbers.add(9.99);
		numbers.add(9.99);
		// numbers.add(7); cannot store Integer into ArrayList of ->Double<- OBJECTS

		System.out.println(numbers);

		Double num = numbers.get(2);
		double num1 = numbers.get(1); // unboxing

		System.out.println("-------------retrieving using enhanced for loop-------------");

		for (Double nums : numbers) {
			System.out.println(nums + " ");
		}

		System.out.println("-------------retrieving backwards-------------");

		for (int i = numbers.size() - 1; i >= 0; i--) {
			System.out.println(numbers.get(i) + " ");
		}

		System.out.println("-----------iterator-----------");

		Iterator<Double> it = numbers.iterator();

		double d = it.next();
		double d1 = it.next();
		System.out.println(d1);

		System.out.println("-----------while loop-----------");

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		
		System.out.println();
		System.out.println("-----------new while loop-----------");

		Iterator<Double> doubleIT = numbers.iterator();
		while (doubleIT.hasNext()) {
			double element = doubleIT.next();
			if (element < 10) {
				doubleIT.remove();
			}
		}
		
		System.out.print(numbers);
		
		
		
		
		
		
	}

}
