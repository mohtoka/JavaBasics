package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollection {

	/* Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 */

	/*Create a Set of cities in which you want to make sure that insertion order is
	 * maintained. Using Iterator remove any city that starts with “A”;
	 */

	/*Create a Set collection that will hold Objects of Student Type. In this set
	 * we do not care about the insertion order. Each student object should have
	 * name and studentID. Display name of each student.
	 */

	public static void main(String[] args) {
		// TASK 1
		System.out.println("----------PRINTING COUNTRIES----------");
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Mexico");
		countries.add("Canada");

		System.out.println("---USING FOR LOOP---");
		for (String country : countries) {
			System.out.println(country);
		}
		System.out.println("---USING ITERATOR---");
		Iterator<String> country = countries.iterator();
		while (country.hasNext()) {
			System.out.println(country.next());
		}

		// TASK 2
		System.out.println("----------PRINTING CITIES THAT DON'T START WITH \"A\"----------");
		Set<String> cities = new LinkedHashSet<>();
		cities.add("Atlanta");
		cities.add("Mexico City");
		cities.add("Toronto");
		
		Iterator<String> city = cities.iterator();
		while (city.hasNext()) {
			String c = city.next();
			if (!c.startsWith("A")) {
				System.out.println(c);
			}
		}

		// TASK 3
		System.out.println("----------PRINTING STUDENT NAMES----------");
		Set<String> students = new HashSet<>();
		students.add("Toka");
		students.add("Tasnim");
		students.add("Selsabil");

		System.out.println("---USING FOR LOOP---");
		for (String name : students) {
			System.out.println(name);
		}

		System.out.println("---USING ITERATOR---");
		Iterator<String> student = students.iterator();
		while (student.hasNext()) {
			System.out.println(student.next());
		}
	}
}
