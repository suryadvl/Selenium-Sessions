package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil1 {
	
	private WebDriver driver;
	
	 public ElementUtil1(WebDriver driver) {
		 
		 this.driver= driver;
		 
		 	 }

	
	 public void doSendKeys(By locator , String value) {
		 
		 getElement(locator);
		 
	 }
	
	public WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	
}
