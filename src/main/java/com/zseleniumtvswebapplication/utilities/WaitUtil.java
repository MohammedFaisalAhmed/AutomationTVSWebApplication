package com.zseleniumtvswebapplication.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil 
{
	WebDriver driver;
	
	public WaitUtil(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void implicitWait(WebDriver driver, long waitTime)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waitTime));
	}
	
	public <T> void explicitWait(WebDriver driver, long waitTime, ExpectedCondition<T> expCond )
	{
		
		WebDriverWait webDriverWait= new WebDriverWait(driver, Duration.ofSeconds(waitTime));
		webDriverWait.until(expCond);
	}
	
	
}
