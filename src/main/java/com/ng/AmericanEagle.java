package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmericanEagle {

	@Test(alwaysRun=true)
	public void AM(){
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.americaneagle.com/s");
		driver.manage().window().maximize();
		
	}
}
