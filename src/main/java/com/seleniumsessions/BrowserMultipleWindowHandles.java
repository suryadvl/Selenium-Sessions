package com.seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandles {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		String parentId = driver.getWindowHandle();
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArticle = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement csSupports = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));
		
	//	executiveProfile.click();
		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();
		act.click(pressReleases).perform();
		act.click(newsArticle).perform();
		act.click(csSupports).perform();
				
	   Set<String> handles = driver.getWindowHandles();
	    Iterator<String> it =  handles.iterator();
		 
	    while(it.hasNext()) {
	    	String windowId = it.next();
	    	 driver.switchTo().window(windowId);
	    	System.out.println(driver.getTitle());
	    	if(!windowId.equals(parentId)) {
            driver.close();}
	      	
            Thread.sleep(3000);
	    	
	    }
	    
	    driver.switchTo().window(parentId);
	    System.out.println(driver.getTitle());
		

	}

}
