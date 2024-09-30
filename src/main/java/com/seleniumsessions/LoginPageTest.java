package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {

       BrowserUtil brutil = new BrowserUtil();
       
       WebDriver driver =  brutil.initDriver("chrome");
      
      brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
      
      System.out.println(brutil.getPageTitle());
      
      
      By emailId3 = By.id("input-email");
	  By password3= By.id("input-password");
	  

	  ElementUtil eleutil = new ElementUtil(driver);
	  eleutil.doSendKeys(emailId3, "Test@gmail.com");
	  eleutil.doSendKeys(password3, "Test123");
	  
	  brutil.closeBrowser();
		
      
      
		
	}

}
