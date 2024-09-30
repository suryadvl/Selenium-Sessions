package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		
		//back and forth simulation in browser is there , forward and back buttons in browser
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(1000);
		
		driver.navigate().to("https://amazon.com");
		System.out.println(driver.getTitle());

		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
	}

}
