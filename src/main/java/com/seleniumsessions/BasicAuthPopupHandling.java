package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthPopupHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		String username = "admin";
		String pwd = "admin";
	
		// JavaScript Popups alerts  are 3 types - alert , confirm and prompt 
		
	//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		driver.get("https://"+username+ ":"+pwd+ "@"+"the-internet.herokuapp.com/basic_auth");
		
		// auth pops are not JS alerts and cannot switch to alert , you need to submit the user and pwd in url 
		
		

	}

}
