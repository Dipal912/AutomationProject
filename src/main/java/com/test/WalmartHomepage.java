package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WalmartHomepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
	WebElement sigin=driver.findElement(By.xpath("//div[text()='Sign In']"));
		Actions action=new Actions(driver);
		action.moveToElement(sigin);

	}

}
