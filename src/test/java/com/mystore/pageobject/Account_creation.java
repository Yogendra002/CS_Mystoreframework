package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_creation {
	
	//1.create object of webdriver
	  WebDriver ldriver;

	  //2.Create constructor
	  public Account_creation(WebDriver rdriver)
	   {
	      ldriver=rdriver;
	      PageFactory.initElements(rdriver,this);
	   }

	   //3.identify webelements on webpage
	  @FindBy(id="id_gender1")
	   WebElement gender;
	   
	  @FindBy(id="customer_firstname")
	   WebElement firstname;
	   
	  @FindBy(xpath="//input[@id='customer_lastname']")
	   WebElement lastname;
	   
	  @FindBy(id="passwd")
	   WebElement password;
	  
	 // @FindBy(id="days")
	   //WebElement days;
	  
	 // @FindBy(id="months")
	  // WebElement months;
	  
	 // @FindBy(id="years")
	 //  WebElement years;
	  
	  @FindBy(id="newsletter")
	   WebElement newsletter;
	  
	  
	  @FindBy(id="firstname")
	   WebElement firstnameagain;
	  
	  @FindBy(xpath="//input[@id='lastname']")
	   WebElement lastnameagain;
	  
	  @FindBy(id="company")
	   WebElement company;
	  
	  @FindBy(xpath="//input[@id='address1']")
	   WebElement Address;
	  
	  @FindBy(xpath="//input[@id='city']")
	   WebElement city;
	  
	  @FindBy(id="id_state")
	   WebElement state;
	  
	  @FindBy(xpath="//input[@id='postcode']")
	   WebElement zipcode;
	  
	  @FindBy(id="id_country")
	   WebElement country;
	  
	  @FindBy(id="phone_mobile")
	   WebElement mobile;
	  
	  @FindBy(xpath="//input[@id='alias']")
	   WebElement alias;
	  
	  
	  @FindBy(id="submitAccount")
	   WebElement submit;
	  
	  public void genderverified()
	  {
		  gender.click();
	  }
	  
	  public void firstnameverified(String first)
	  {
		  firstname.sendKeys(first);
		  
	  }
	  
	  
	   
	  public void lastnameverified(String last)
	  {
		  lastname.sendKeys(last);
	  }
	  
	  
	  
	  public void passwordverified(String pwd)
	  {
		  password.sendKeys(pwd);
	  }
	  
	  
	  public void newsletterverified()
	  {
		  newsletter.click();
	  }
	  
	  public void firstnameagainverified(String firstagain)
	  {
		  firstnameagain.clear();
		  firstnameagain.sendKeys(firstagain);
	  }
	  
	  public void lastnameagainverified(String lastagain)
	  {
		  lastnameagain.clear();
		  lastnameagain.sendKeys(lastagain);
	  }
	  
	 
	  public void  companyverify(String cpy)
	  {
		  company.sendKeys(cpy);
	  }
	  
	  
	  public void Addressverified(String Ads)
	  {
		   Address.sendKeys(Ads);
	  }
	  
	  
	  public void cityverified(String cty)
	  {
		  city.sendKeys(cty);
	  }
	  
	  public void stateverified(String ste)
	  {
		  state.sendKeys(ste);
	  }
	  
	  public void zipcodeverified(String code)
	  {
		  zipcode.sendKeys(code);
	  }
	  
	  public void countryverified(String ctry)
	  {
		  country.sendKeys(ctry);
	  }
	  
	  public void mobileverified(String mb)
	  {
		  mobile.sendKeys(mb);
	  }
	  
	  public void aliasverified(String al)
	  {
		  alias.clear();
		  alias.sendKeys(al);
	  }
	  
	  public void submitverified()
	  {
		  submit.click();
	  }
	  

	  
}
