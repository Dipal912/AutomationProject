package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class OrangeHRMReportsTest {

	public static ChromeDriver driver;
	public static int i=0;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	public void Begin()
	{
		
	}
	
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	}
}
