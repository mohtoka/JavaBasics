package com.syntax.class23;

import java.util.Scanner;

public class ShapeMain {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("int?");
		Circle c = new Circle(scan.nextInt());
		System.out.println(c.area());
		
	}

}
