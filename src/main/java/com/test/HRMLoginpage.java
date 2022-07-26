package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLoginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.navigate().to("http://demo.automationtesting.in/Frames.html\r\n");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement user= driver.findElement(By.cssSelector("input#txtUsername"));
		user.sendKeys("Admin");
		WebElement Password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Password.sendKeys("admin123");
	   WebElement btn=driver.findElement(By.cssSelector("input.button"));
		btn.click();
		//WebElement frg=driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		//frg.click();
		
		//driver.findElement(By.xpath("//a[text()[contains(.,'Forgot your password?')]]")).click();
		
		
		
	}

}
