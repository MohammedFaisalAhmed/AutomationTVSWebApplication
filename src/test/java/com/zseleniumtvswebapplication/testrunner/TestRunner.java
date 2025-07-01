package com.zseleniumtvswebapplication.testrunner;

import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
	features="src/test/resources/features/buyvehicle.feature",
	glue= {"com.zseleniumtvswebapplication.stepdefinitions"},
	tags="@BuyVehicles",
	plugin= {"pretty","html:target/Cucumber-Reports.html"},
	monochrome =true
		
		)




public class TestRunner extends AbstractTestNGCucumberTests
{
	@DataProvider(parallel=true)
	@Override
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}
	

}
