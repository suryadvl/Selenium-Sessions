package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/30-day-free-trial");
		String parentwindowID = driver.getWindowHandle();
		
	//	driver.switchTo().newWindow(WindowType.TAB);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        driver.close();
        
        driver.switchTo().window(parentwindowID);
        System.out.println(driver.getTitle());
        
		
	}

}
