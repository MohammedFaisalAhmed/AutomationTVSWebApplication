package com.zseleniumtvswebapplication.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.zseleniumtvswebapplication.pageactions.BooksPageActions;

import io.cucumber.java.en.Then;

public class BooksSteps extends BaseSteps
{
	WebDriver driver;
	
	@Then("User click on Ebooks button")
	public void user_click_on_ebooks_button()
	{
	   booksPageActions.clickBooksButton();
	}


	
	

}
