package com.zseleniumtvswebapplication.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAVehiclePage 
{
	
	WebDriver driver;
	WebDriverWait wait;
	
   
	
	public SelectAVehiclePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait= new WebDriverWait(driver,Duration.ofSeconds(30));
	}
	
	public WebElement getVehicleTypeElement(String vehicleType)
	{
		
		By getVehicleTypeLocator=By.xpath("//a[@data-rr-ui-event-key='"+vehicleType+"']");
		return wait.until(ExpectedConditions.elementToBeClickable(getVehicleTypeLocator));
	}
}
