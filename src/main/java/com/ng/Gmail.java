package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {

	@Test(groups= {"Smoke","Sanity"})
	public void gmail() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Gmail.com/");
	    driver.manage().window().maximize();
	}
}
