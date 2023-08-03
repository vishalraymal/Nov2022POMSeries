package com.qa.opencart.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.opencart.base.BaseTest;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginPageTitleTest() {
		String actualTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(actualTitle, "Account Login");
	}
	
	@Test
	public void loginPageURLTest() {
		String actualURL = loginPage.getLoginPageURL();	
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}
	
	@Test
	public void forgotPwdLinkExistsTest() {
		boolean flag= loginPage.isForgotPwdLinkExist();
		Assert.assertTrue(flag);
	}
	
	@Test
	public void loginPage() {
		loginPage.doLogin("naveen@gmail.com", "test@123");
	}

	@Test
	public void testOne() {
		System.out.println("Test");
	}
}
