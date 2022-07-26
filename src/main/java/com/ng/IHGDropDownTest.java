package com.ng;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IHGDropDownTest {

	@Test
	public void dropdown2() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.ihg.com/rewardsclub/us/en/enrollment/join");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Dhara");
		driver.findElement(By.xpath("//*[@id='lastName']")).sendKeys("Shah");
		driver.findElement(By.xpath("//*[@class='pOne w-100 mt-5 ng-untouched ng-pristine ng-invalid']")).sendKeys("Dharashah210@gmail.com");
		driver.findElement(By.xpath("//*[@id='confirmEmail']")).sendKeys("Dharashah210@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("DharaShah@9449");
		driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("DharaShah@9449");
		WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
		Select s=new Select(country);
		//s.selectByIndex(2);
		//s.selectByValue("IN");
		s.selectByVisibleText("Indonesia");
		
	}

	}

