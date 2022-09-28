package com.testng;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class)
	private void Math() {
		
		
		int s= 25;
		
		System.out.println(s/0);
	}
}
