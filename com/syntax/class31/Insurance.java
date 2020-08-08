package com.syntax.class31;

public abstract class Insurance {

	public String insuranceName;

	public Insurance (String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public abstract void getQuote();
	
	public void cancelInsurance() {
		System.out.println(insuranceName + " is cancelled");
	}

}

class Car extends Insurance {
	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}
	public String carModel;
	public void getQuote() {
		System.out.println(insuranceName + " insurance for " + carModel + " depends on your driving");
	}
}

class Pet extends Insurance {
	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}
	public String petType;
	public void getQuote() {
		System.out.println(insuranceName + " insurance for a " + petType + " is expensive");
	}
}

class Health extends Insurance {
	public Health(String insuranceName) {
		super(insuranceName);
	}
	public void getQuote() {
		System.out.println(insuranceName + " insurance depends on your age");
	}
}