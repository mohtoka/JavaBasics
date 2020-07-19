package com.syntax.class24;

public class Bank {

	double money, fee;
	public Bank(double money) {
		this.money = money;
	}
	double chargeFee() {
		if (money < 1000) {
			return fee = 1000 * 0.01;
		} else {
			return fee = 0;
		}
	}
}

class BOA extends Bank {

	public BOA(double money) {
		super(money);
	}
}

class PNC extends Bank {
	
	public PNC(double money) {
		super(money);
	}
	double chargeFee() {
		if (money < 1000) {
			return fee = 1000 * 0.02;
		} else {
			return fee = 0;
		}
	}
}

class CitiBank extends Bank{
	
	public CitiBank(double money) {
		super(money);
	}
}