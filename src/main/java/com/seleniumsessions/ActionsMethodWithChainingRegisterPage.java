package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodWithChainingRegisterPage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	//	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		
		Actions act = new Actions(driver);
		
		act.sendKeys(firstName, "Surya")
		   .sendKeys(Keys.TAB)
		    .pause(500)
		    .sendKeys("Danda")
		     .sendKeys(Keys.TAB)
		     .pause(500)
		      .sendKeys("ABD@gmail.com")
		       .sendKeys(Keys.TAB)
		       .pause(500)
		        .sendKeys("1234567890")
		          .sendKeys(Keys.TAB)
		          .pause(500)
		            .sendKeys("Test1234")
		             .sendKeys(Keys.TAB)
		             .pause(500)
		              .sendKeys("Test1234")
		                .sendKeys(Keys.TAB)
		                 .sendKeys(Keys.TAB)
		                  .sendKeys(Keys.TAB)
		                   .sendKeys(Keys.SPACE)
		                   .sendKeys(Keys.TAB)
		                    .sendKeys(Keys.ENTER)
		                     .build().perform(); 
		
		
		

	}

}
