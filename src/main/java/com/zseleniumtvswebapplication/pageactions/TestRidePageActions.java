package com.zseleniumtvswebapplication.pageactions;

import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.JsonNode;
import com.zseleniumtvswebapplication.pageobjects.TestRidePage;
import com.zseleniumtvswebapplication.utilities.ConfigUtil;
import com.zseleniumtvswebapplication.utilities.JsonUtil;
import com.zseleniumtvswebapplication.utilities.WebElementUIHelperUtil;

public class TestRidePageActions 
{
	TestRidePage testRidePage;
	WebElementUIHelperUtil webElementUIHelperUtil;
	
	public TestRidePageActions(WebDriver driver)
	{
		
		testRidePage= new TestRidePage(driver);
		webElementUIHelperUtil= new WebElementUIHelperUtil(driver);
	}
	
	public void userInformation(String userDetails)
	{
		JsonNode userData=JsonUtil.getUserDataFromUsers(userDetails);
		
		String name = userData.get("Name").asText();
		String phoneNumber= userData.get("PhoneNumber").asText();
		
		webElementUIHelperUtil.implicitWaitAndEnterText(testRidePage.getNameField(), name);
		webElementUIHelperUtil.implicitWaitAndEnterText(testRidePage.getPhoneNumberField(), phoneNumber);

	}
}
