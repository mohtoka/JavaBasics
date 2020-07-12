package com.syntax.class04;

public class NestedIf {
	public static void main(String[] args) {

		int dayOfMonth = 13;
		String dayOfWeek = "Friday";
		
		
		if (dayOfWeek == "Friday") {
			System.out.println("It is Friday. We are going to watch a movie.");
				if (dayOfMonth == 13) {
					System.out.println("We are going to watch a scary movie.");
				}else {
					System.out.println("We are going to watch a comedy.");
				}
		}else {
			System.out.println("It is NOT Friday. We are going to study Java.");
		}
			
		
		
		
		
	}
}
