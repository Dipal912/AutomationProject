package com.test;	

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTest {
	public static String parent,linkedIn,facebook,Youtube,twitter;
	public static Set<String> all;
	public static java.util.Iterator<String> it;
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		parent = driver.getWindowHandle();
		System.out.println("HRM LOginPage Unique  ID"+ parent);
		WebElement link = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		link.click();
		System.out.println(driver.getTitle());
		 all = driver.getWindowHandles();
		 System.out.println("Total windows Open"+all.size());
		it =all.iterator();
		while(it.hasNext())
		{
			linkedIn=it.next();
			if(!parent.equals(linkedIn))
			{
				driver.switchTo().window(linkedIn);
			}
		}
		System.out.println(driver.getTitle());
		WebElement email = driver.findElement(By.xpath("//input[@id='email-address']"));
		email.sendKeys("jdf@gmail.com");
		driver.switchTo().window(parent);
		WebElement fb = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
		fb.click();
		System.out.println(driver.getTitle());
		all =driver.getWindowHandles();
		it=all.iterator();
		while(it.hasNext())
		{
			facebook=it.next();
			if(!parent.equals(facebook))
			{
				driver.switchTo().window(facebook);
			}
		}
		System.out.println(driver.getTitle());
		Thread.sleep(6000);
		WebElement phone = driver.findElement(By.xpath("//input[@name='email']"));
		phone.sendKeys("556");
		driver.switchTo().window(parent);
		WebElement tw = driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']"));
		tw.click();
		System.out.println(driver.getTitle());
		all=driver.getWindowHandles();
		it=all.iterator();
		while(it.hasNext())
		{
			twitter =it.next();
			if(!parent.equals(twitter))
			{
				driver.switchTo().window(twitter);
			}
		}
		System.out.println(driver.getTitle());
		
	
}

}
