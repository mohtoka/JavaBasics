package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task {
	
	public static void main(String[] args) throws IOException {
		
		String xlFilePath = System.getProperty("user.dir") + "/testdata/UserandPass.xlsx";
		
		FileInputStream fis = new FileInputStream(xlFilePath);
		
		Workbook workbook = new XSSFWorkbook(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("johndoe");
		row1.createCell(1).setCellValue("john123");
		
		Row row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("janedoe");
		row2.createCell(1).setCellValue("jane321");
		
		FileOutputStream fos = new FileOutputStream(xlFilePath);
		
		workbook.write(fos);
		
		workbook.close();
		fis.close();
		fos.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
