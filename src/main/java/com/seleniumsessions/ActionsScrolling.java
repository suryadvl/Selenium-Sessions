package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
	//	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		
		
		// partial scrolling
		
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		Thread.sleep(5000);
//		act.sendKeys(Keys.PAGE_UP).perform();
		
		
		// scroll to the footer
	//	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		//scroll to the top of the page
		
	//	act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		// Scroll to the element
		
		act.scrollToElement(driver.findElement(By.linkText("Privacy Policy")))
				.click(driver.findElement(By.linkText("Privacy Policy"))).perform();
		
		
		
	}

}
