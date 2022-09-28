package com.runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.sdp.Page_Object_Manager;

import baseclass.Base_Class;

public class Runner_Class extends Base_Class {
			
		public static WebDriver driver = Base_Class.getBrowser("firefox");
		
		public static Page_Object_Manager pom =  new Page_Object_Manager(driver);
		
		public static void main(String[] args) throws IOException, InterruptedException {
			
		driver = getUrl("https://adactinhotelapp.com/index.php");
		
		inputValue(pom.getlp().getUsername(), "KeerthiGuna");
		
		inputValue(pom.getlp().getPassword(), "LMSABD");
		
		clickOnElement(pom.getlp().getLoginbutton());	
		
		dropDown(pom.getbp().getLocation(),"SelectByIndex","1");
		
		dropDown(pom.getbp().getHotels(),"SelectByIndex","2");
		
		dropDown(pom.getbp().getRoom_type(),"SelectByIndex","3");
		
		dropDown(pom.getbp().getNo_of_rooms(),"SelectByIndex","1");
		
		inputValue(pom.getbp().getCheck_in_date(),"05/07/2022");
		
		inputValue(pom.getbp().getCheck_out_date(),"06/07/2022");
		
		dropDown(pom.getbp().getAdults_per_room(),"SelectByIndex","2");
		
		dropDown(pom.getbp().getChildren_per_room(),"SelectByIndex","2");
		
		clickOnElement(pom.getbp().getSearch());
		
		clickOnElement(pom.getsp().getSelect());
		
		clickOnElement(pom.getsp().getContinue());
		
		inputValue(pom.getbn().getFirst_name(),"Keerthi");
		
		inputValue(pom.getbn().getLast_name(),"Guna");
		
		inputValue(pom.getbn().getAddress(),"Chennai");
		
		inputValue(pom.getbn().getCredit_card_no(),"1234567899999999");
		
		dropDown(pom.getbn().getCc_type(),"SelectByIndex","2");
		
		dropDown(pom.getbn().getExp_month(),"SelectByIndex","8");
		
		dropDown(pom.getbn().getExp_year(),"SelectByIndex","12");
		
		inputValue(pom.getbn().getCvv(),"477");
		
		clickOnElement(pom.getbn().getBook_now());
		
		clickOnElement(pom.getlo().getLogout());
		
		takeScreenShot("booked");
		
		driver = close();
		
		driver = quit();
		
		}

}
