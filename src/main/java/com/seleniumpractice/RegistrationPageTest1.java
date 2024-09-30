package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest1 {

	public static void main(String[] args) {
		
/* creating browserutil object to access the custom methods */	
		
		BrowserUtil1 brutil1 = new BrowserUtil1();
		WebDriver driver = brutil1.initBrowser("chrome");
		brutil1.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brutil1.getTitle();
		System.out.println(title);
		
		
	/*  Identifyin the elements by ID and storing it for further need */
		
		 By fName = By.id("input-firstname");
		 By lName = By.id("input-lastname");
		 By emailId = By.id("input-email");
		 By TeleNum = By.id("input-telephone");
		 By pwd = By.id("input-password");
		 By confirmPwd = By.id("input-confirm");
		 
		 
		 /* creating ElementUtil object and passing driver object(to be in same session)to access the custom methods */ 
		 
		 ElementUtil1 eleutil1 = new ElementUtil1(driver);
		 
		 eleutil1.doSendKeys(fName, "Surya");
		 eleutil1.doSendKeys(lName, "Danda");
		 eleutil1.doSendKeys(emailId, "suryanarayana.dvl@gmail.com");
		 eleutil1.doSendKeys(TeleNum, "1234567890");
		 eleutil1.doSendKeys(pwd, "Test");
		 eleutil1.doSendKeys(confirmPwd, "Test");
		 
		 /* closing the browser */
          
	}

}
