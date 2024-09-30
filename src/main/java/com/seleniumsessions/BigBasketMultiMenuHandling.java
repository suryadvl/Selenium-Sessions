package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiMenuHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		
		
		By level1 = By.xpath("(//span[text()='Shop by'])[2]");
		By level2 = By.linkText("Beverages");
		By level3 = By.linkText("Tea");
		By level4 = By.linkText("Tea Bags");
		
		ElementUtil ele = new ElementUtil(driver);
		ele.parentChildMenu(level1, level2, level3, level4);
		// parentChildMenu(level1,level2,level3,level4);
		
		
	}
	
	 public static void parentChildMenu(By level1 , By level2 , By level3 , By level4) throws InterruptedException {
		 
		 getElement(level1).click();
		 Thread.sleep(2000);
		 Actions act = new Actions(driver);
		 act.moveToElement(getElement(level2)).build().perform();
		 Thread.sleep(2000);
		 act.moveToElement(getElement(level3)).build().perform();
		 Thread.sleep(2000);
		 getElement(level4).click();
		 
		  
		 
		 
		 
	 }
	
	 
	 public static WebElement getElement(By locator) {
		 
		 return driver.findElement(locator);
		 
	 }
	

}
