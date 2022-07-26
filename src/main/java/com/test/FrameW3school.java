package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameW3school {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		//driver.switchTo().frame("iframeResult");
		WebElement fr = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(fr);
		WebElement Box = driver.findElement(By.xpath("//button[text()[contains(.,'Try it')]]"));
		Box.click();
	}

}
