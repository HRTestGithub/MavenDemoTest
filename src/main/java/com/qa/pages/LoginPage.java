package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	/*@FindBy(xpath="//input[@name='username']")
	WebElement usernametxtBox;
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordtxtBox;
	@FindBy(xpath="//input[contains(@value,'Login')]")
	WebElement loginBtn;*/
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void CRMLogin(String usernm, String passwd) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usernm);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(passwd);
		driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	}
}
