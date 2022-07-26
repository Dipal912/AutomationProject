package com.ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumberTestN {

	@BeforeSuite
	public  void one()
	{
		System.out.println("One Method");
	}
	@AfterSuite
	public  void two()
	{
		System.out.println("Two Method");
	}
	
	@BeforeMethod
	public  void three()
	{
		System.out.println("Three Method");
	}
	
	@AfterMethod
	public  void Four()
	{
		System.out.println("Four Method");
	}
	
	@BeforeTest
	public  void Five()
	{
		System.out.println("Five Method");
	}
	
	@AfterTest
	public  void Six()
	{
		System.out.println("Six Method");
	}
	
	@BeforeClass
	public  void Seven()
	{
		System.out.println("Seven Method");
	}
	
	@AfterClass
	public  void Eight()
	{
		System.out.println("Eight Method");
	}
	
	@Test
	public  void Nine()
	{
		System.out.println("Nine Method");
	}
}
