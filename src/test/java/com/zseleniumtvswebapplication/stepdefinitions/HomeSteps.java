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
	
	@Given("User click on TVS Connect Google play button")
	public void user_click_on_tvs_connect_google_play_button() 
	{
	  homePageActions.clickTvsConnectAppAndroidGooglePlayButton();
	}
	
	@Given("User click on Road Side Assistance number")
	public void user_click_on_road_side_assistance_number() 
	{
	   homePageActions.clickRoadSideAssistanceNumber();
	}
	

@Given("User Selects Karnataka from the dropdown")
public void user_selects_karnataka_from_the_dropdown()
{
homePageActions.selectState();
}

	

}


















