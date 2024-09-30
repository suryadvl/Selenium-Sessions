package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		
		Thread.sleep(3000);
		
		//driver.switchTo().frame(2);
		 driver.switchTo().frame("navbar");
		 
		
		String header = driver.findElement(By.tagName("h3")).getText();
		
		System.out.println(header);
		
		
	}

}
