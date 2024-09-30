package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropDownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		
		selectDropDownValue(countryOptions,"India");
		
		// without using select method in dropdown , fetching the list of countries
		
		/*
		 * List<WebElement> optionsList = driver.findElements(country);
		 * System.out.println(optionsList.size());
		 * 
		 * for(WebElement e : optionsList) {
		 * 
		 * String text = e.getText(); System.out.println(text);
		 * 
		 * 
		 * // to select india country
		 * 
		 * if(text.equals("India")) {
		 * 
		 * e.click(); break; }
		 * 
		 * }
		 * 
		 */
		  
		  
	}
	
	
	 public static void selectDropDownValue(By locator , String value) {
		 
		 List<WebElement> optionsList = driver.findElements(locator);
		 System.out.println(optionsList.size());
		 		
		  for(WebElement e : optionsList) {
			
			String text = e.getText();
			  System.out.println(text);
			  
			  
			  // to select india country 
			  
			  if(text.equals(value)) {
				  
				  e.click(); 
				  break;
			  }
			 
		  }
		
		 
		 
	 } 
	  

}
