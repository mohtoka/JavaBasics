package com.syntax.class17;

public class Return {

	boolean even(int a) {
		boolean isEven = true;
		if (a % 2 == 0) {
			isEven = true;
		} else if (a % 2 == 1) {
			isEven = false;
		}
		return isEven;
	}

	int largest(int a, int b) {
		int larger = 0;
		if (a > b) {
			larger = a;
		} else if (b > a) {
			larger = b;
		}
		return larger;
	}
	
	String toUpper(String a) {
		return a.toUpperCase();
	}

}
