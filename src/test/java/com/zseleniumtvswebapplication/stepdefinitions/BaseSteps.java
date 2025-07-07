package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.zseleniumtvswebapplication.pageactions.HomePageActions;
import com.zseleniumtvswebapplication.pageactions.TestRidePageActions;
import com.zseleniumtvswebapplication.utilities.ConfigUtil;
import com.zseleniumtvswebapplication.utilities.DriverFactoryUtil;

public class BaseSteps 
{
	
	public WebDriver driver;
	protected HomePageActions homePageActions;
	protected TestRidePageActions testRidePageActions;
	
	public BaseSteps()
	{
		String browser=ConfigUtil.getBrowser();
		this.driver=DriverFactoryUtil.getDriver(browser);
		initializePages();
		
	}
	
	public void initializePages()
	{
		homePageActions= new HomePageActions(driver);
		testRidePageActions=new TestRidePageActions(driver);
		
	}
	
	

}











