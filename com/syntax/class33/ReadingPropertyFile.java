package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertyFile {
	
	public static void main(String[] args) throws IOException {
		
		///Users/tokamohamed/eclipse-workspace/JavaBasic/configs/Example.properties
		//s 1
		String filePath = "configs/Example.properties";
		
		//s 2
		FileInputStream fis = new FileInputStream(filePath);
		
		//s 3
		Properties prop = new Properties();
		prop.load(fis);
		
		String value1 = prop.getProperty("username");
		System.out.println(value1);
		
		String value2 = prop.getProperty("city");
		System.out.println(value2);
		
		String password = prop.getProperty("password");
		System.out.println(password);
		
		String value3 = prop.getProperty("comp");
		System.out.println(value3);
		
	}

}
