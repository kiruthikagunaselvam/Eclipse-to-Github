package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Test {
//	@Test //Hard Assert - Validation
//	private void Demo() {
//		String expected = "james";
//		
//		String actual = "jason";
//		
//		Assert.assertNotEquals(actual, expected);
//		
//		System.out.println("Data Validation");
//
//	}
	@Test
	private void Demo() {
		String expected = "james";
		
		String actual = "jason";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(actual, expected);
		
		System.out.println("Data Verification");
		
	}
}
