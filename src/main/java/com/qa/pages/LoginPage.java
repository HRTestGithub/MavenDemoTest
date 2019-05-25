package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//input[@name='username']")
	WebElement usernametxtBox;
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordtxtBox;
	@FindBy(xpath="//input[contains(@value,'Login')]")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pw ) {
		usernametxtBox.sendKeys(un);
		passwordtxtBox.sendKeys(pw);
		loginBtn.click();
		return new HomePage();
	}
	
}