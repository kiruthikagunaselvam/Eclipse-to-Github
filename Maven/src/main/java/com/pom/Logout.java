package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
public static WebDriver driver;
	
	@FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement Logout;

	public Logout(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver, this);	
		
	}	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
}
