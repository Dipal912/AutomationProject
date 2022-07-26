package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frame3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement fr1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(fr1);
		WebElement Txtbox = driver.findElement(By.xpath("//b[@id='topic']/following::input"));
		Txtbox.sendKeys("Animal");
	
	    WebElement fr3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));//nested frame 
	    driver.switchTo().frame(fr3);
		WebElement Checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		Checkbox.click();
		driver.switchTo().defaultContent();
		WebElement fr2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(fr2);
		WebElement Animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select s=new Select(Animal);
		s.selectByVisibleText("Baby Cat");
	
	}

}
