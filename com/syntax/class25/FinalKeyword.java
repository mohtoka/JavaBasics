package com.syntax.class25;

public class FinalKeyword {

	public static String str = "Hello";

	public final static String username = "Admin";
	
	public final String password = "Admin123";
	
	public static void main(String[] args) {

		System.out.println(str);

		str = "Hi";

		System.out.println(str);
		
		System.out.println(username);
		
		//username = "user123"; CE
		
		FinalKeyword fk = new FinalKeyword();
		System.out.println(fk.password);
		
	}
	
	public final void hello() {
		System.out.println("Last hello of today");
	}

}
class FinalBaby extends FinalKeyword{
	
//	public void hello() {		//final method cannot be overridden
		
	}
