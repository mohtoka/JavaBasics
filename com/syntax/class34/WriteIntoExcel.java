package com.syntax.class34;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteIntoExcel {
//getting data from existing file & writing into new
	public static void main(String[] args) throws IOException {
		
		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);
		
		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sample");
		
		sheet.getRow(0).createCell(5).setCellValue("Result");;
		
		sheet.getRow(1).createCell(5).setCellValue("Pass");
		
		sheet.getRow(2).createCell(5).setCellValue("Fail");
		
		sheet.createRow(3).createCell(0).setCellValue("We are done !!!");
		
		String newXL = System.getProperty("user.dir") + "/testdata/Results.xlsx";
		
		FileOutputStream fos = new FileOutputStream(newXL);
		
		book.write(fos);
		
		book.close();
		fos.close();
		fis.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
