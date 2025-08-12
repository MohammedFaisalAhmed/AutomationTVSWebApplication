package com.zseleniumtvswebapplication.pageobjects;

import java.util.List;

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
	
	public WebElement getRoadSideAssistanceNumber() {
		return roadSideAssistanceNumber;
	}


	@FindBy(xpath="//img[@alt='small arrow']")
	private WebElement selectCountryDownArrowNButton;
	
	@FindBy(xpath="//div[@class='option-list-country']")
	private WebElement listOfCountries;
	
	@FindBy(xpath="//a[@href='https://play.google.com/store/apps/details?id=com.tvsm.connect&hl=en']//img[@alt='Google Play Icon']")
	private WebElement tvsConnectAppAndroidGooglePlayButton;
	
	@FindBy(xpath="//span[text()='1800-258-7111']")
	private WebElement roadSideAssistanceNumber;
	
	@FindBy(xpath="//select[@name='vehicle']")
	private WebElement allTheStates;
	
	/*@FindBy(xpath="//a[@href='/account/login']")
	private WebElement userLoginIcon;
	
	
	public WebElement getUserLoginIcon() {
		return userLoginIcon;
	}


	public void setUserLoginIcon(WebElement userLoginIcon) {
		this.userLoginIcon = userLoginIcon;
	}*/





	public WebElement getTvsConnectAppAndroidGooglePlayButton() {
		return tvsConnectAppAndroidGooglePlayButton;
	}



	public WebElement getAllTheStates() {
		return allTheStates;
	}









	public void setTvsConnectAppAndroidGooglePlayButton(WebElement tvsConnectAppAndroidGooglePlayButton) {
		this.tvsConnectAppAndroidGooglePlayButton = tvsConnectAppAndroidGooglePlayButton;
	}


	public HomePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getSelectCountryDownArrowNButton() {
		return selectCountryDownArrowNButton;
		
	}

	public void setSelectCountryDownArrowNButton(WebElement selectCountryDownArrowNButton) {
		this.selectCountryDownArrowNButton = selectCountryDownArrowNButton;
	}


	
	public WebElement getListOfCountries() {
		return listOfCountries;
	}

	public void setListOfCountries(WebElement listOfCountries) {
		this.listOfCountries = listOfCountries;
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



	
	


