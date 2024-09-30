package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendKeysWithCharSequences {

	public static void main(String[] args) {

  
		BrowserUtil brutil = new BrowserUtil();
	       
	       WebDriver driver =  brutil.initDriver("chrome");
	      
	      brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	      
	      String name = "Surya";
	      StringBuilder sb = new StringBuilder("Learning Automation from");
	      StringBuffer sf = new  StringBuffer("Naveen");
	      driver.findElement(By.id("input-email")).sendKeys(name,"" ,sb,"" ,sf);
	      
		
		

	}

}
