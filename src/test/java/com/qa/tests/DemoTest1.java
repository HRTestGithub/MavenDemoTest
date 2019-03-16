package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	@Test(priority=3)
	public void sum() {
		System.out.println("SUM of class DemoTest1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	@Test(priority=4)
	public void sub() {
		System.out.println("SUB of class DemoTest1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
}