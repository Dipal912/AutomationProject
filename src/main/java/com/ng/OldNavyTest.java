package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OldNavyTest {

	@Test(alwaysRun=true)
	public void Oldnavy() 
		 {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://oldnavy.com/");
			driver.manage().window().maximize();
	}
}
