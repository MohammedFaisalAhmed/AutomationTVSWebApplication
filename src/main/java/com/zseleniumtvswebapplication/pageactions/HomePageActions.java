package com.zseleniumtvswebapplication.pageactions;

import org.openqa.selenium.WebDriver;

import com.zseleniumtvswebapplication.pageobjects.HomePage;
import com.zseleniumtvswebapplication.utilities.WebElementUIHelperUtil;

public class HomePageActions
{
	HomePage homePage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public HomePageActions(WebDriver driver)
	{
		
		homePage= new HomePage(driver);
		webElementUIHelperUtil= new WebElementUIHelperUtil(driver);
	}
	
	public void clicktestRideButton()
	{
		
		webElementUIHelperUtil.clickWithImplicitWait(homePage.getTestRide());
	}

}
