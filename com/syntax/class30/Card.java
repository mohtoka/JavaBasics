package com.syntax.class30;

public abstract class Card {
	
	public String type;
	public Card(String type){
		this.type = type;
	}
	
	public abstract void max();
	public void limit() {
		System.out.println("You have reached your limit on " + type);
	}

}
class MasterCard extends Card{
	MasterCard(String type){
		super(type);
	}
	public void max() {
		System.out.println("MasterCard available credit is $3500");
	}
}
class Visa extends Card{
	Visa(String type){
		super(type);
	}
	public void max() {
		System.out.println("Visa available credit is $7500");
	}
}
class Discover extends Card{
	Discover(String type){
		super(type);
	}
	public void max() {
		System.out.println("Discover has no max");
	}
	public void limit() {
		System.out.println("There is no limit for " + type);
	}
}