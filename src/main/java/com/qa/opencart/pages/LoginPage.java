package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;

	//1. Private by locators
	private By emailId = By.id("input-email");
	private By password = By.id("input-password");
	private By loginBtn = By.xpath("//input[@type='submit']");
	private By forgetPwdLink = By.linkText("Forgotten Password");
	
	
	//2. Page constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. Page actions/Methods
	public String getLoginPageTitle() {
		String title = driver.getTitle();
		System.out.println("Login page title : "+ title);
		return title;
	}
	
	public String getLoginPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("Login page url : " + url);
		return url;
	}
	
	public Boolean isForgotPwdLinkExist() {
		return driver.findElement(forgetPwdLink).isDisplayed();	
	}
	
	public void doLogin(String un, String pwd) {
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(loginBtn).click();
	}

}
