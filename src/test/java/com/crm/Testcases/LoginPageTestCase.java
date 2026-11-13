package com.crm.Testcases;

import org.testng.annotations.Test;

import com.crm.pages.HomePage;

import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTestCase extends BaseClass {
	@BeforeClass
	public void pageSetup() {
		HomePage hp = new HomePage(driver);
		System.out.println(hp.getStatusofLink());
		hp.getStatusofLink();
	}

	@Test
	public void validateLogin() {
		String url = lp.doLogin("test@gmail.com", "test123");
		Assert.assertTrue(url.contains("customers"), "Test Failed: Login Failed");
		System.out.println("Test Passed:Login Successfull");
	}
}
