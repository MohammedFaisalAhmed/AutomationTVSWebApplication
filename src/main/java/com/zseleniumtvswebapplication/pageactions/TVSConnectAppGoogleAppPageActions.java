package com.zseleniumtvswebapplication.pageactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.zseleniumtvswebapplication.pageobjects.TVSConnectAppGoogleAppPage;
import com.zseleniumtvswebapplication.utilities.WebElementUIHelperUtil;

public class TVSConnectAppGoogleAppPageActions 
{
	WebElementUIHelperUtil webElementUIHelperUtil;
	TVSConnectAppGoogleAppPage tvsConnectAppGoogleAppPage;
	
	public TVSConnectAppGoogleAppPageActions(WebDriver driver)
	{
		
		webElementUIHelperUtil=new WebElementUIHelperUtil(driver);
		tvsConnectAppGoogleAppPage=new TVSConnectAppGoogleAppPage(driver);
	}
	
	public void VerifyTVSConnectWordings()
	{
		webElementUIHelperUtil.switchToNewWindow();
		tvsConnectAppGoogleAppPage.getTVSConnectWordings();
		
	
	}
	
	
	/*public void clickInstallOnMoreDevices()
	{
		
		webElementUIHelperUtil.scrollDownImplicitWaitClick(tvsConnectAppGoogleAppPage.getInstallOnMoreDevices());
		
	}*/
	
	public void clickBooksButton()
	{
		
		webElementUIHelperUtil.clickElementWithJS(tvsConnectAppGoogleAppPage.getBooksButton());
		
	}

	
}
