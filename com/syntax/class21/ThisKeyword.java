package com.syntax.class21;

public class ThisKeyword {

	int a, b;
	
	ThisKeyword(){
		System.out.println("Pointless constructor");
	}
	
	ThisKeyword(int a, int b){
		this();
		this.a = a;
		this.b = b;
	}
	
	void sum(int a, int b) {
		System.out.println(this.a + this.b);
		System.out.println(a + b);
	}
	
}
