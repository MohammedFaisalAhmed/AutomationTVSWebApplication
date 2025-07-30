package com.zseleniumtvswebapplication.pageactions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
	
	public void clickSelectCountryDownArrowNButton()
	{
		
		webElementUIHelperUtil.clickWithImplicitWait(homePage.getSelectCountryDownArrowNButton());
				
	}
	

	public void verifyListOfCountries() 
	{
	    Boolean status = webElementUIHelperUtil.listVisbilityWithExplicitWait(homePage.getListOfCountries()).isDisplayed();
	    Assert.assertTrue(status, "Country list is not displayed");
	}		
   
   
   
   public void clickCountry(String country)
   {
	   webElementUIHelperUtil.scrollDownImplicitWaitClick(homePage.getCountryFromCountryList(country));
	   
   }

}
