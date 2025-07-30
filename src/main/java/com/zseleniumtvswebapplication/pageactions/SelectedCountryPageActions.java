package com.zseleniumtvswebapplication.pageactions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.zseleniumtvswebapplication.pageobjects.SelectedCountryPage;
import com.zseleniumtvswebapplication.utilities.WebElementUIHelperUtil;

public class SelectedCountryPageActions 
{
	WebElementUIHelperUtil webElementUIHelperUtil;
	SelectedCountryPage selectedCountryPage;
	
	public SelectedCountryPageActions(WebDriver driver)
	{
		
		webElementUIHelperUtil= new WebElementUIHelperUtil(driver);
		selectedCountryPage=new SelectedCountryPage(driver);
	}
	
	public void verifyKuwaitCountrySelected()
	{
		
		boolean status= selectedCountryPage.getKuwaitCountry().isDisplayed();
		Assert.assertTrue(status);
		//System.out.println(status);
	}

}
