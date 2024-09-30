package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		 int totalLinks = linksList.size();
		 
		 System.out.println("Total Linkis :"+totalLinks);
		 
		 for(int i =0;i<totalLinks;i++) {
			 
          
			 String text = linksList.get(i).getText();
			 if(text.length()!=0){
				 
			 System.out.println(text);
			 }
		 }	
		 
		 
		 System.out.println("-----------------------------");
		 
		  int count =0;
		 for(WebElement e : linksList) {
			 
			  String text1 = e.getText();
			   if(text1.length()!=0) {
				   
				   System.out.println(count +"=" +text1);
			   }
			   count++;
			 
		 }

	}

}
