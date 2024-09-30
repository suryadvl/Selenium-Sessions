package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementClick {
	
	static WebDriver driver ;

	public static void main(String[] args) {
		
		// click on button , radio , checkbox , image , testfeild , 
		
		 
		
		 BrowserUtil brutil = new BrowserUtil();
		 
		WebDriver driver =  brutil.initDriver("chrome");
		 brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		 
			/*
			 * driver.findElement(By.linkText("Login")).click();
			 * driver.findElement(By.linkText("Register")).click();
			 * driver.findElement(By.name("agree")).click();
			 */
		 By header = By.tagName("h1");
		 By sucessPageHeader = By.tagName("h1");
		 By loginLink = By.linkText("Login");
		 By Register =By.linkText("Register");
		 By name = By.name("agree");
		 
		 
		 ElementUtil eleutil = new ElementUtil(driver);
		
		 eleutil.doClick(loginLink);
		 eleutil.doClick(Register);
		 eleutil.doClick(name);
		 
		 
		 	 	 
		 
		 

	}

}
