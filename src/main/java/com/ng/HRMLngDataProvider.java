package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class HRMLngDataProvider {

	@Test(dataProvider="Auth")
	
	public void Login(String data,String Data1) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement user= driver.findElement(By.cssSelector("input#txtUsername"));
		user.sendKeys(data);
		WebElement Password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys(Data1);
	   WebElement btn=driver.findElement(By.cssSelector("input.button"));
		btn.click();
}
	
	@DataProvider(name="Auth")
	public Object[][] credentials()
	{
		return new Object[][] {{"Admin","admin123"}};
	}
}

