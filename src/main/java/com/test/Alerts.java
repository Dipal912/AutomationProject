package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		driver.manage().window().maximize();
		WebElement clk=driver.findElement(By.xpath("//input[@name='alert']"));
		clk.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		WebElement confirm=driver.findElement(By.xpath("//input[@name='confirmation']"));
		confirm.click();
		Thread.sleep(2000);
		alt.dismiss();
		WebElement prompt =driver.findElement(By.xpath("//input[@name='prompt']"));
		prompt.click();
		alt.sendKeys("Dipal");
		Thread.sleep(5000);
		alt.accept();
	}

}
