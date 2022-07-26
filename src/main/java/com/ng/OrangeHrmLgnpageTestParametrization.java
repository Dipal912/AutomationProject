package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OrangeHrmLgnpageTestParametrization {

	@Test
	@Parameters({"user","Pws"})
	public void Login(String data1,String data2) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement user= driver.findElement(By.cssSelector("input#txtUsername"));
		user.sendKeys(data1);
		WebElement Password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys(data2);
	   WebElement btn=driver.findElement(By.cssSelector("input.button"));
		btn.click();
	}
}
