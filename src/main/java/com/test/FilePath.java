package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.xpath("//span[@class='browse-text']"));
		ele.click();
		ele.sendKeys("C:\\D DRIVE\\Dipal Patel.docx");
	}

}
