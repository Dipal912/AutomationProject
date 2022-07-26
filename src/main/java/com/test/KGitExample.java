package com.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class KGitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.kroger.com/");
		driver.manage().window().maximize();
	}

}
