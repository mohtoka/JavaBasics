package com.syntax.class36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTypes {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//checked exceptions that are checked by compiler
		
		//Thread.sleep(1000);
		
		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		//FileInputStream fis = new FileInputStream(xlFilePath); //if file not there object of FileNotFoundException
		
		
		//unchecked exceptions that are not checked by compiler
		
		int a = 12;
		int b = 0;
		
		//System.out.println(a/b); //ArithmeticException
		
		String str = null;
		//System.out.println(str.length());	//NullPointerException
		
		
		
		
		
		
	}

}
