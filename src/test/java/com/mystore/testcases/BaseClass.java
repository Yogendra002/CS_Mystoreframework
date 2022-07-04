package com.mystore.testcases;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

import com.mystore.utilities.ReadConf;


public class BaseClass 
{
	ReadConf read = new ReadConf();
	//1.we are reading the value of baseurl and browser by using config file
	String url=read.getbaseurl();
	String browser=read.getbrowser();
	
	public static WebDriver driver;
	@BeforeClass
	public void setup()
	{   
		//we are checking the brower's value
		switch(browser.toLowerCase())
		{
		//if value chrome then, we are lauching it using ChromeomeDriver class
		case "chrome" :
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); // We have created WebDriver object. so, we are using here it for initializing the chromedriver.
			break;
			
		case "msedge" :
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			
			//we null the driver here.
			driver = null;
			break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		//2. implicity wait (for synchronization)
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
		//for logging using Log4j
		
		//3.Close and Quit the browser 
	  @AfterClass
	   public void tearDown()
		{
	    driver.close();
	    driver.quit();
		}
	  
	  public void capturescrrenshot(WebDriver driver, String testName) throws IOException
	  {
		  TakesScreenshot screenshot = (TakesScreenshot)driver;
		  File src = screenshot.getScreenshotAs(OutputType.FILE);
		  File dest = new File(System.getProperty("user.dir"+"\\Screenshots"+ testName +".png"));
		  FileUtils.copyFile(src, dest);
	  }

			
}	

