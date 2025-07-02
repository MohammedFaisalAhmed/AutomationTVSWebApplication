package com.zseleniumtvswebapplication.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://www.tvsmotor.com/book-a-ride']")
	private WebElement testRide;
	
	public HomePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getTestRide() {
		return testRide;
	}

	public void setTestRide(WebElement testRide) {
		this.testRide = testRide;
	}


	
	

}
