package com.zseleniumtvswebapplication.utilities;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class WebElementUIHelperUtil 
{
	WebDriver driver;
	WaitUtil waitUtil;
	String mainWindow;
	
	public WebElementUIHelperUtil(WebDriver driver)
	{
		
		this.driver=driver;
		waitUtil= new WaitUtil(driver);
		mainWindow=driver.getWindowHandle();
				
	}
	
	public void clickWithImplicitWait(WebElement element)
	{
		waitUtil.implicitWait(driver, 50);
		element.click();
	}
	
	public void scrollDownImplicitWaitClick(WebElement element)
	{
		
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,500)");
		waitUtil.implicitWait(driver,30);
		element.click();
	}
	
	public void scrollUpImplicitWaitClick(WebElement element)
	{
		
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,-500)");
		waitUtil.implicitWait(driver,30);
		element.click();
	}
	
	public void implicitWaitAndEnterText(WebElement element, String input)
	{
		waitUtil.implicitWait(driver,30);
		element.sendKeys(input);	
		element.click();
		
	}
	
	public void clickElementWithJS(WebElement element) 
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	    js.executeScript("arguments[0].click();", element);
	}

	
	
	public WebElement listVisbilityWithExplicitWait(WebElement element)
	{
		
		
		waitUtil.explicitWait(driver,30, ExpectedConditions.visibilityOf(element));
		return element;
		
		
	}
		
	public void switchToNewWindow()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		for(String window:windowHandles)
			{			
			if(!window.equals(mainWindow))
			{
				
				driver.switchTo().window(window);
			}
			
			}
				
	} 
	
	public void switchBackToMainWindow()
	{
		
		driver.switchTo().window(mainWindow);
	}
	
	public void acceptAlert()
	{
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

		public void dismissAlert()
		{
			
			Alert alert =  driver.switchTo().alert();
			alert.dismiss();
		}
		
		public void enterPromptAndAcceptText(String input)
		{
			Alert alert = driver.switchTo().alert();
			alert.sendKeys(input);
		}
		
		public void selectByVisibleText(WebElement element, String input)
		{
			JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
			javascriptExecutor.executeScript("window.scrollBy(0,500)");
			Select dropDown = new Select(element);
			dropDown.selectByVisibleText(input);
		}
		
		public void switchFrameByIndex(int index)
		{
			
			driver.switchTo().frame(index);
		}
		
		public void switchFrameByWebElement(WebElement element)
		{
			
			driver.switchTo().frame(element);
		}
		
		public void switchFrameByIdOrName(String input)
		{
			driver.switchTo().frame(input);
		}
		public void switchFromFrametoParent()
		{
			driver.switchTo().defaultContent();
		}
		
		public void selectCheckBox(WebElement element)
		{
			if(!element.isSelected())
			{
				element.click();
			}
		}
		
		public void selectDropDownAndEnteringTheData(WebElement dropDownselect, String input,WebElement dataEnteredSelection)
		{
			dropDownselect.click();
			dropDownselect.sendKeys(input);
			implicitWaitAndEnterText(dataEnteredSelection, input);//chaange this to explicit 
			dataEnteredSelection.click();
		}
		
		public void assertPresenceOfElement(WebElement element)
		{
			
			waitUtil.explicitWait(driver, 30, ExpectedConditions.visibilityOf(element));
			Assert.assertEquals(element.isDisplayed(), true);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

