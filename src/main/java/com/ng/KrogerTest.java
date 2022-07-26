package com.ng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KrogerTest {

	@Test(enabled=false)
	public void kroger() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.kroger.com/");
		driver.manage().window().maximize();
	}
}
