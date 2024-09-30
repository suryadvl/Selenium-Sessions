package com.seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForElements {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By footers = By.cssSelector("footer a");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		List<WebElement> footerList= wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footers));
		
		System.out.println(footerList.size());
		
		
		

	}
	
	public static List<WebElement> waitForVisibilityOfAllElementsLocated(By locator , int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		
		 return  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	
	

}
