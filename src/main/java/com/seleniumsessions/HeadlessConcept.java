package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		
		//headless : no browser activity
		
		// Edge optiopn eo = new EdgeOptions();
		
     	ChromeOptions co = new ChromeOptions();  // headless feature
 
     	co.addArguments("--incognito");  // to launch the browser in incognito mode.
     	
     	
    // 	co.addArguments("--headless"); 
		
//		EdgeOptions eo = new EdgeOptions();
//		
//		eo.addArguments("--Inprivate")
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(driver.getTitle());
		
		
		

	}

}
