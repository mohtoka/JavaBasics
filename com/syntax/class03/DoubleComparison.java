package com.syntax.class03;

public class DoubleComparison {
	public static void main(String[] args) {
		
	//Task 1
		double var1 = 20.01;
		double var2 = 20.1;
		
		if(var1 > var2) {
			System.out.println("Double value " + var1 + " is larger than " + var2 + ".");
		}else {
			System.out.println("Double value " + var1 + " is smaller than " + var2 + ".");
		}
		
	//Task 2
	//TempuratureCheck
		int temp = 50;
		
		if (temp< 32) {
			System.out.println("water will freeze with tempurature " + temp + ".");
		}else {
			System.out.println("water will NOT freeze with tempurature " + temp + ".");
		}
		
		
	}

}
