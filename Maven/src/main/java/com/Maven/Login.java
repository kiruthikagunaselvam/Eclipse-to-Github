package com.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
private WebDriver driver;
@FindBy(name="username")
private WebElement username;
@FindBy(name="Password")
private WebElement password;
@FindBy(name="Login")
private WebElement Loginbutton;

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

public Login(WebDriver driver1) {
this.driver=driver1;
PageFactory.initElements(driver1, this);
}

}
