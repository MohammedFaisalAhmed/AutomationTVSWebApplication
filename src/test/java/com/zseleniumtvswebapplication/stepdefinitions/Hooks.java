package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import com.zseleniumtvswebapplication.utilities.ConfigUtil;
import com.zseleniumtvswebapplication.utilities.DriverFactoryUtil;
import com.zseleniumtvswebapplication.utilities.ExtentManagerUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks 
{
	public WebDriver driver;
	
	@Before
	public void setUp(Scenario scenario)
	{
		String requiredBrowser= ConfigUtil.getBrowser();
		 this.driver= DriverFactoryUtil.getDriver(requiredBrowser);
		 
		String requiredUrl = ConfigUtil.getProperty("urlName");
		driver.get(requiredUrl);
		
		ExtentManagerUtil.createTest(scenario.getName());
		ExtentManagerUtil.getTest().log(Status.INFO,"Test-Case Started"+scenario.getName());
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/jpeg", "failed-screenshot");
		    ExtentManagerUtil.getTest().log(Status.FAIL, "Test-Case Failed"+scenario.getName());		
			ExtentManagerUtil.getTest().addScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64));			 
		}
	
		else
		{
			ExtentManagerUtil.getTest().log(Status.PASS, "Test-Case Passed"+scenario.getName());
			
		}
		DriverFactoryUtil.closeDriver();
		ExtentManagerUtil.flushReport();
				
	}

	
}
