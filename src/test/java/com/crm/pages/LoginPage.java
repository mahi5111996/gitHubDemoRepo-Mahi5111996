package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.utility.Utility;

public class LoginPage {
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By email = By.id("email-id");
	private By password = By.id("password");
	private By submitButton = By.name("submit-name");
	
	public String doLogin(String Email,String Pwd) {
		driver.findElement(email).sendKeys(Email);
		driver.findElement(password).sendKeys(Pwd);
		driver.findElement(submitButton).click();
		Utility.getScreenShot(driver);
		return driver.getCurrentUrl();
	}

}
