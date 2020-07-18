package com.syntax.class23;

public class Priv {

	private static void p(String a) {
		System.out.println(a);
	}

	private static void p(int b) {
		System.out.println(b);
	}

	private static void p(boolean c) {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Priv.p("Hi");
		
	}

}
