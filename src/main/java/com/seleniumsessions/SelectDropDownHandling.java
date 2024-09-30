package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		
	//	 WebElement countryEle = driver.findElement(country);
		
	//	 Select select = new Select(countryEle);
		 
//		 List<WebElement> optionList = select.getOptions();
//		 System.out.println(optionList.size());
		 
		   
		// instead of writing 3 separate methods for Select dropdown , we can write in 1 method using if else conditions
		 
		 
		 // select.selectByIndex(4);
		//  select.selectByValue("india");
		 
		//    select.selectByVisibleText("Belgium");
		
		
//	int count = getDropDownListCount(country);
// System.out.println(count-1);
	 SelectDropDownListByVisibleText(country,"India");
//	 SelectDropDownListByIndex(country,5);
//	 SelectDropDownListByIndex(country,"Belgium");
		 
		 
		   

	}
	
	
	// instead of writing 3 separate methods for Select dropdown , we can write in 1 method using if else conditions
	
//	public static void DropDown(By locator , String selectType , String text , int index , String value) {
//		
//		Select select = new Select(getElement(locator));
//		
//		switch(selectType.toLowerCase()) {
//		
//		 
//		case "visibleText":
//			select.selectByVisibleText(text);
//			break;
//			
//		case "index":
//			select.deselectByIndex(index);
//			break;
//			
//		case "value":
//			select.selectByValue(value);
//			break;	
//			
//			
//		default:
//			break;
//		}
//		
//		
		
	
	public static int getDropDownListCount(By locator) {
		
		Select select = new Select (getElement(locator));
		 return select.getOptions().size();
	}
	
	
	public static void SelectDropDownListByVisibleText(By locator, String VisibleText) {
		
		 Select select = new Select(getElement(locator));
		
		 select.selectByVisibleText(VisibleText);
		
		
	}
	
	
	public static void SelectDropDownListByIndex(By locator, int indexValue) {
		
		 Select select = new Select(getElement(locator));
		
		 select.selectByIndex(indexValue);
		
		
	}
	
	public static void SelectDropDownListByIndex(By locator, String  value) {
		
		 Select select = new Select(getElement(locator));
		
		 select.selectByValue(value);
		
		
	}
	
	
	
	public static WebElement getElement(By locator) {
		
		 return driver.findElement(locator);
		 
	}
	

}
