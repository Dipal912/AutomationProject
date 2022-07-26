package com.ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropdownTest {

	@Test(invocationCount=2)//script will execute 2 times
	public void DropDown()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		WebElement Menu=driver.findElement(By.xpath("//button[@id='menu1']"));
		Menu.click();
		List<WebElement> values=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for (WebElement each : values) {
			if(each.getText().equals("JavaScript"))
			{
				each.click();
			}
			
		}
	}
}
