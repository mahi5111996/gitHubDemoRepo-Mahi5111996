package com.crm.Testcases;


import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTestCase extends BaseClass {

	

	@Test(priority = 1)
	public void verifyUrl() {
		String actualURL = hp.getAPPUrl();
		Assert.assertTrue(actualURL.contains("crm"),"Test Failed:URL not Macthed!!");
		System.out.println("Test Passed:URL Matched");
	}

	@Test(priority = 2)
	public void verifyTitle() {
		String actualTitle = hp.getAPPTitle();
		Assert.assertTrue(actualTitle.contentEquals("Customer Service"),"Test Failed:Title not Macthed!!");
		System.out.println("Test Passed:Title Macthed!!");
	}

	@Test(priority = 3)
	public void validateSignInLink() {
		String loginurl = hp.getStatusofLink();
		Assert.assertTrue(loginurl.contains("crm/login.html"),"Test Failed:Login Page not opened!!");
		System.out.println("Test Passed:Navigated to Login Page");
	}

}
