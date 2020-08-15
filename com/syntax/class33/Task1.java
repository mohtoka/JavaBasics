package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Task1 {
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "configs/FB.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String v1 = prop.getProperty("browser");
		String v2 = prop.getProperty("url");
		
		System.out.println(v1 + " + " + v2);
		
		prop.setProperty("street", "Amst");
		
		String newFile = "configs/NewFile.properties";
		
		FileOutputStream fos = new FileOutputStream(newFile);
		
		prop.store(fos, "added additional key");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
