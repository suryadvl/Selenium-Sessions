package com.seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	
	static WebDriver driver ;
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By images =By.tagName("img");
		By links = By.tagName("a");
		
		ElementUtil eleutil = new ElementUtil(driver);
		
		List<String> eleTextList = eleutil.getElementsTextList(links);
			
		eleutil.PrintElementTextList(links);
		 
		
	}
	
//	
//	public static void PrintElementTextList(By locator) {
//		
//		List<String> eleTextList = getElementsTextList(locator);
//		
//		for(String e : eleTextList) {
//			System.out.println(e);
//			
//		}
//	}
//	
//	 public static List<String> getElementsTextList(By locator) {
//		 
//				
//		 
//		 List<WebElement> eleList = getElements(locator);
//		 List<String> eleTextList = new ArrayList<String>();
//		 
//		 for(WebElement e: eleList) {
//			 
//			 String eleText = e.getText();
//			 if(eleText.length()!=0) {
//				 
//				 eleTextList.add(eleText);
//				 
//			 }
//		 }	 
//		 
//			 return eleTextList;
//			 
//	 }	 
//	 
//		
//	
//	  public static List<WebElement> getElements(By locator) {
//		  
//		   return driver.findElements(locator);
//		  
//	  }
//	  
//
//	  public static int getElementCount(By locator) {
//		  
//		  return getElements(locator).size();
//		  
//	  }
//	
	
}

	

	
	
	
	