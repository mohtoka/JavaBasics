package com.syntax.class36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlock {

	public static void main(String[] args) {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		try {// code that might throw exception

			FileInputStream fis = new FileInputStream(xlFilePath);

		} catch (FileNotFoundException fne) {// catching right exception

			System.out.println("I caught the exception");

		}

		System.out.println("----------------------");

		int[] arr = { 10, 20, 30 };

		try {
			System.out.println("I am the beginning of try block");
			System.out.println(arr[3]);
			System.out.println("I am the end of try block");
		} catch (ArrayIndexOutOfBoundsException aioob) {
			System.out.println("I am the beginning of catch block");
			System.out.println("I caught the ArrayIndexOutOfBoundsException !");
			System.out.println("I am the end of catch block");

			//aioob.printStackTrace();

		}

		System.out.println("End of code");

	}

}
