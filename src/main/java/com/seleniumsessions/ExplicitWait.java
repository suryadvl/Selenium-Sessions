package com.seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExplicitWait {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	   
		// Explicit wait -> WebDriverWait and Fluent Wait
		
		// Wait(I)-> until(); -> FluentWait(C)-> until() + individual methods () -> 
		//  ->extends WebDriverWait(C) -> no methods
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailID = By.id("input-email");
		By pwd = By.id("input-password");
		
		By loginbtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		
//		 WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
//		
//		 email_ele.sendKeys("Surya@gmail.com");
		
	//	waitForElementPresence(emailID,10).sendKeys("Surya@gmail.com");
		
		waitForElementVisibility(emailID,10).sendKeys("Surya@gmail.com");
		
		getElement(pwd).sendKeys("Test1234");
		getElement(loginbtn).click();
		
		
		 
		 
	}

	
	public static WebElement waitForElementPresence(By locator , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return  wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	
	public static WebElement waitForElementVisibility(By locator , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return  wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
}
