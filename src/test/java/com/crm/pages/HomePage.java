package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.crm.utility.Utility;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	private By link = By.linkText("Sign In");
	
	public String getAPPUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getAPPTitle() {
		return driver.getTitle();
	}
	
	public String getStatusofLink() {
		Utility.getScreenShot(driver);
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
	
	
	
}
