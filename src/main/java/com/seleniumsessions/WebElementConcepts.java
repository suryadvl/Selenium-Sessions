package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {

	static WebDriver driver;
	public static void main(String[] args) {


		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// create a webelement and perform action (click , sendKeys , getText , IsDisplayed)
		
		// 1. Approach
		//driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
		//driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//2. Approach - is better whenver we want to send suer name and pwd , we can use the webelement
		
	//	WebElement emailId = driver.findElement(By.id("input-email"));
		
	//	WebElement password = driver.findElement(By.id("input-password"));
		
	//	emailId.sendKeys("test@gmail.com");
	//	password.sendKeys("input-password");*/
		
		
		// 3. Approach - By locator
		
	//	By emailId = By.id("input-email");
	//	By password = By.id("input-password");
	//	WebElement email_ele = driver.findElement(emailId);
	//	WebElement password_ele = driver.findElement(password);
		
	//	email_ele.sendKeys("tom@gmail.com");
	//	password_ele.sendKeys("tom@123");
		
		
		
		
		//4. Appraoch - By locator + generic method  - custom method
		
	//	By emailId1 = By.id("input-email");
	//	By password1= By.id("input-password");
		
	//	getElement(emailId1).sendKeys("tom@gmail.com");
	//	getElement(password1).sendKeys("tom@123");
	
		
		
		
		//5. By locator + generic method for webelement and action
		
		
		//  By emailId2 = By.id("input-email");
		//  By password2= By.id("input-password");
		  
		//  doSendKeys(emailId2,"tom@gmail.com");
		//  doSendKeys(password2,"test@123");
		 
		
		
		
		// 6. By locator + generic method for webelement and actions in util classes
		
		By emailId3 = By.id("input-email");
		By password3= By.id("input-password");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendKeys(emailId3, "tom@gmail.com");
		eleutil.doSendKeys(password3, "Tets@123");
		
		
	}
	
	
	public static void doSendKeys(By locator , String value) {
		
		getElement(locator).sendKeys(value);
		
				
	}
	
	
	 public static WebElement getElement(By locator) {
		  
		 return driver.findElement(locator);
		  
	  }

}
