package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFeilds {

	public static void main(String[] args) {



		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> totalText = driver.findElements(By.className("form-control"));
		System.out.println(totalText.size());
		
	   // no use of forloop . we cant do anything after getting text

		  for(WebElement e :totalText ) {
		  
		  String text = e.getAttribute("placeholder");
		  System.out.println(text);
		  
		  
		 
		 

	}
	}}

