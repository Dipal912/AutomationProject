package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FacebookParTest {
	
	@Test
	@Parameters({"Eml"})
	public void homepage(String Data3) {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Rama");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys(Data3);
		driver.findElement(By.name("login")).click();
}
}
