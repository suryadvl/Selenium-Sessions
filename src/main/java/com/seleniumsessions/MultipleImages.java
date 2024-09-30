package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleImages {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> imagesLists =driver.findElements(By.tagName("img"));
		
		int totalCount = imagesLists.size();
		System.out.println("Total Images "+totalCount);
		
		for(WebElement e : imagesLists){
			
			String srcValue = e.getAttribute("src");
			System.out.println(srcValue);
			
			
		}
		

	}

}
