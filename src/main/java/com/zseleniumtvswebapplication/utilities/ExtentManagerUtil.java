package com.zseleniumtvswebapplication.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManagerUtil 
{
	
	static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
	
			
	static ExtentReports extentReports;
	
	public static ExtentReports getExtentReports()
	{
		if(extentReports==null)
		{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMDD_HHmmss");
		String timeStamp =simpleDateFormat.format(new Date());
		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("test-output/ExtentReport_"+timeStamp+".html");
		extentSparkReporter.config().setDocumentTitle("Automation-Report");
		extentSparkReporter.config().setReportName("Test-Execution Report");	
		extentReports= new ExtentReports();
		extentReports.attachReporter(extentSparkReporter);

		
	}
		
		return extentReports;

}
	
	public static ExtentTest getTest()
	{
		return extentTest.get();
	}
	
public static synchronized void createTest(String testName)
{
	
	ExtentTest test =getExtentReports().createTest(testName);
	extentTest.set((test));
}
	
public static void flushReport()
{
	if(extentReports!=null)
	{
		
		extentReports.flush();
	}
}
	
}
