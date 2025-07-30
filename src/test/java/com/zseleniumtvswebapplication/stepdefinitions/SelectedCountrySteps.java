package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.zseleniumtvswebapplication.pageactions.SelectedCountryPageActions;

import io.cucumber.java.en.Then;

public class SelectedCountrySteps extends BaseSteps
{
	WebDriver driver;
	
	@Then("The Selected country-specific website should open in a new tab")
	public void the_selected_country_specific_website_should_open_in_a_new_tab() 
	{
 
     selectedCountryPageActions.verifyKuwaitCountrySelected();
	}
	

}
