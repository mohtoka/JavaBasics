package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadingDemo {
	
	public static void main(String[] args) throws IOException {
		
		String xlPath = System.getProperty("user.dir") + "/testdata/SimpleTestData.xlsx";
		
		FileInputStream fis = new FileInputStream(xlPath);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row1 = sheet.getRow(0);
		
		Cell row1cell2 = row1.getCell(2);
		
		String r1c2String = row1cell2.toString();		
		
		System.out.println(r1c2String);
		
		Row row2 = sheet.getRow(1);
		
		String valueOfAnotherCell = row2.getCell(0).toString();
		System.out.println(valueOfAnotherCell);
		
		//List of Maps
		
	}

}
