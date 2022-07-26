package com.ng;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExTest {
	public static ChromeDriver driver;
	@Test(dataProvider="E")
	public void LoginPage(String data, String data1) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement user= driver.findElement(By.cssSelector("input#txtUsername"));
		user.sendKeys(data);
		WebElement Password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys(data1);
	   WebElement btn=driver.findElement(By.cssSelector("input.button"));
		btn.click();
	}
	
	@DataProvider(name="E")
	public static Object[][] getSheet() {		

		Object[][] data3 = null ;
		

		try {			
			XSSFWorkbook workbook = new XSSFWorkbook(".//excel//TestDipal.xlsx");
			XSSFSheet sheet = workbook.getSheetAt(0);	

			// get the number of rows
			int rowCount = sheet.getLastRowNum();
			// get the number of columns
			int columnCount = sheet.getRow(0).getLastCellNum();

			data3 = new String[rowCount][columnCount];

			// loop through the rows
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ // loop through the columns
						try {
							String cellValue = "";
							try{
								cellValue = row.getCell(j).getStringCellValue();
							}catch(NullPointerException e){

							}
							data3[i-1][j]  = cellValue; // add to the data array
						} catch (Exception e) {
							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}	
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data3;
	}
}
