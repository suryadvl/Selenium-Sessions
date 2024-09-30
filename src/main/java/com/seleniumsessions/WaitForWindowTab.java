package com.seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindowTab {


	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		Boolean flag =   wait.until(ExpectedConditions.numberOfWindowsToBe(1));
		  
		  System.out.println(flag);
	
		  

	}

}
