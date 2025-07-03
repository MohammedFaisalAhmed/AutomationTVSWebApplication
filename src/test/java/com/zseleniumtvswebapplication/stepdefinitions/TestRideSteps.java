package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

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


@Then("User enters the {string}")
public void user_enters_the(String userDetails) 
{
testRidePageActions.userInformation(userDetails);

}
}
