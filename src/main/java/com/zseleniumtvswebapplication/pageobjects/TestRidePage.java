package com.zseleniumtvswebapplication.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.zseleniumtvswebapplication.utilities.WaitUtil;

public class TestRidePage 
{
	
	WebDriver driver;
	WaitUtil waitUtil;
	
	@FindBy(xpath="//h1[text()='Book A Test Ride']")
	WebElement bookATestRideWordings;
	
	@FindBy(xpath="//input[@id='name']")
    WebElement nameField;
	
	@FindBy(xpath="//input[@id='phone']")
    WebElement phoneNumberField;
	
	@FindBy(xpath="//input[@name='otpNumber']")
	WebElement otpField;
	
	@FindBy(xpath="//input[@id='localityPlaceHolder']")
	WebElement pinCodeField;
	
	@FindBy(xpath="//div[@class='vehicleSelectBox']")
	WebElement vehicleField;
	
	@FindBy(xpath="//div[@class='vehicleSelectBoxListing mCustomScrollbar _mCS_1']")
	WebElement vehicleVariant;
	
	@FindBy(xpath="//input[@name='interestFinance']/following-sibling::span")
	WebElement checkBoxInterestedInFinance;
	
	@FindBy(id="submitTestRide")
	WebElement submitButton;
	
	
	
    public WebElement getCheckBoxInterestedInFinance() {
		return checkBoxInterestedInFinance;
	}

	public void setCheckBoxInterestedInFinance(WebElement checkBoxInterestedInFinance) {
		this.checkBoxInterestedInFinance = checkBoxInterestedInFinance;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	public TestRidePage(WebDriver driver)
    {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		waitUtil=new WaitUtil(driver);
    }
	
	public WebElement getBookATestRideWordings() {
		return bookATestRideWordings;
	}

	public void setBookATestRideWordings(WebElement bookATestRideWordings) {
		this.bookATestRideWordings = bookATestRideWordings;
	}
	
	public WaitUtil getWaitUtil() {
		return waitUtil;
	}

	public void setWaitUtil(WaitUtil waitUtil) {
		this.waitUtil = waitUtil;
	}

	public WebElement getOtpField() {
		return otpField;
	}

	public void setOtpField(WebElement otpField) {
		this.otpField = otpField;
	}

	public WebElement getPinCodeField() {
		return pinCodeField;
	}

	public void setPinCodeField(WebElement pinCodeField) {
		this.pinCodeField = pinCodeField;
	}

	public WebElement getVehicleField() {
		return vehicleField;
	}

	public void setVehicleField(WebElement vehicleField) {
		this.vehicleField = vehicleField;
	}

	public WebElement getVehicleVariant() {
		return vehicleVariant;
	}

	public void setVehicleVariant(WebElement vehicleVariant) {
		this.vehicleVariant = vehicleVariant;
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
	
	public WebElement getvehicleVariantModelSelectionDropDown(String testRideModelName)
	{
		
	//  By vehicleVariantLocator= By.xpath("//a[@data-vehiclename="+testRideModelName+"]");
		By vehicleVariantLocator= By.xpath("//a[@data-vehiclename='" + testRideModelName + "']");
	//	waitUtil.explicitWait(driver, 30, ExpectedConditions.elementToBeClickable(vehicleVariantLocator));
		return driver.findElement(vehicleVariantLocator);
		
	}
	
}
