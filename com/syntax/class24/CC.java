package com.syntax.class24;

public class CC {
	
	double balance, interest;
	
	CC(double balance){
		this.balance = balance;
	}
	double calcInt() {
		interest = balance*0.02;
		return interest;
	}
}
class Visa extends CC{
	Visa(double balance){
		super(balance);
	}
}
class Amex extends CC{
	Amex(double balance){
		super(balance);
	}
	double calcInt() {
		interest = balance;
		return interest;
	}
}