package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldvalue {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		/*
		 * driver.get(
		 * "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		 * 
		 * driver.findElement(By.id("input-email")).sendKeys("ABC@gmail.com");
		 * 
		 * String text = driver.findElement(By.id("input-email")).getAttribute("value");
		 * 
		 * System.out.println(text);
		 */
	      
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	      
		 By emailText = By.id("input-email");
		 
		 ElementUtil eleutil = new ElementUtil(driver);
		 eleutil.doSendKeys(emailText, "ABC@gmail.com");
		 
		 String s = eleutil.doElementGetAttribute(emailText, "value");
		 System.out.println(s);
		 
		 
	}

}
