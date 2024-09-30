package com.seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadomDomElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(4000);
		
		String jsPath = " return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement pizza = (WebElement)js.executeScript(jsPath);
		
		pizza.sendKeys("Veg Pizza");
		
		// Shadow DOM :  xpath wont suppport and css with js path only supports 
		
		
		
	}

}
