package com.syntax.class11;

public class Repl {
	public static void main(String[] args) {
		int[][] a = { { 1, 1, 2 }, // sum = 4
				{ 3, 1, 2 }, // sum = 6
				{ 3, 5, 3 }, // sum = 11
				{ 0, 1, 2 } // sum = 3
		};

		//int sum[] = { 0, 0, 0, 0 };
		
		int sum1 = 0;

		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c < a.length; c++) {
				sum1++;
			}
		}
	System.out.println(sum1);
	}

}
//if (r == 0) {
//sum[0] += a[r][c];
//} else if (r == 1) {
//sum[1] += a[r][c];
//} else if (r == 2) {
//sum[2] += a[r][c];
//} else if (r == 3) {
//sum[3] += a[r][c];
//}