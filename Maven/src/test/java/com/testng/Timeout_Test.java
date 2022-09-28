package com.testng;

import org.testng.annotations.Test;

public class Timeout_Test {
	@Test(timeOut = 5000)
	private void Login() throws InterruptedException {
		System.out.println("set property");
		Thread.sleep(3000);
		
		System.out.println("browser launch");
		
		Thread.sleep(1000);
		System.out.println("url launch");
		
		System.out.println("user credentials");
		Thread.sleep(500);
		
		System.out.println("click login");
	}

}
