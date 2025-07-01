package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.zseleniumtvswebapplication.utilities.ConfigUtil;
import com.zseleniumtvswebapplication.utilities.DriverFactoryUtil;

public class Hooks 
{
	public WebDriver driver;
	
	public void setUp()
	{
		String requiredBrowser= ConfigUtil.getBrowser();
		 this.driver= DriverFactoryUtil.getDriver(requiredBrowser);
		 
		String requiredUrl = ConfigUtil.getProperty("urlName");
		driver.get(requiredUrl);
	}
	
	public void tearDown()
	{
		DriverFactoryUtil.closeDriver();
		
	}

}
