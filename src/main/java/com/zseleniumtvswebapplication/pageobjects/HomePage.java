package com.zseleniumtvswebapplication.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage 
{
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://www.tvsmotor.com/book-a-ride']")
	private WebElement testRide;
	
	@FindBy(xpath="//img[@alt='small arrow']")
	private WebElement selectCountryDownArrowNButton;
	
	public WebElement getSelectCountryDownArrowNButton() {
		return selectCountryDownArrowNButton;
	}

	public void setSelectCountryDownArrowNButton(WebElement selectCountryDownArrowNButton) {
		this.selectCountryDownArrowNButton = selectCountryDownArrowNButton;
	}


	@FindBy(xpath="//div[@class='option-list-country']")
	private WebElement listOfCountries;
	
	public WebElement getListOfCountries() {
		return listOfCountries;
	}

	public void setListOfCountries(WebElement listOfCountries) {
		this.listOfCountries = listOfCountries;
	}

	

	public HomePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() 
	{
		return driver;
	}

	public void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebElement getTestRide() 
	{
		return testRide;
	}

	public void setTestRide(WebElement testRide)
	{
		this.testRide = testRide;
	}
	
	
	public WebElement getCountryFromCountryList(String country)
	{
		
		By selectCountryLocator= By.xpath("//a[contains(@onclick,'"+country+"')]");
		return driver.findElement(selectCountryLocator);
	}
}



	
	


