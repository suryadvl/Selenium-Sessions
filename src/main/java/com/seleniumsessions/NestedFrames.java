package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-scenario/");  // main page 
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("pact1"); // f1 frame 
		
	     
		
		
	}

}
