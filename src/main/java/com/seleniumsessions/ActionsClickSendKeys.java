package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		
//		Actions act = new Actions(driver);
//		
//		act.sendKeys(driver.findElement(By.id("input-firstname")),"Surya").perform();
//		act.click(driver.findElement(By.name("agree"))).perform();
		
		
		

	}
	
 public static  void doActionsClick(By locator)  {
		 
		 Actions act = new Actions(driver);
		 act.click(getElement(locator)).perform();
		 
	 }
	 
	
	 public static void doActionSendKeys(By locator , String value) {
		 
		 Actions act = new Actions(driver);
		 act.sendKeys(getElement(locator),value).perform();
			act.click(driver.findElement(By.name("agree"))).perform();
		 
	 }
	
	 
	 public static WebElement getElement(By locator) {
		 return driver.findElement(locator);
		 
		 
	 }

}
