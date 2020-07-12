package com.syntax.class17;

public class ReturnArrayTest {
	
	public static void main(String[] args) {
		
		ReturnArray r = new ReturnArray();
		
		int[] a = {1, 2, 3, 4, 5, 6, 20, 5};
		
		int largestValue = r.largestFromArray(a);
		System.out.println(largestValue);
//		
		String[] ar = r.words("Hello World, Good Night");
		
		for (String print: ar) {
			System.out.println(print);
		}
	}

}
