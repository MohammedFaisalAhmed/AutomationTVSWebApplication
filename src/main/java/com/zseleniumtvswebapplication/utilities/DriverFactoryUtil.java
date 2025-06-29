package com.zseleniumtvswebapplication.utilities;

import javax.management.RuntimeErrorException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactoryUtil 
{

	final static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver(String browser)
	{
		if(driver.get()==null)
		{
			switch(browser)
			{
			case "Chrome":
			{
				driver.set(new ChromeDriver());
				break;
			}
			case "Edge":
			{
				driver.set(new EdgeDriver());
				break;
			}
			
			default: 
				throw new RuntimeException("no browser");
			
			}
			
			driver.get().manage().window().maximize();
		}
		return driver.get();
				
	}
	
	public static void closeDriver()
	{
		
		if(driver.get()!=null)
		{
			
			driver.get().quit();
		}
	}
}
