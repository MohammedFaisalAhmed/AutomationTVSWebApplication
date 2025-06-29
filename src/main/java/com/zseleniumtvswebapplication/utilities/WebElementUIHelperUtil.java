package com.zseleniumtvswebapplication.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUIHelperUtil 
{
	WebDriver driver;
	WaitUtil waitUtil;
	
	public WebElementUIHelperUtil(WebDriver driver)
	{
		
		this.driver=driver;
		waitUtil= new WaitUtil(driver);
	}
	
	public void clickWithImplicitWait(WebElement element)
	{
		waitUtil.implicitWait(driver, 20);
		element.click();
	}
	
	public void scrollDownImplicitWaitClick(WebElement element)
	{
		
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,500)");
		waitUtil.implicitWait(driver,30);
		element.click();
	}
	
	public void implicitWaitAndEnterText(WebElement element, String input)
	{
		waitUtil.implicitWait(driver,30);
		element.sendKeys(input);	
		element.click();
		
	}

}
