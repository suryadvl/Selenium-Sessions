package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextRightClick {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	
         Actions act = new Actions(driver);
		
         act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
        // driver.findElement(By.xpath("//span[text()='copy']")).click();
         
          List<WebElement> optionList = driver.findElements(By.cssSelector("ul.context-menu-list span"));
		
           System.out.println(optionList.size());
          
           for(WebElement e: optionList) {
        	   
        	   String text = e.getText();
        	   if(text.equals("copy")) {
        		   
        		  e.click();
        	   }
        	   break;
           }
          
	}

}
