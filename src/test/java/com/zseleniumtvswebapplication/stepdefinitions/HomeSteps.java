package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends BaseSteps
{
	WebDriver driver;
	
	@Given("User click on test ride button")
	public void user_click_on_test_ride_button() 
	{
	    homePageActions.clicktestRideButton();
		
	}
	
	@Given("User click on the Select Country icon")
	public void user_click_on_the_select_country_icon() 
	{
	    homePageActions.clickSelectCountryDownArrowNButton();
	   
	}
	
	@When("User verifies the presence of the country list in the dropdown")
	public void user_verifies_the_presence_of_the_country_list_in_the_dropdown() 
	{
	
		homePageActions.verifyListOfCountries();
	}
	
	@Then("User selects the country {string} from the list")
	public void user_selects_the_country_from_the_list(String country)
	{
	    homePageActions.clickCountry(country);
	}
	
	
	

}


















