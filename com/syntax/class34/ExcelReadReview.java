package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadReview {

	public static void main(String[] args) throws IOException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook wbook = new XSSFWorkbook(fis);

		Sheet sheet = wbook.getSheet("Sample");

		Row row2 = sheet.getRow(1);

		String cellValue = sheet.getRow(1).getCell(3).toString();

		System.out.println(cellValue);

		// how to get values from all rows and all columns

		// 1. get # of rows

		int numberOfRows = sheet.getPhysicalNumberOfRows();

		// 2. get # of columns

		int numberOfCols = sheet.getRow(0).getLastCellNum();
		
		// 3.use nested for loops to iterate over rows and cols
		for (int r = 0; r < numberOfRows; r++) { // iterate over rows
			for (int c = 0; c < numberOfCols; c++) { // iterate over cols
				String value = sheet.getRow(r).getCell(c).toString();
				System.out.print(value + " ");
			}
			System.out.println();
		}

	}

}
