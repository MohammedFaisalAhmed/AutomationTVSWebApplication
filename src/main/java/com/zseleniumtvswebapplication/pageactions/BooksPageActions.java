package com.zseleniumtvswebapplication.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zseleniumtvswebapplication.pageobjects.BooksPage;
import com.zseleniumtvswebapplication.utilities.WebElementUIHelperUtil;

public class BooksPageActions 
{
	WebElementUIHelperUtil webElementUIHelperUtil;
	BooksPage booksPage;
	
	public BooksPageActions(WebDriver driver)
	{
		
		webElementUIHelperUtil=new WebElementUIHelperUtil(driver);
		booksPage = new BooksPage(driver);
	}
public void clickBooksButton()
{
	
	webElementUIHelperUtil.clickElementWithJS(booksPage.getBooksButton());
}
}
