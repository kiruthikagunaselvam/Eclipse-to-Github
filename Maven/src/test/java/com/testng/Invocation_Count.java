package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = 0)
	private void browser_Launch() {
		System.out.println("browser launch");
	}
	
	@Test (priority=1)
	private void url_Launch() {  //if no priority given it will be considered as 0
System.out.println("url lauch");
	}
	
	@Test(priority= -1)
	private void setProperty() {
System.out.println("set property");
}

@Test(invocationCount = 4,priority = 2)
private void refresh() {
System.out.println("refresh");
}
}