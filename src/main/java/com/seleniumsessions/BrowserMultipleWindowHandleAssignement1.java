package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandleAssignement1 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		String parentwindowID = driver.getWindowHandle();
		
	//	driver.switchTo().newWindow(WindowType.TAB);
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		Actions act = new Actions(driver);
		
		act.click(executiveProfile).perform();
		
		
		

	}

}
