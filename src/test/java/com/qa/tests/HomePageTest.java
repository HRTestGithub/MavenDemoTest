package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	public LoginPage loginPage;
	public HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
	}
	
	@Test(priority=3)
	public void loggedInUserTest() throws InterruptedException {
		System.out.println("Running first test in HomePageTest");
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("Login is successfull");
		driver.switchTo().frame("mainpanel");
		Thread.sleep(3000);
		homePage.checkLoggedInUser();
		
	}
	
	@Test(priority=4)
	public void todaysDateTest() throws InterruptedException {
		System.out.println("Running second test in HomePageTest");
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("Login is successfull");
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		homePage.checktodaysDate();
		
	}
	
	@Test(priority=5)
	public void CRMImageTest() throws InterruptedException {
		System.out.println("Running third test in HomePageTest");
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		System.out.println("Login is successfull");
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		homePage.checkImage();
		
	}
	
	@Test(priority=6)
	public void verifySearch() {
		System.out.println("Running fourth test in HomePageTest");
		homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		driver.switchTo().frame("mainpanel");
		homePage.clickSearchImg();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
