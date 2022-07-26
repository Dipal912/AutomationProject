package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePathExampleFromMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement Fir = driver.findElement(By.xpath("//input[@id='firstName']"));
		js.executeScript("arguments[0].value='Dipal';", Fir);
		WebElement Lst = driver.findElement(By.xpath("//input[@id='lastName']"));
		js.executeScript("arguments[0].value='Patel';", Lst);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		js.executeScript("arguments[0].value='dipal@gmail.com';", email);
		js.executeScript("document.getElementById('gender-radio-2').click();");
		WebElement number = driver.findElement(By.xpath("//input[@id='userNumber']"));
		number.sendKeys("123456987");
		js.executeScript("Window.scrollBy(0,500)");
		WebElement sub = driver.findElement(By.xpath("//div[@id='subjectsContainer']"));
		sub.sendKeys("dipaljdfn");
		
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")).click();
		
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		ele.click();
		ele.sendKeys("C:\\Users\\mandi\\Pictures\\22733346.jpg");
		
		
		
	}

}
