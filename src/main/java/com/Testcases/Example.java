package com.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.LoginEmail;

public class Example {
	static WebDriver driver;
@BeforeGroups
public void startBrowser()
{
	System.out.println("Before Method");
	
}
@Test
public void test() {
	LoginEmail loginEm=PageFactory.initElements(driver, LoginEmail.class);
	
	System.out.println("First Example test");
}
@Test
public void test2() {
	System.out.println("Second Example test");
}
@AfterGroups
public void EndBrowser()
{
	System.out.println("After method");
	
}

}
