package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NullWithSendKeys {

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
	       
	       WebDriver driver =  brutil.initDriver("chrome");
	      
	      brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		  
	      driver.findElement(By.id("input-email")).sendKeys(null);
	      
	      /* Exception in thread "main" java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence
	  	at org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:92)
		at com.seleniumsessions.NullWithSendKeys.main(NullWithSendKeys.java:16)*/

		
	  //    driver.findElement(By.id("input-email")).sendKeys("");

        /* when we enter empty string in sendkeys ,not getting any output */
	      
	      
	       

	}

}
