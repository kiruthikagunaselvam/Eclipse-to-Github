package com.testng;

import org.testng.annotations.Test;

public class Priority_Test {

	@Test(priority = -4)
	private void browser_Launch() {
		System.out.println("browser launch");
	}
	
	@Test
	private void url_Launch() {  //if no priority given it will be considered as 0
System.out.println("url lauch");
	}
	
	@Test(priority = 1 )
	private void women() {
System.out.println("women");
	}
	
	@Test(priority = 2)
	private void dresses() {
System.out.println("dresses");
	}
	
	@Test(priority= -5)
	private void setProperty() {
System.out.println("set property");

	}
}
