package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForFrame {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html"); //page
		
		By frameLocator = By.name("main");
		
		ElementUtil ele = new ElementUtil(driver);
		
		ele.waitForFrameUsingLocatorAndSwitchToit(10, frameLocator);
		
		String header = driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(header);
		
		

	}

}
