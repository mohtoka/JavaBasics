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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeWork {
	
/*	create 5 dif users and add to xlfile
 * FIS for excel file
 * create list of map for users & passwords
 * store xl values in list using for loop
 * open chrome & go to http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
 * 
*/	
	static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

	public static void main(String[] args) throws IOException, InterruptedException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/LoginInfo.xlsx";
		FileInputStream fis = new FileInputStream(xlFilePath);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
//		
		int rowSize = sheet.getPhysicalNumberOfRows();
		int colSize = sheet.getRow(0).getPhysicalNumberOfCells();
		
		List<Map<String, String>> xlList = new ArrayList<>();
		
		for(int row = 1; row < rowSize; row++) {
			Map<String, String> map = new LinkedHashMap<>();
			for(int col = 0; col <colSize; col++) {
				String key = sheet.getRow(0).getCell(col).toString();
				String value = sheet.getRow(row).getCell(col).toString();
				map.put(key, value);
			}
			xlList.add(map);
		}
//
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

		List welcome = new ArrayList();
		
		for(int i = 0; i<xlList.size(); i++) {
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			//
			WebElement usernameBox = driver.findElement(By.name("txtUsername"));
			WebElement passwordBox = driver.findElement(By.name("txtPassword"));
			WebElement loginButton = driver.findElement(By.name("Submit"));
			//
			Map<String, String> map = xlList.get(i);
			//
			String usernameValue = map.get("UserName");
			usernameBox.sendKeys(usernameValue);
			String passwordValue = map.get("Password");
			passwordBox.sendKeys(passwordValue);
			//
			loginButton.click();
			String welcomeText = driver.findElement(By.xpath("//a[@id= 'welcome']")).getText();
			welcome.add(i, welcomeText);
			//
			Thread.sleep(2000);
			driver.close();
		}
		
		System.out.println(welcome);
		
		
		
		
		
		
		
	}

}
