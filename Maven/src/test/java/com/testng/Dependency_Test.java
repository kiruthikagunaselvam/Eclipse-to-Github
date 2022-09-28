package com.testng;

import org.testng.annotations.Test;

public class Dependency_Test {
	@Test()
	private void setProperty() {
System.out.println("set property");
}

	@Test(dependsOnMethods = "setProperty")
	private void browser_Launch() {
		System.out.println("browser launch");
	}
	
	@Test(dependsOnMethods = "browser_Launch")
	private void url_Launch() {  
System.out.println("url lauch");
	}
	
	@Test(dependsOnMethods = "url_Launch")
	private void login_Page() {
System.out.println("login page");
	}
	
}