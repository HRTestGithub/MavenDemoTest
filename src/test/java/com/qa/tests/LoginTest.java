package com.qa.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
public WebDriver driver;

@BeforeMethod
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://classic.crmpro.com/login.cfm");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@Test
public void verifyCRMLogin() {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Hafiz123");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test123");
	driver.findElement(By.xpath("//input[contains(@value,'Login')]")).click();
	System.out.println("Login Successfull");
}
}
