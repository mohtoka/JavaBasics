package com.syntax.class26;

public abstract class Phone {
	
	public void makeCall() {
		System.out.println("Phone makes call");
	}
	
	public void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void navigate();
	public abstract void playMusic();

}

class Samsung extends Phone{
	public void navigate() {
		System.out.println("Samsung navigates");
	}
	public void playMusic() {
		System.out.println("Samsung plays music");	
	}
}
class iPhone extends Phone{
	public void navigate() {
		System.out.println("iPhone navigates");
	}
	public void playMusic() {
		System.out.println("iPhone plays music");	
	}
	
}