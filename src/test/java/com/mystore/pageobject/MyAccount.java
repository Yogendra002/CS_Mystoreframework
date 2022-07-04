package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount 
{
	//1.create object of webdriver
	  WebDriver ldriver;

	  //2.Create constructor
	  public MyAccount(WebDriver rdriver)
	   {
	      ldriver=rdriver;
	      PageFactory.initElements(rdriver,this);
	    }

	   //3.identify webelements on webpage
	   @FindBy(id="email_create")
	   WebElement createEmailId;
	   
	   @FindBy(id="SubmitCreate")
	   WebElement Sumbitcreate;
	   
	   @FindBy(id="email")
	   WebElement Signinemail;
	   
	   @FindBy(id="passwd")
	   WebElement Signinpassword;
	   
	   @FindBy(id="SubmitLogin")
	   WebElement SubmitLogin;
	   
	   
	   
	   //4.identify action on webelement
	   public void creatEmail(String emailAdd)
	   {
		   createEmailId.sendKeys(emailAdd);
	   }
	   
	   
	   public void submitCreate()
	   {
		   Sumbitcreate.click();
	   }
	
	   public void createSigninemail(String Signinmail)
	   {
		   Signinemail.sendKeys(Signinmail);
	   }
	   
	   
	   public void createSigninpassword(String Signinpwd)
	   {
		   Signinpassword.sendKeys(Signinpwd);
	   }
	   
	   public void CreateSubmitLogin()
	   {
		   SubmitLogin.click();
	   }

}
