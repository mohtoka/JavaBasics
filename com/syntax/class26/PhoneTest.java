package com.syntax.class26;

public class PhoneTest {
	
	public static void main(String[] args) {
		
		//Phone p = new Phone();
		
		
		System.out.println("===iPhone===");
		Phone iphone = new iPhone();
		iphone.makeCall();
		iphone.sendText();
		System.out.println("===");
		iphone.navigate();
		iphone.playMusic();
	
		System.out.println("===Samsung===");

		Phone samsung = new Samsung();
		samsung.makeCall();
		samsung.sendText();
		System.out.println("===");
		samsung.navigate();
		samsung.playMusic();
	}

}
