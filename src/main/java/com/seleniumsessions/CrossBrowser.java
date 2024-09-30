package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowser {

	public static void main(String[] args) {
		
		String browser = "Edge";
		WebDriver driver = null;
		
		switch(browser.trim().toLowerCase()){
			
			case "chrome" :
				
			driver = new ChromeDriver();	
				
			break;
			

			case "edge" :
				
			driver = new EdgeDriver();	
				
			break;
			
			case "firefox" :
				
			driver = new FirefoxDriver();	
				
				break;
				
			case "safari" :
				driver = new SafariDriver();	
				
				break;
				
				default: 
					System.out.println("Please pass right browser" +browser);
				break;
			
		}
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
        driver.quit();
		
	}

}
