package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	    driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement dubclk = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	    Actions ac=new Actions(driver);
	    ac.doubleClick(dubclk).build().perform();
	    driver.switchTo().alert().accept();
	    WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
	    ac.contextClick(rightclick).build().perform();
	}

}
