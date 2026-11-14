package com.crm.Testcases;

import org.testng.annotations.Test;

import com.crm.pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class LoginPageTestCase extends BaseClass {
	
	
	@BeforeClass
	public void pageSetup() {
		System.out.println("Driver: "+ driver);
		hp = new HomePage(driver);
//		lp = new LoginPage(driver);
//		
//		System.out.println("hp : "+hp);
//		System.out.println("lp : "+lp);
		System.out.println("hp Statu Link: "+hp.getStatusofLink());
		hp.getStatusofLink();
	}

	@Test
	public void validateLogin() {
//		System.out.println("Current URL: "+driver.getCurrentUrl());
//		hp.getStatusofLink();
		System.out.println("Current URL: "+driver.getCurrentUrl());
		String url = lp.doLogin("test@gmail.com", "test123");
		Assert.assertTrue(url.contains("customers"), "Test Failed: Login Failed");
		System.out.println("Test Passed:Login Successfull");
	}
}
