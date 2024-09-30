package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExceptionWithFEAndFEs {
	
	static WebDriver driver;

	public static void main(String[] args) {


		 driver = new ChromeDriver();

			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

			By logo = By.className("img-responsive11");
			
		//	driver.findElement(logo).click();  // it wil give the exception .no such element: Unable to locate element
			
			int count = driver.findElements(logo).size();
			
			System.out.println(count);
			
			

	}

}
