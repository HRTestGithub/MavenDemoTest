package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginTest extends TestBase {

	public LoginPage loginPage;
	public HomePage homePage;
	
	public LoginTest() {
		super();
	}
@BeforeMethod
public void setup() {
	initialization();
	loginPage=new LoginPage();
}
@Test(priority=1)
public void loginPageTitleTest() {
	System.out.println("Running first test in LoginTest");
	String title=loginPage.validateLoginPageTitle();
	System.out.println("Login Page title is : "+title);
	Assert.assertEquals("CRMPRO Log In Screen", title);
}

@Test(priority=2)
public void verifyloginTest() {
	System.out.println("Running second test in LoginTest");
	homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	System.out.println("Login is successfull");

}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}
