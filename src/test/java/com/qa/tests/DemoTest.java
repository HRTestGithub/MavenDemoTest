package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test(priority=1, enabled=false)
	public void sum() {
		System.out.println("SUM of class DemoTest");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	@Test(priority=2, enabled=false)
	public void sub() {
		System.out.println("SUB of class DemoTest");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
}
