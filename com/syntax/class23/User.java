package com.syntax.class23;

public class User {

	String name;
	int number;

	User(String name, int number){
		this.name = name;
		this.number = number;
		
	}



}
class UserInfo extends User{
	
	String address;
	
	UserInfo(String name, int number, String address){
		super(name, number);
		this.address = address;
		
	}
	
	public void userDetails() {
		System.out.println("The user's name is " + name + " and number is " + number + " and address is " + address);
		}
	
}