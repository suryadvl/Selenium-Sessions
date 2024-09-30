package com.seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitWithPollingTime {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailID = By.id("input-email");
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10),Duration.ofSeconds(2));
		
	//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(emailID)).sendKeys("ABC@gmail.com");

		
		ElementUtil ele = new ElementUtil(driver);
		
		 ele.waitForElementAndClick(emailID, 10);
		 ele.waitForElementAndClick(emailID, 10);
		
		 
		
		
	}

}
