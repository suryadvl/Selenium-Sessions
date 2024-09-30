package com.seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {

		// wait (I) (until();) -> FluentWait(c) : until(){} + individual methods ()({}
		
		                          // -> WebDriverWait (c) : no methods
		

		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		By firstName = By.id("Form_getForm_Name1");
		
		
	     Wait<WebDriver> wait = new FluentWait<WebDriver> (driver)
	    		                  .withTimeout(Duration.ofSeconds(10))
	    		                  .pollingEvery(Duration.ofSeconds(2))
	    		                  .ignoring(NoSuchElementException.class)
	    		                  .withMessage("=====Element is not found======"+ firstName);
	     
					
	     wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Surya");
	     

	     
	}

}