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

public class Task2 {

	// extrace from UserandPass and store in list of maps

	public static void main(String[] args) throws IOException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/UserandPass.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook workbook = new XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sheet1");

		int rowSize = sheet.getPhysicalNumberOfRows();
		int colSize = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> xlList = new ArrayList<>();

		for (int row = 1; row < rowSize; row++) {
			Map<String, String> map = new LinkedHashMap<>();
			for(int col = 0; col < colSize; col++) {
				String key = sheet.getRow(0).getCell(col).toString();
				String value = sheet.getRow(row).getCell(col).toString();
				map.put(key, value);
			}
			xlList.add(map);
		}
		
		for(Map<String, String> m: xlList) {
			System.out.println(m);
		}

		
		
		
		
		
		
		
		
		
		
	}

}
