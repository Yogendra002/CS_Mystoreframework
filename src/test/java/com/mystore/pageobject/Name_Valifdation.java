package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Name_Valifdation 
{

	//1.create object of webdriver
	WebDriver ldriver;

	//2.Create constructor
	public Name_Valifdation (WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	//3.identify webelements on webpage
	@FindBy(xpath="//*[@title='View my customer account']")
	WebElement Username;

	//4.identify action on webelement
	public String userValidaation()
	{
		String text = Username.getText();
		return text;
	}   
}
