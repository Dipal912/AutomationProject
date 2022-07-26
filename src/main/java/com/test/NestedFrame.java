package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement fr1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(fr1);
		WebElement fr3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
	    driver.switchTo().frame(fr3);
		WebElement Checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Checkbox.click();
	}

}
