package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodPractice {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	
		
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
		Actions act  = new Actions(driver);
		
		act.sendKeys(Keys.TAB)
		    .pause(500)
		      .sendKeys(Keys.TAB)
		        .pause(500)
		         .sendKeys(Keys.TAB)
		          .pause(500)
		           .sendKeys(Keys.TAB)
		            .pause(500)
		              .sendKeys(search, "macboook pro").sendKeys(Keys.ENTER).perform();
		             
		
		
	}

}
