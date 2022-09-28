package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Page {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement Select;
	
	@FindBy(id="continue")
	private WebElement Continue;

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect() {
		return Select;
	}
	
	public WebElement getContinue() {
		return Continue;
	}	
	
	public Select_Page(WebDriver drive) {
		
		this.driver=drive;
		PageFactory.initElements(drive,this);
	}

}
