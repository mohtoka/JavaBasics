package com.syntax.class11;

public class RetrieveElements {
	public static void main(String[] args) {

		char grades[] = { 'A', 'B', 'C', 'D', 'F' };
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i] + " ");
		}
		for (char elements : grades) {
			System.out.print(elements + " ");
		}
		System.out.println();


		String fruit[] = { "Apple", "Orange", "Grapes", "Banana", "Cucumber" };
		for (int i = 0; i<fruit.length; i++) {
			System.out.print(fruit[i] + " ");
		}
		System.out.println();
		for (String elem : fruit) {
			System.out.print(elem + " ");
		}
	}

}
