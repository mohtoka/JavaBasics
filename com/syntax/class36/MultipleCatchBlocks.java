package com.syntax.class36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleCatchBlocks {
	
	public static void main(String[] args) {
		
		String file = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";
		
		try {
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("----------");
		
		
		
		
		
		
		
		
	}

}
