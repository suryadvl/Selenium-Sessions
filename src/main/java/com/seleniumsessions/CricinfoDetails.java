package com.seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricinfoDetails {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-sri-lanka-2024-1442984/sri-lanka-vs-india-3rd-odi-1442992/full-scorecard");
		
	//String text = driver.findElement
	//   (By.xpath("//span[text()='Rohit Sharma']/ancestor::td/following-sibling::td/span")).getText();
		
	//	System.out.println(text);
		
		 System.out.println(selectUser("Rohit Sharma"));
		 System.out.println(getUserDetails("Rohit Sharma"));

	}
	
	
	

	public static List<String> getUserDetails(String userName) {
		
      List<WebElement> userDetails = driver.findElements(By.xpath("//span[text()='"+userName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
	  List<String> userDetailsList = new ArrayList<String>();	
		for(WebElement e: userDetails) {
			String text = e.getText();
			 
			userDetailsList.add(text);
			
		}
		
		return userDetailsList;
		
	}
	
	public static String selectUser(String username) {
		
		return driver.findElement
		(By.xpath("//span[text()='"+username+"']/ancestor::td/following-sibling::td/span")).getText();
		
		
	}

}
