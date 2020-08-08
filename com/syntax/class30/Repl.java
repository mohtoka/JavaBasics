package com.syntax.class30;

import java.util.LinkedList;

public class Repl {

	public static void main(String[] args) {

		LinkedList<Integer> fib = new LinkedList<>();
		int n1 = 0; 
		int n2 = 1;
		int n3;
		fib.add(n1);
		fib.add(n2);

		for (int i = 2; i < 10; ++i){
			n3 = n1 + n2;
			fib.add(n3);
			n1 = n2;
			n2 = n3;
		}
		
		System.out.println(fib);

	}

}
