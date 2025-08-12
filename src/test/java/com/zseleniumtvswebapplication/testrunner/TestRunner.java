package com.zseleniumtvswebapplication.testrunner;

import org.testng.annotations.DataProvider;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features="src/test/resources/features/selectCountry.feature",	
	//features={"src/test/resources/features/testride.feature" ,"src/test/resources/features/selectCountry.feature"},
	glue= {"com.zseleniumtvswebapplication.stepdefinitions"},
	tags="@SelectState",
	//tags="@TestRideVehicle or @SelectCountryAndGoToAppsDownload",
	plugin= {"pretty","html:target/Cucumber-Reports.html"},
	dryRun=false,
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
