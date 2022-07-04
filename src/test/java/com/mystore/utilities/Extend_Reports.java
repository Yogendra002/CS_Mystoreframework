package com.mystore.utilities;





import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extend_Reports implements ITestListener
{
	//com.mystore.utilities.Extend_Reports
	//create object of three classes here.
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	
	
	//create class for configure the reports
	public  void configureReport()
	{
		
		ReadConf read1 = new ReadConf();
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyStoretestreport"+ timestamp +".html";
		//do object initilization and report will generate with this "ExtendListenerReportDemo.html" name in our project.
		htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"//reports//"+ Result.reportName();
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Machine:","testpc1");
		reports.setSystemInfo("OS:","windows 11");
		reports.setSystemInfo("browser:","read1.read.getbrowser()");
		reports.setSystemInfo("user name:","Yogendra");
		
		//set the tile of document
		htmlReporter.config().setDocumentTitle("Extend Listener Report Demo");
		//set the name of report
		htmlReporter.config().setReportName("This is my first report");
		//set the theme of report
		htmlReporter.config().setTheme(Theme.STANDARD);
		
		
	}
	
	   

		//All methods are abstract method in any interface.
	
	//we impliment here onStart method
	public void onStart(ITestContext Result)
	{
		configureReport();
		System.out.println("on start method invoked....");
	}	
	
	//we impliment here onFinish method
	public void onFinish(ITestContext Result)
	{
		
		System.out.println("onFinish method invoked....");
		reports.flush();//for writing the test info. in report(mandatory)
	}	
	
	public void onTestfailure(ITestResult Result)
	{
		System.out.println("name of test methods failed:"+ Result.getName());//name of failure class
		test = reports.createTest(Result.getName());//create entry in html report
		test.log(Status.FAIL,MarkupHelper.createLabel("failed tc name"+ Result.getName(),ExtentColor.RED));
		
		String screenshotpath = System.getProperty("user.dir")+"\\Screenshots\\"+Result.getName()+".png";
		
		File screenShotfile = new File(screenshotpath);
		if(screenShotfile.exists())
		{
			test.fail("capture ss is below:"+test.addScreenCaptureFromPath(screenshotpath));
		}
		
	}
	

	//we test case skipped then this methods will call
	public void onTestSkipped(ITestResult Result)
	{
		System.out.print("name of test methods skipped:"+ Result.getName());//name of failure method
		test = reports.createTest(Result.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel("skip tc name"+ Result.getName(),ExtentColor.BLUE));
	}
	
	
	public void onTestStart(ITestResult Result)
	{
		System.out.println("name of test methods started:"+ Result.getName());//name of failure class
	}
	
	
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("name of test methods passes successfully:"+ Result.getName());//name of failure class
		test = reports.createTest(Result.getName());//create entry in html report
		test.log(Status.PASS,MarkupHelper.createLabel("passed tc name"+ Result.getName(),ExtentColor.GREEN));
	}
	
	
	public void ontestcasefailedwithinsuccesspercentage(ITestResult Result)
	{
		
		
	}

	
		
		
		
		
		
		
		
		
		
		
	
		
		
}


