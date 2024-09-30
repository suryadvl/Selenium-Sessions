package com.seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	

		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // 3.x version
			
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // 4.x version
		    
		    
		   
		   
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
			driver.findElement(By.id("input-email")).sendKeys("Surya@gmail.com");
			
			driver.findElement(By.id("input-password")).sendKeys("surya");
			
		    driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		    

	}

}
