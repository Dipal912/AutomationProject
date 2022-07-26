package com.ng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowSwitchTest {
	public static String parent;
	public static Set<String> all;
	public static java.util.Iterator<String> it;
	public static String Androidapp;
	public static String Appleapp;
	@Test
	public void Window() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.medplusmart.com/");
	    driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		parent =driver.getWindowHandle();
		System.out.println("MedPlus Window Unique ID"+parent);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='enterval']"));
		search.sendKeys("Dolo 650Mg",Keys.ENTER);
	    Thread.sleep(5000);
		WebElement Android = driver.findElement(By.xpath("//a[@title='Download Android App']/i"));
		Android.click();
		System.out.println(driver.getTitle());
		 all = driver.getWindowHandles();
		it= all.iterator();
		while(it.hasNext())
		{
			Androidapp=it.next();
			if(!parent.equals(Androidapp))
			{
				driver.switchTo().window(Androidapp);
				
			}
		}
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		
		WebElement Add = driver.findElement(By.xpath("//button[text()='Add to Cart']"));
		Add.click();
		System.out.println(driver.getTitle());
		WebElement Apple = driver.findElement(By.xpath("//a[@title='Download iOS App']/i"));
		Apple.click();
		 all = driver.getWindowHandles();
			it= all.iterator();
			while(it.hasNext())
			{
				Appleapp=it.next();
				if(!parent.equals(Appleapp))
				{
					driver.switchTo().window(Appleapp);
					
				}
			}
			
			System.out.println(driver.getTitle());
	}
}
