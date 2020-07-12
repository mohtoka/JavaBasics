package com.syntax.class17;

public class ReturnArray {
	
	int largestFromArray(int[] array) {
		int largest = 0;
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] > largest) {
			largest = array[i];	
			}}
		
		return largest;
	}
//
	String[] words(String a) {
		String[] words = a.split(" ");
		
		return words;
	}

}
