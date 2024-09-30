package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.seleniumpractice.BrowserUtil;
import com.seleniumpractice.ElementUtil;

public class ElementDisplayed {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// boolean flag =
		// driver.findElement(By.className("img-responsive1")).isDisplayed();

		// if(flag) {

		// System.out.println("logo is present");
		// }

		// else {
		//
		// System.out.println("logo is not present");
		// }

		/*
		 * boolean flag = isElementDisplayed(logo);
		 * 
		 * System.out.println(flag);
		 * 
		 * 
		 * }
		 */

		By logo = By.className("img-responsive1");

	//	ElementUtil util = new ElementUtil(driver);

		if (isElementDisplayed(logo)) {

			System.out.println("Logo is present ");
		}

		else {

			System.out.println("Logo is not present on Page");
		}

	}

	public static boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		}

		catch (NoSuchElementException e) {

			System.out.println("element not displayed :" + locator);
			return false;

		}
	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}

}