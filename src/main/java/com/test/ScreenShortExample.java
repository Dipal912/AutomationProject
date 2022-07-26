package com.test;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShortExample {
	public static ChromeDriver driver;
	public static int i=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		ScreenShortExample SS=new ScreenShortExample();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement user= driver.findElement(By.cssSelector("input#txtUsername"));
		user.sendKeys("Admin");
		SS.snap();
		WebElement Password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys("admin123");
		SS.snap();
	   WebElement btn=driver.findElement(By.cssSelector("input.button"));
		btn.click();
	}
	
	public void snap() throws IOException
	{
		Random r=new Random();
		if(r.nextInt()!=0)
		{
			i=i+1;
		}
		File src=  driver.getScreenshotAs(OutputType.FILE);
		File dest=new File(".//Pic//pic1."+i+".png");
	
			FileUtils.copyFile(src,dest);
		} 
		
	}


