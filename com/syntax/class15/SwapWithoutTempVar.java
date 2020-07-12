package com.syntax.class15;

public class SwapWithoutTempVar {

	public static void main(String[] args) {

		// 1. create 2 strings
		String a = " Hello ";
		String b = " There ";

		// 2. add b to string a
		a = b + a;

		// 3. assign value of a to String b using substring
		b = a.substring(b.length());
		
		// 4. reassign String a to only keep value of b using substring
		a = a.substring(0, b.length());
		
		// 5. print
		System.out.println(a);
		System.out.println(b);
	}

}
