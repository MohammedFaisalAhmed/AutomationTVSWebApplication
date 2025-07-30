package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRideSteps extends BaseSteps
{
	WebDriver driver;
	

@When("User will be navigated to Book a test ride page")
public void user_will_be_navigated_to_book_a_test_ride_page() 
{
    testRidePageActions.verifyBookATestRideWordings();
}


@Then("User enters the {string} and {string}")
public void user_enters_the_and(String userDetails, String testRideVehicleModelName) 
                              //// userDetails and testRideVehicleModelName is testride.feature Examples Heading
{
testRidePageActions.userInformation(userDetails, testRideVehicleModelName);

}



/*@Then("User enters {string}")
public void user_enters(String testRideVehicleModelName) 
{
   testRidePageActions.selectTestRideVehicle(testRideVehicleModelName);
    
}*/

@When("User Click on About Us Menu")
public void user_click_on_about_us_menu() 
{
    testRidePageActions.clickAboutUsMenu();
 
}

@Then("User Click on Overview section")
public void user_click_on_overview_section()
{
    testRidePageActions.clickOverviewSection();
	
}
@Then("Overview Page will be displayed and verify it")
public void overview_page_will_be_displayed_and_verify_it() 
{
	testRidePageActions.verifyOverviewWords();
  
}












}








