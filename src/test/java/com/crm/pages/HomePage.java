package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	private By link = By.name("sign-in-link");
	
	public String getAPPUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getAPPTitle() {
		return driver.getTitle();
	}
	
	public String getStatusofLink() {
		driver.findElement(link).click();
		return driver.getCurrentUrl();
	}
	
	
	
}
