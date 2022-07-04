package com.mystore.testcases;


import java.io.IOException;

import org.testng.annotations.Test;

import com.mystore.pageobject.Account_creation;
import com.mystore.pageobject.IndexPage;
import com.mystore.pageobject.MyAccount;
import com.mystore.pageobject.Name_Valifdation;

import junit.framework.Assert;


public class TC_MyAccountTest extends BaseClass 
{
	@Test(priority=0)
	public void verifiyRegistrationAndLogin() throws IOException, InterruptedException
	{
		
		IndexPage pg = new IndexPage(driver);
		Thread.sleep(1000);
		pg.clickOnSignIn();
		Thread.sleep(1000);
		
		
		MyAccount pg1 = new MyAccount(driver);
	    pg1.creatEmail("kyahero01@gmail.com");
	    Thread.sleep(1000);
	    pg1.submitCreate();
	    
	    Account_creation account = new Account_creation(driver);
	    account.genderverified();
	    account.firstnameverified("Yogendra");
	    account.lastnameverified("kumar");
	    account.passwordverified("123456");
	    account.newsletterverified();
	    account.firstnameagainverified("Yogendra");
	    account.lastnameagainverified("kumar");
	    Thread.sleep(1000);
	    account.companyverify("testingsss");
	    account.Addressverified("testing");
	    account.cityverified("tests");
	    account.stateverified("Florida");
	    account.zipcodeverified("65443");
	    account.countryverified("United states");
	    account.mobileverified("988775511");
	    account.aliasverified("testing 765");
	    account.submitverified();
	
	    Name_Valifdation name = new Name_Valifdation(driver);
	    String username = name.userValidaation();
	    if(username.equals("Yogendra kumar"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	capturescrrenshot(driver,"verifiyRegistrationAndLogin");
	    	Assert.assertTrue(false);
	    }
	}
	
	@Test(priority=1)
	public void Verifylogin() throws InterruptedException, IOException
	{
		driver.navigate().back();
		
		MyAccount pg1 = new MyAccount(driver);
		pg1.createSigninemail("kyahero01@gmail.com");
		pg1.createSigninpassword("123456");
		pg1.CreateSubmitLogin();
		Thread.sleep(3000);
		Name_Valifdation name = new Name_Valifdation(driver);
	    String username = name.userValidaation();
	    if(username.equals("Yogendra kumar"))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	capturescrrenshot(driver,"verifiyRegistrationAndLogin");
	    	Assert.assertTrue(false);
	    	
	    }
	}
}	
		
	
