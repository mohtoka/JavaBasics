package com.syntax.class30;

public abstract class Country {
	
	public String name;
	
	public Country(String name) {
		this.name = name;
	}
	
	public abstract void election();

}
class USA extends Country{
	public USA(String name) {
		super(name);
	}
	public void election() {
		System.out.println(name + " holds presidential election every 4 years");
	}
}
class Kazakstan extends Country{
	public Kazakstan(String name) {
		super(name);
	}
	
	public void election() {
		System.out.println(name + " holds election whenever they decide so");
	}
	
}
class Afghanistan extends Country{
	public Afghanistan(String name) {
		super(name);
	}
	public void election() {
		System.out.println(name + " holds election every 5 years");
	}
	
}