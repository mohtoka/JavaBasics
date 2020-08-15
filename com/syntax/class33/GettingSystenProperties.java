package com.syntax.class33;

public class GettingSystenProperties {
	
	public static void main(String[] args) {
	
		String username = System.getProperty("user.name");
		
		System.out.println(username);
		
		String directory = System.getProperty("user.dir");
		
		System.out.println(directory);
		
		
	}
}
