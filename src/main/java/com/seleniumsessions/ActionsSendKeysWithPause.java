package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		
		By firstname = By.id("input-firstname");
		
	//	WebElement firstnameele = driver.findElement(By.id("input-firstname"));
		
	//	Actions act = new Actions(driver);
		
		String myName = "Surya";
//				
//		char ch[] = myName.toCharArray();  // toCharArray is used to convert the 
//		
//		for(char c :ch) {
//			act.sendKeys(firstnameele, String.valueOf(c)).pause(200).perform();
//			
		
		
//			
//		}
//		
		
		doSendKeysWithPause(firstname,myName,200);
		
		

	}
	
	 public static  void doSendKeysWithPause(By locator , String value , long pausetime ){
		 
		 Actions act = new Actions(driver);
			
								
			char ch[] = value.toCharArray();
			for(char c :ch) {
				act.sendKeys(getElement(locator), String.valueOf(c)).pause(pausetime).perform();
				
				
			}
			
		  
		 
	 }
	
	 
	 public static WebElement getElement(By loctor) {
		 return driver.findElement(loctor);
		 
	 }
	

}
