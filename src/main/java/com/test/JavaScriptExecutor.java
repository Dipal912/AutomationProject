package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();

		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String url = "";//to get URL
		url=js.executeScript("return document.URL").toString();//to get URL
		System.out.println(url);//to get URL
		String title="";
		title=js.executeScript("return document.title;").toString();//Title
		System.out.println(title);//Title
		
		js.executeScript("history.go(0)");//refresh the screen
		
		
		//js.executeScript("document.getElementById('textusername').value='Admin';");
		WebElement user =driver.findElementByXPath("//input[@name='txtUsername']");
		js.executeScript("arguments[0].value='Admin';",user);
		
	
		driver.findElement(By.xpath("//Input[@name='txtPassword']")).sendKeys("admin123");
		js.executeScript("document.getElementById('btnLogin').click();");
		js.executeScript("Window.scrollBy(0,500)");
		
	}

}
