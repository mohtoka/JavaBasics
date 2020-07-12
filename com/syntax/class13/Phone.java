package com.syntax.class13;

public class Phone{

	String make;
	String model;
	double price;
	
	void call() {
		System.out.println(make + " " + model + " can call");
	}
	
	void text() {
		System.out.println(make + " " + model + " can text");
	}
	
	void takePictures() {
		System.out.println(make + " " + model + " can take pics");
	}
	
}
