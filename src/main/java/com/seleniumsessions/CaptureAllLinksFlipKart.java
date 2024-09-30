package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllLinksFlipKart {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> linkLists =driver.findElements(By.tagName("a"));
		System.out.println("Total Links :"+linkLists.size());
		
		for(WebElement e :linkLists ) {
			
			 String text = e.getText();
			 String hrefvalue = e.getAttribute("href");
			 
			 System.out.println( text + "  : " + hrefvalue);
			 
			 
		}
		
		// WebScraping we called the above one. taking links from webpage 
		

	}

}
