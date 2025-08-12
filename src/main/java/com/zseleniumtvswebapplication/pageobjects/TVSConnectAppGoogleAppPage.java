package com.zseleniumtvswebapplication.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVSConnectAppGoogleAppPage
{
	WebDriver driver;
	
	
		
@FindBy(xpath="//span[text()='TVS Connect']")
private WebElement TVSConnectWordings;
	
//@FindBy(xpath="//span[contains(text(),'Install on more devices')]/ancestor::button")
//private WebElement installOnMoreDevices;

@FindBy(xpath="//span[text()='Books']")
private WebElement booksButton;





public WebElement getBooksButton() {
	return booksButton;
}

public WebElement getTVSConnectWordings() {
	return TVSConnectWordings;
}

public void setTVSConnectWordings(WebElement tVSConnectWordings) {
	TVSConnectWordings = tVSConnectWordings;
}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

/*public WebElement getInstallOnMoreDevices() {
	return installOnMoreDevices;
}

public void setInstallOnMoreDevices(WebElement installOnMoreDevices) {
	this.installOnMoreDevices = installOnMoreDevices;
}*/

public TVSConnectAppGoogleAppPage(WebDriver driver)
{
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



}
