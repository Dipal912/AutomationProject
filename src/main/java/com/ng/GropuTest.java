package com.ng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GropuTest {

	@Test(groups= {"Regression","Sanitry"})
	public void table() {
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/table");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement table = driver.findElement(By.xpath("//table[@id='webtable']"));
		List<WebElement> row = table.findElements(By.tagName("tr"));
		stop:
			for(int i=1;i<row.size();i++)
			{
				List<WebElement> column = row.get(i).findElements(By.tagName("td"));
				for(int j=0;j<column.size();j++)
				{
					String name="";
					name=column.get(j).getText();
					if(name.equals("Facebook"))
					{
						System.out.println(column.get(2).getText());
						break stop;
					}
				}
	}
}
}
