package com.zseleniumtvswebapplication.pageactions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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
	
	public void verifyBookATestRideWordings()
	{
		
		boolean status =testRidePage.getBookATestRideWordings().isDisplayed();
		Assert.assertTrue(status);
	}
	
	
	public void userInformation(String userDetails, String testRideVehicleModelName)
	{
		JsonNode userData=JsonUtil.getUserDataFromUsers(userDetails);
		
		String name = userData.get("Name").asText();
		String phoneNumber= userData.get("PhoneNumber").asText();
		String otp=userData.get("OTP").asText();
		webElementUIHelperUtil.implicitWaitAndEnterText(testRidePage.getNameField(), name);
		webElementUIHelperUtil.implicitWaitAndEnterText(testRidePage.getPhoneNumberField(), phoneNumber);
		webElementUIHelperUtil.implicitWaitAndEnterText(testRidePage.getOtpField(), otp);
		
		webElementUIHelperUtil.clickWithImplicitWait(testRidePage.getVehicleField());
		webElementUIHelperUtil.clickWithImplicitWait(testRidePage.getVehicleVariant());
		webElementUIHelperUtil.clickElementWithJS(testRidePage.getvehicleVariantModelSelectionDropDown(testRideVehicleModelName));
		
		
		webElementUIHelperUtil.clickWithImplicitWait(testRidePage.getCheckBoxInterestedInFinance());
		webElementUIHelperUtil.clickWithImplicitWait(testRidePage.getSubmitButton());

	}
	
/*public void selectTestRideVehicle(String testRideVehicleModelName)
	{
		webElementUIHelperUtil.clickWithImplicitWait(testRidePage.getVehicleField());
		webElementUIHelperUtil.clickWithImplicitWait(testRidePage.getVehicleVariant());
		//webElementUIHelperUtil.clickWithImplicitWait(testRidePage.getvehicleVariantModelSelectionDropDown(testRideVehicleModelName));
		webElementUIHelperUtil.clickElementWithJS(testRidePage.getvehicleVariantModelSelectionDropDown(testRideVehicleModelName));
}*/
	
	
}












