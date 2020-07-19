package com.syntax.class24;

public class CCTest {
	
	public static void main(String[] args) {
		
		CC cc = new CC(100);
		System.out.println(cc.calcInt());
		
		Visa v = new Visa(200);
		System.out.println(v.calcInt());
		
		Amex a = new Amex(300);
		System.out.println(a.calcInt());
	}

}
