package com.zseleniumtvswebapplication.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestRidePage 
{
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement nameField;
	
	@FindBy(xpath="//input[@id='phone']")
    WebElement phoneNumberField;
    
    public TestRidePage(WebDriver driver)
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

	public WebElement getNameField() {
		return nameField;
	}

	public void setNameField(WebElement nameField) {
		this.nameField = nameField;
	}

	public WebElement getPhoneNumberField() {
		return phoneNumberField;
	}

	public void setPhoneNumberField(WebElement phoneNumberField) {
		this.phoneNumberField = phoneNumberField;
	}
    
}
