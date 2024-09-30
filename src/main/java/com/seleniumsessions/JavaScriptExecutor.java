package com.seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	
		
		driver.get("https://classic.crmpro.com/index.html?e=1");
		
		JavascriptExecutorUtil jsutil = new JavascriptExecutorUtil(driver);
	//	String pageText =jsutil.getPageInnerText();
		
	//	System.out.println(pageText);
		
		
		System.out.println(jsutil.getPageTitle());
		System.out.println(jsutil.getPageURL());
		

//		jsutil.generateJSAlert("Surya");
		
		
		
//		JavascriptExecutor js =  (JavascriptExecutor)driver ;  // casting the interfaces 
//		
//		String title = js.executeScript("return document.title ").toString();
//		System.out.println(title);
//		
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		
		
	}
	
	
	 public static String getTitle() {
		 

			JavascriptExecutor js =  (JavascriptExecutor)driver ;  // casting the interfaces 
			
			String title = js.executeScript("return document.title;").toString();
		     return title;
		 
	 }
	 
	 public static String getURL() {
		 

			JavascriptExecutor js =  (JavascriptExecutor)driver ;  // casting the interfaces 
			
			String url = js.executeScript("return document.URL;").toString();
		     return url;
		 
	 }
	 

	 
	 
}
