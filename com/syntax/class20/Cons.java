package com.syntax.class20;

public class Cons {
	
	Cons(){
		System.out.println("I have no parameters");
	}
	Cons(int i){
		System.out.println("I have int parameter");
	}

	public static void main(String[] args) {
		
		Cons obj  = new Cons(10);
		
	}
}
