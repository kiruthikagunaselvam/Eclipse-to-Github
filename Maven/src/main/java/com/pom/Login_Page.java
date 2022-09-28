package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public static WebDriver driver;
	
	@FindBy(name="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement Loginbutton;

	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return Loginbutton;
	}

	
	}
