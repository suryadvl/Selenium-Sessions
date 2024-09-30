package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.seleniumpractice.ElementUtil;

public class ElementException {

	public static void main(String[] args) {


		BrowserUtil brutil = new BrowserUtil();
	       
	       WebDriver driver =  brutil.initDriver("chrome");
	      
	      brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	      
	        WebElement element = driver.findElement(By.id("input-email1"));
	         
	         element.sendKeys("ABC@gmail.com"); // no such elemen exception wil appear - id is wrong.
	      
	         
	         
	       
		
	      

	}

}
