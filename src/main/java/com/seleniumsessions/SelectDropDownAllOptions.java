package com.seleniumsessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class SelectDropDownAllOptions {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		
		// single country validation 
		
		if(getDropDownTextList(country).contains("India")){
			
			System.out.println("PASS");
		}
		
		
		// multiple country validation , we cant write in multiple times same code.
		
		List<String> expectedCountryList = Arrays.asList("India" , "Brazil","Austria");
		
		
		if(getDropDownTextList(country).containsAll(expectedCountryList)){
			
			System.out.println("PASS");
		}
		
		
		/*
		 * Select select = new Select(getElement(country)); List<WebElement> optionsList
		 * = select.getOptions(); System.out.println(optionsList.size());
		 * 
		 * for(WebElement e : optionsList) {
		 * 
		 * String text = e.getText(); System.out.println(text);
		 * 
		 * }
		 */

	}
	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	
	public static List<String> getDropDownTextList(By locator) {
		
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();		
		
		System.out.println(optionsList.size());	
		
		List<String> optionsTextList = new ArrayList<String>();
				
		for(WebElement e : optionsList) {
			
			String text = e.getText();
			 optionsTextList.add(text);
					
		}
		
		return optionsTextList;
		
	}
	

}
