package com.syntax.class07;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		Print numbers from 1 to 100 in 1 line with space
//		Print numbers from 100 to 1
//		Print even numbers from 20 to 1 (2 ways)
//		Print odd numbers between 20 and 50 (2 ways)

		// pt 1 while
		int a = 1;
		while (a <= 100) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		// pt1 do while
		int b = 1;
		do {
			System.out.print(b + " ");
			b++;
		} while (b <= 100);
		System.out.println();
		// pt1 for
		for (int c = 1; c <= 100; c++) {
			System.out.print(c + " ");
		}
		System.out.println();
		// pt2 while
		int d = 100;
		while (d >= 1) {
			System.out.println(d + " pt2 while");
			d--;
		}
		// pt2 do while
		int e = 100;
		do {
			System.out.println(e + " pt2 do while");
			e--;
		} while (e >= 1);
		// pt2 for
		for (int f = 100; f >= 1; f--) {
			System.out.println(f + " pt2 for");
		}
		// pt3.1 while
		int g = 20;
		while (g >= 1) {
			System.out.println(g + " pt3.1 while");
			g -= 2;
		}
		// pt3.2 while
		int h = 20;
		while (h >= 1) {
			if (h % 2 == 0) {
				System.out.println(h + " pt3.2 while");
			}
			h--;
		}
		// pt3.1 do while
		int i = 20;
		do {
			System.out.println(i + " pt3.1 for while");
			i -= 2;
		} while (i >= 1);
		// pt 3.2 do while
		int j = 20;
		do {
			if (j % 2 == 0) {
				System.out.println(j + " pt3.2 for while");
			}
			j--;
		} while (j >= 1);
		// pt3.1 for
		for (int k = 20; k >= 1; k -= 2) {
			System.out.println(k + " pt 3.1 for");
		}
		// pt3.2 for
		for (int l = 20; l >= 1; l--) {
			if (l % 2 == 0) {
				System.out.println(l + " pt3.2 for");
			}
		}
		// pt4.1 while
		int m = 20;
		while (m < 50) {
			m++;
			System.out.println(m + " pt4.1 while");
			m++;
		}
		// pt4.2 while
		int n = 20;
		while (n <= 50) {
			if (n % 2 == 1) {
				System.out.println(n + " pt4.2 while");
			}
			n++;
		}
		// pt4.1 do while
		int o = 20;
		do {
			o++;
			System.out.println(o + " pt4.1 do while");
			o++;
		} while (o < 50);
		// pt4.2 do while
		int p = 20;
		do {
			if (p % 2 == 1) {
				System.out.println(p + " pt4.2 do while");
			}
			p++;
		} while (p < 50);
		// pt4.1 for
		for (int q = 20; q<50; q++) {
			q++;
			System.out.println(q + " pt4.1 for");
		}
		// pt4.2 for
		for (int r = 20; r<50; r++) {
			if (r%2==1) {
				System.out.println(r + " pt4.2 for");
			}
		}
		
		
	}

}
