package com.syntax.class10;

public class Odometer {
	public static void main(String[] args) {
		/*
		 * new car starts with 0000 0001, 0002, 0003... til 9999
		 */

		for (int fir = 0; fir <= 9; fir++) {
			for (int sec = 0; sec <= 9; sec++) {
				for (int thr = 0; thr <= 9; thr++) {
					for (int fou = 0; fou <= 9; fou++) {
						System.out.print(fir + "" + sec + thr + fou + " ");
					}
					System.out.println();
				}
			}
		}
	}
}
