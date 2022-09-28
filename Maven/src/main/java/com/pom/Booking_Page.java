package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
	
	public static WebDriver driver;
	
	@FindBy(id="location")
	private WebElement Location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement room_type;
	
	@FindBy(id="room_nos")
	private WebElement no_of_rooms;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getCheck_in_date() {
		return Check_in_date;
	}

	public WebElement getCheck_out_date() {
		return Check_out_date;
	}

	public WebElement getAdults_per_room() {
		return Adults_per_room;
	}

	public WebElement getChildren_per_room() {
		return Children_per_room;
	}

	public WebElement getSearch() {
		return Search;
	}

	@FindBy(id="datepick_in")
	private WebElement Check_in_date;
	
	@FindBy(id="datepick_out")
	private WebElement Check_out_date;
	
	@FindBy(id="adult_room")
	private WebElement Adults_per_room;
	
	@FindBy(id="child_room")
	private WebElement Children_per_room;
	
	@FindBy(id="Submit")
	private WebElement Search;
	
	public Booking_Page(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
}
