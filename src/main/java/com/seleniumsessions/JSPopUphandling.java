package com.seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUphandling {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	
		// JavaScript Popups alerts  are 3 types - alert , confirm and prompt 
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();
		
		// alert.dismiss();
		
		
	// 2.Confirm popup 
//	
//	driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		
//	Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept();
	
		
	// 3. Prompt 
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Surya");
		
		alert.accept();
		
		
	}

}
