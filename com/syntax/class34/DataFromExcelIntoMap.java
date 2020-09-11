package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataFromExcelIntoMap {

	public static void main(String[] args) throws IOException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sample");

		int rowSize = sheet.getPhysicalNumberOfRows();
		int colSize = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> xlList = new ArrayList<>();

		for (int r = 1; r < rowSize; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < colSize; c++) {

				String key = sheet.getRow(0).getCell(c).toString();
				String value = sheet.getRow(r).getCell(c).toString();
				map.put(key, value);
			}
			xlList.add(map);
		}

		System.out.println(xlList);

		System.out.println("pinting 1 by 1");
		for(Map<String, String> littleMap : xlList) {
			System.out.println(littleMap);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
