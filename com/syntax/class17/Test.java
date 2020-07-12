package com.syntax.class17;

public class Test {
	
	public static void main(String[] args) {
		
		Return r = new Return();
		
		boolean isEven = r.even(11);
		System.out.println(isEven); //or
		System.out.println(r.even(11));
		
		r.largest(6, 5);
		
		String upper = r.toUpper("hello");
		System.out.println(upper);
		System.out.println(r.toUpper("hello"));
		
	}

}
