package com.syntax.class09;

public class NestedLoop {
	public static void main(String[] args) {

//		for (int i = 1; i<=3; i++) {
//			System.out.println("Hello");
//			
//			for (int j = 1; j<=3; j++) {
//				System.out.println("Bye");
//			}
//		}

//		for (int i = 1; i <= 3; i++) {
//			System.out.println("I am outer loop " + i);
//
//			for (int j = 1; j <= 3; j++) {
//				System.out.println("i = " + i + " & j = " + j);
//			}
//		}

//		for (int hour = 0; hour < 24; hour++) {
//			for (int minute = 0; minute < 60; minute++) {
//				
//				if (minute < 10) {
//					System.out.println(hour + ":0" + minute);
//					
//				}else {
//					System.out.println(hour + ":" + minute);
//					
//				}
//			}
//		}
		
		for (int i = 1; i <=10; i++) {
			System.out.println();
			for (int j = 1; j <=10; j++) {
				System.out.print("*");
			}
		}

	}

}
