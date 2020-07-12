package com.syntax.class16;

public class DifMethods {
	
	//create method that says hello 10x
	
	void sayHello() {
		for (int i = 1; i<=10; i++) {
			System.out.println("hello " + i);
		}
	}
	
	void sayHelloParam(int a) {
		for (int i = 1; i<=a; i++) {
			System.out.println("hello " + i);
		}
	}
	
	void say(String s, int a) {
		for (int i = 1; i<=a; i++) {
			System.out.println(s + i);
		}
	}
	
	void isHungry(boolean b) {
		if (b) {
			System.out.println("go cook");
		}else {
			System.out.println("go study");
		}
		
	}

}
