package com.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.seleniumsessions.BrowserExceptions;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver intiBrowser(String browserName) {

		System.out.println("Browser name is:" + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":

			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass right Browser" + browserName);
			throw new BrowserExceptions("Invalid browser , please pass valid " + browserName);
		}

		return driver;

	}

	public void launch(String url) {

		if (url.indexOf("http") != 0 || url.length() == 0) {

			throw new BrowserExceptions("http(s) missing in the url ");
		}
		driver.get(url);

	}

	public String getTitle() {

		return driver.getTitle();
	}

	public void closeBrowser() {

		driver.close();
	}

	public void quitBrowser() {

		driver.quit();
	}

}
