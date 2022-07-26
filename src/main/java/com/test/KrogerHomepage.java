package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KrogerHomepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.kroger.com/");
		driver.manage().window().maximize();
		WebElement Skip=driver.findElement(By.xpath("//button[text()[contains(.,'Skip for Now')]]"));
		Skip.click();
		
		WebElement Signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
	    Actions ac= new Actions(driver);
        ac.moveToElement(Signin);
        Signin.click();
        Thread.sleep(2000);
      /*  WebElement Si=driver.findElement(By.xpath("//button[text()='Sign In']"));
        Si.click();
        Thread.sleep(2000);*/
        WebElement Createacc=driver.findElement(By.xpath("//button[normalize-space()='Create an Account']"));
        Createacc.click();
	}

}
