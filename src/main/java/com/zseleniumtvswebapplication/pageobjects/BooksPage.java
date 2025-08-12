package com.zseleniumtvswebapplication.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage 
{
	WebDriver driver;
	
	public WebElement getBooksButton() {
		return booksButton;
	}

	@FindBy(xpath="//span[text()='Ebooks']")
	WebElement booksButton;
	
	public BooksPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
