package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {

  //1.create object of webdriver
  WebDriver ldriver;

  //2.Create constructor
  public IndexPage(WebDriver rdriver)
   {
      ldriver=rdriver;
      PageFactory.initElements(rdriver,this);
    }

   //3.identify webelements on webpage
   @FindBy(linkText="Sign in")
   WebElement signIn;
   
   //4.identify action on webelement
   public void clickOnSignIn()
   {
	   signIn.click();
   }


}