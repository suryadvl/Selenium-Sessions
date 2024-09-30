package com.seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchUrl {

	public static void main(String[] args) {
		
		// launching the Chrome driver
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//get the URL 
		driver.get("https://www.selenium.dev/");
		
		
		// Validating the title
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase("selenium")) {
			
			System.out.println("Testcase pass"+title);
		}
		
		else {
			
			System.out.println("Testcase fail" +title);
		}
			
		
		// closing the driver object
		
		driver.quit();
		
	}
	
	

}
