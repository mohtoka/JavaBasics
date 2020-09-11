package com.syntax.class36;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Recap {

	public static void main(String[] args) throws IOException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook book = new XSSFWorkbook(fis);

		Sheet sheet = book.getSheet("Sample");

		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(0).getPhysicalNumberOfCells();

		List<Map<String, String>> list = new ArrayList<>();

		for (int r = 1; r < row; r++) {

			Map<String, String> map = new LinkedHashMap<>();

			for (int c = 0; c < col; c++) {
				map.put(sheet.getRow(0).getCell(c).toString(), sheet.getRow(r).getCell(c).toString());
			}
			list.add(map);
		}
		
		

	}

}
