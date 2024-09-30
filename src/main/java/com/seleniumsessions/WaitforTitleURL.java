package com.seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitforTitleURL {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		//boolean flag = false;
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		try {
//		 flag =  wait.until(ExpectedConditions.titleIs("Free CRM software for customer relationship management, sales"));
//		   
//		  flag = true;
//		}
//		catch(TimeoutException e) {
//			
//			System.out.println("title is not matched");
//			
//		}
//		
//		if(flag) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
		
	//	String title = getPageTitleIs("Free CRM software for customer relationship management, sales, and support.",5);
		
		String title = getPageTitleContains("customer relationship management",5);
		System.out.println(title);
	}
	
	
	public static String getPageTitleIs(String expectedTitle , int timeOut) {
		
		if(waitForTitleIs(expectedTitle ,timeOut)) {
		
		 return driver.getTitle();
		}
		
		else {
			
			return "-1";
		}
				 
		 
	}
	
	
public static String getPageTitleContains(String partOfTitle , int timeOut) {
		
		if(waitForTitleContains(partOfTitle ,timeOut)) {
		
		 return driver.getTitle();
		}
		
		else {
			
			return "-1";
		}
				 
		 
	}

		
	
	 public static boolean waitForTitleIs(String expectedTitle , int timeOut) {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		   boolean flag = false;
			try {
			 flag =  wait.until(ExpectedConditions.titleIs(expectedTitle));
			   
			  flag = true;
			  return flag;
			}
			catch(TimeoutException e) {
				
				System.out.println("title is not matched");
				return flag;
				
			}
			
		 
	 }
	 
	 
 public static boolean waitForTitleContains(String partOfTitle , int timeOut) {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		   boolean flag = false;
			try {
			 flag =  wait.until(ExpectedConditions.titleContains(partOfTitle));
			   
			  flag = true;
			  return flag;
			}
			catch(TimeoutException e) {
				
				System.out.println("title is not matched");
				return flag;
				
			}
			
		 
	 }
	 
	 
	

}
