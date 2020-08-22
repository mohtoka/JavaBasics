package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FBTask {
	
	///Users/tokamohamed/eclipse-workspace/JavaBasic/configs/FB.Properties
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "configs/FB.Properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String browser, url, username, password;
		
		browser = p.getProperty("browser");
		url = p.getProperty("url");
		username = p.getProperty("username");
		password = p.getProperty("password");
		
		
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		
		
		
		
	}

}
