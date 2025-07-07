package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;

public class HomeSteps extends BaseSteps
{
	WebDriver driver;
	
	@Given("User click on test ride button")
	public void user_click_on_test_ride_button() 
	{
	    homePageActions.clicktestRideButton();
		
	}
	
	

}


















