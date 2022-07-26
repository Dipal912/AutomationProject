package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Frames.html\r\n");
		driver.manage().window().maximize();
		//driver.switchTo().frame("singleframe");
		WebElement fr = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(fr);
		WebElement Box = driver.findElement(By.xpath("//input[@type='text']"));
		Box.sendKeys("ABC");
		
	}

}
