package com.seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandleConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
	//	executiveProfile.click();
		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();
				
		Set<String> handles = driver.getWindowHandles();
		
	     Iterator<String> it = handles.iterator();
        String parentWindowId = it.next();
         System.out.println("Parent window id :" + parentWindowId);
         
         String childWindowId = it.next();
         System.out.println("Child window id :" + childWindowId);
         
         
         // 2. switch to the tab
         
         driver.switchTo().window(childWindowId);
         System.out.println(driver.getTitle());
         driver.close();
         
         // back to parent window
         driver.switchTo().window(parentWindowId);
	     System.out.println(driver.getTitle());
	     
	     driver.quit();
	}

}
