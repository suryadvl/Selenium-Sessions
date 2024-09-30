package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	// it is by default driver object is null , not req others to create object and access so kept private.
	private WebDriver driver ;
	
	
	
	public ElementUtil(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
      public void doClick(By locator) {
		
		getElement(locator).click();
		
	}
	
	public void doSendKeys(By locator , String value) {
		
		getElement(locator).sendKeys(value);
		
	}
	
	
	public WebElement getElement(By locator) {
		
		 return  driver.findElement(locator);
		
		
	}
	
	public String doGetElementText(By locator) {

		String eleText = getElement(locator).getText();
		if (eleText != null) {

			System.out.println(eleText);
			return eleText;
		}

		else {

			System.out.println("Title cant be empty" + eleText);
			return null;

		}
	}	

}
