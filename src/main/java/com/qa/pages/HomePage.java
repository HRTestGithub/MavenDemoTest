package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//td[@class='headertext'][1]")
	WebElement loggedInUser;
	
	@FindBy(xpath="//td[@class='headertext'][3]")
	WebElement todaysDate;
	
	@FindBy(xpath="//td[text()='CRMPRO']")
	WebElement CRMImage;
	
	@FindBy(xpath="//input[@src='https://classic.crmpro.com/skins/flatter/images/search.gif']")
	WebElement searchImage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void checkLoggedInUser() {
		String lu=loggedInUser.getText();
		System.out.println("Logged in user is : "+lu);
	}
	
	public void checktodaysDate() {
		System.out.println("Todays Date is :"+todaysDate.getText());
	}
	
	public void checkImage() {
		System.out.println("CRM image displayed :"+CRMImage.isDisplayed());
	}
	
	public void clickSearchImg() {
		System.out.println("Clicking on search link");
		searchImage.click();
	}

}
