package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeElementIsPresent {

	static WebDriver driver;

	public static void main(String[] args) {

		 driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By logo = By.className("img-responsive");
		
		By rightPanel = By.xpath("//div[@class='list-group']/a");
		
		By forgotPwd = By.linkText("Forgotten Password");

		// we need to get elements and size of the logo

		int logocount = getElementCount(logo);

		System.out.println(isPresentElement(logo));
		
		System.out.println(isPresentElement(logo,1));
		
		System.out.println(isPresentElement(rightPanel,13));
		
		System.out.println(isElementPresentMultipleTimes(forgotPwd));
		
		
//		if(logocount==1) {
//			System.out.println("Logo is Present");
//			
//		}
//		else {
//			System.out.println("Logo is not Present");
//		}

	}
	
	
public static boolean isnotPresentElement(By locator) {
		
		if(getElementCount(locator)==0) {
			return true;
			
		}
		
		return false;
		
	}

	 
	public static boolean isPresentElement(By locator ,int exp) {
		
		if(getElementCount(locator)==exp) {
			return true;
			
		}
		
		return false;
		
	}
	
	public static boolean isPresentElement(By locator) {
		
		if(getElementCount(locator)==1) {
			return true;
			
		}
		
		return false;
		
	}
	
public static  boolean isElementPresentMultipleTimes(By locator ) {
  		
  		if(getElementCount(locator)>=1) {
  			return true;
  			
  		}
  		
  		return false;
  		
  	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static int getElementCount(By locator) {

		return getElements(locator).size();

	}

}
