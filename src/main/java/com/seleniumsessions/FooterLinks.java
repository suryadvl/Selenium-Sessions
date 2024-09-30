package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		 By footerLinks = By.xpath("//div[@class='col-sm-3']/ul");
		
		 
		 
		 ElementUtil eleutil = new ElementUtil(driver);
		
		 
		// In Print Element TextList  method , we are using get element method and fetching the list of WebElements
		// and converting to list of string and printing each string in the list.
		 
		 eleutil.PrintElementTextList(footerLinks);
		 
			

	}
	
//	  public static List<WebElement> getElements(By locator){
//		  
//		   return driver.findElements(locator);
//		  
//		  
//	  }
//
//	  
//	  public static void getElementsCount(By locator) {
//		  
//		  System.out.println(getElements(locator).size());
//		  
//	  }
	  
}
