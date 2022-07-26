package com.ng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionclassTest {

	@Test
	public void Action1() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Actions Ac=new Actions(driver);
		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		Ac.sendKeys(user,"Admin").build().perform();
		Ac.sendKeys(pass,"admin123").build().perform();
		Ac.click(submit).build().perform();
		Thread.sleep(3000);
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		WebElement Org = driver.findElement(By.xpath("//a[text()='Organization']"));
		WebElement loc = driver.findElement(By.xpath("//a[text()='Locations']"));
		Ac.moveToElement(admin).moveToElement(Org).moveToElement(loc).click().build().perform();
	}
}
