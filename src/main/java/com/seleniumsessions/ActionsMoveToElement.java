package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		
	 By parentMenu =By.xpath("//div[text()='Add-ons']");
     By childMenu  =By.xpath("//div[text()='Visa Services']");
     
     ElementUtil ele = new ElementUtil(driver);
     ele.parentChildMenu(parentMenu, childMenu);
		
	 //   parentChildMenu(parentMenu,childMenu);
		
	//	parentChildMenu("Add-ons","Visa Services");
	    
	    

	}
	
	
	public static void parentChildMenu(By parentMenu , By childMenu) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(5000);
		
		getElement(childMenu).click();	
		
	}
	
	
	public static void parentChildMenu(String parentMenu , String childMenu) throws InterruptedException {
		
		Actions action = new Actions(driver);
		
		action.moveToElement(getElement(By.xpath("//div[text()='"+parentMenu+"']"))).perform();
		Thread.sleep(5000);
		
		getElement(By.xpath("//div[text()='"+childMenu+"']")).click();	
		
	}
	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}

}
