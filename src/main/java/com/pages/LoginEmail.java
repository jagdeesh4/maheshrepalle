package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginEmail {
	final WebDriver driver;
	
	
	
	public LoginEmail(WebDriver driver)
	{
		this.driver=driver;
		
	}
	@FindBy(xpath="")
	WebElement userName;
	
	

}
