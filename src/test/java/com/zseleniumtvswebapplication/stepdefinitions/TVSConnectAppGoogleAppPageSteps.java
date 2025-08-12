package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.zseleniumtvswebapplication.pageactions.HomePageActions;
import com.zseleniumtvswebapplication.pageactions.TVSConnectAppGoogleAppPageActions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TVSConnectAppGoogleAppPageSteps extends BaseSteps
{
	WebDriver driver;
	
	@When("User will be navigated to the new window and verify the wordings")
	public void user_will_be_navigated_to_the_new_window_and_verify_the_wordings()
	{
	    tvsConnectAppGoogleAppPageActions.VerifyTVSConnectWordings();
	}
	
	@Then("User click on books button")
	public void user_click_on_books_button()
	{
	tvsConnectAppGoogleAppPageActions.clickBooksButton();
	}
	
	/*@Then("User will be navigated to the new window and click on install on devices button")
	public void user_will_be_navigated_to_the_new_window_and_click_on_install_on_devices_button()
	{
	    tvsConnectAppGoogleAppPageActions.clickInstallOnMoreDevices();
	}*/
	
	/*@Then("User comes to main Window and click on User icon")
	public void user_comes_to_main_window_and_click_on_user_icon() 
	{
	
	    homePageActions.clickUserLoginIcon();
	}*/
	
	
	
	

}
