package com.syntax.class29;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int num = 10;
		
		Integer num1 = 100;
		String str = num1.toString().concat("hello");
		System.out.println(str);
		
		int strLength = num1.toString().length();
		System.out.println(strLength);

		Byte b = 10;
		System.out.println(b.MAX_VALUE);
		
		Boolean boo = true;
		
		Character ch = 'a';
		
		Double d = 10.99;
		
		int inn = num1.intValue();
		System.out.println(inn);
		
	}

}
