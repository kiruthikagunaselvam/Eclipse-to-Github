package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Test {
	
	@Test
	private void Women() {
System.out.println("women");
	}
	
	@Test(enabled=false)
	private void men() {
System.out.println("men");
	}
	@Ignore
	@Test
	private void dresses() {
System.out.println("dresses");
	}
	
	@Test
	private void tshirt() {
System.out.println("tshirt");
	}

}
