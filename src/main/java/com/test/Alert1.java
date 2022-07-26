package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement  ck=driver.findElement(By.xpath("//button[@id='alertButton']"));
		ck.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
	    WebElement cf=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	    cf.click();
	    alt.accept();
		
		WebElement clk=driver.findElement(By.xpath("//button[starts-with(@id,'timerAlertButton')]"));
		clk.click();
		Thread.sleep(15000);
         alt.accept();
	
		WebElement prompt=driver.findElement(By.xpath("//button[starts-with(@id,'promtButton')]"));
		prompt.click();
		Thread.sleep(5000);
		alt.sendKeys("Dipal");
		alt.accept();
	}

}
