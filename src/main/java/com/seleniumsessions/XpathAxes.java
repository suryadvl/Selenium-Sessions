package com.seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	static WebDriver driver;
	public static void main(String[] args) {


		driver = new ChromeDriver();

	//	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		// normalize -space is function we use for space in webelement text and its only for text based element.
		
	//	driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		// Parent to  direct child
		//    ->//form[@id='hs-login']//input[@id='username']

		
		//*** child to parent :
		
		// //input[@id='username']/../../../../../../../../../../../../
		
		//  //input[@id='username']/parent::div
		
		//*** child to grandparent 
		
		// //input[@id='username']/ancestor::form
		
		
		// webtable => joe root checkbox 
		
			
	//	driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr/td/input[@type='checkbox']")).click();
		
   //  	driver.findElement(By.xpath("//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
//	
//		 selectUser("Joe.Root");
//		 selectUser("Jasmine.Morgan");
//		 System.out.println(getUserDetails("Jasmine.Morgan"));
//		 
		
		
	}
	
	
	public static List<String> getUserDetails(String userName) {
		
      List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
	  List<String> userDetailsList = new ArrayList<String>();	
		for(WebElement e: userDetails) {
			String text = e.getText();
			 
			userDetailsList.add(text);
			
		}
		
		return userDetailsList;
		
	}
	
	public static void selectUser(String username) {
		
		driver.findElement
		(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
		
		
	}
	
	

}
