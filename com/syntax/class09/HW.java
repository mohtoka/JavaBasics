package com.syntax.class09;

public class HW {
	public static void main(String[] args) {

//		for (int j = 1; j <= 4; j++) {
//			for (int i = 5; i >= 1; i--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

//		for (int i = 5; i >= 1; i--) {
//			for (int j = 5; j >= 1; j--) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}

		for (int r = 1; r <= 5; r++) {

			for (int c = 1; c <= r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int r2 = 4; r2 >= 1; r2--) {
			for (int c2 = 1; c2 <= r2 ; c2++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for (int r = 5; r >= 1; r--) {
//			for (int c = 1; c <= r ; c++) {
//				System.out.print(r);
//			}
//			System.out.println();
//		}
		
	}
}
