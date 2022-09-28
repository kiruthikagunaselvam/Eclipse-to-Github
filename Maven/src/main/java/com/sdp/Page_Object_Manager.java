package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.Book_Now;
import com.pom.Booking_Page;
import com.pom.Login_Page;
import com.pom.Logout;
import com.pom.Select_Page;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private Login_Page lp;
	
	private Booking_Page bp;
	
	private Select_Page sp;
	
	private Book_Now bn;
	
	private Logout lo;
	
	public Page_Object_Manager(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(abc,this);
		
	}
	
	public Login_Page getlp() {
		lp = new Login_Page(driver);
		return lp;
		
	}
	public Booking_Page getbp() {
		bp = new Booking_Page(driver);
		return bp;
	}
	
	public Select_Page getsp() {
		sp = new Select_Page (driver);
		return sp;
	}
	
	public Book_Now getbn() {
		bn = new Book_Now(driver);
		return bn;
	}
	
	public Logout getlo() {
		lo = new Logout(driver);
		return lo;
		
	}

}
