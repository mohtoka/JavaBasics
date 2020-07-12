package com.syntax.class10;

public class ArrayAssignments {
	public static void main(String[] args) {
		char grades[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
		char b = grades[1];
		System.out.println("First way: " + grades[1]);
		System.out.println("Second way: " + b);
		System.out.println("---------------------");

		String names[] = new String[3];
		names[0] = "Bob";
		names[1] = "Sam";
		names[2] = "David";

		String names2[] = { "Bob", "Sam", "David" };

		System.out.println(names[0] + " " + names[1] + " " + names[2]);
		System.out.println(names2[0] + " " + names2[1] + " " + names2[2]);
		System.out.println("---------------------");

		String i[] = new String[5];
		i[2] = "Java";
		i[0] = "Saturday";
		i[4] = "day";
		i[3] = "coding";
		i[1] = "is";

		System.out.println(i[0] + " " + i[1] + " " + i[2] + " " + i[3] + " " + i[4]);

	}

}
