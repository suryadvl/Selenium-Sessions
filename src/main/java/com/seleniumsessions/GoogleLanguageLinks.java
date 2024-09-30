package com.seleniumsessions;

import java.util.List;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {

	
		static WebDriver driver ;
		
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
				
			driver.get("https://www.google.com");
			
			List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
			
		     System.out.println(langLinks.size());
		
		     for(WebElement e :langLinks ) {
		    	 
		    	  String text = e.getText();
		    	  
		    	  System.out.println(text);
		    	  
		    	  if(text.contains("English")) {
		    		  e.click();
		    		  break;
		    	  }
		    	  
		    
		     }

	}

}
