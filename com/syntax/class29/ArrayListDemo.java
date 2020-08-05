package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		a.add(100);
		a.add(200);
		a.add(300);
		// a.add("400");

		System.out.println("a size = " + a.size());
		System.out.println(a);

		a.add(1);
		a.add(2);

		System.out.println(a);

		a.remove(2);

		System.out.println(a);

	}

}
