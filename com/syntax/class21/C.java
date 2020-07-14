package com.syntax.class21;

public class C extends B {
	
	String wyd;
	boolean wya;
	
	void seeya() {
		System.out.println("See ya");
	}

	
	public static void main(String[] args) {
		System.out.println("===A===");
		A a = new A();
		a.hi = "Hi";
		a.hello = 10;
		a.whatsup = true;
		
		a.bye();
		
		System.out.println("===B===");
		B b = new B();
		b.hi = "Hi";
		b.hello = 10;
		b.whatsup = true;
		b.howru = "How are you?";
		b.howsitgoing = 9;
		
		b.bye();
		b.later();
		
		System.out.println("===C===");
		C c = new C();
		c.hi = "Hi";
		c.hello = 10;
		c.whatsup = true;
		c.howru = "How are you?";
		c.howsitgoing = 9;
		c.wyd = "What are you doing?";
		c.wya = true;
		
		c.bye();
		c.later();
		c.seeya();
	}
}
