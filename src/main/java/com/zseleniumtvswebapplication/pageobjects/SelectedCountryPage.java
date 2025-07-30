package com.zseleniumtvswebapplication.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectedCountryPage 
{
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Kuwait']")
	private WebElement kuwaitCountry;
	
	public SelectedCountryPage(WebDriver driver)
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


	public WebElement getKuwaitCountry() {
		return kuwaitCountry;
	}


	public void setKuwaitCountry(WebElement kuwaitCountry) {
		this.kuwaitCountry = kuwaitCountry;
	}
}
