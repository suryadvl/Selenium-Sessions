package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		
		By sourceElement = By.id("draggable");
		By targetElement = By.id("droppable");

		Actions act = new Actions(driver);
		
		act.clickAndHold(driver.findElement(sourceElement))
		         .moveToElement(driver.findElement(targetElement))
		             .release().build().perform();
		
		
		 act.dragAndDrop(driver.findElement(sourceElement), driver.findElement(targetElement)).perform();
		
		
		
	}
	
	  	
	
    public static WebElement getElement(By locator) {
		 
		 return driver.findElement(locator);
		 
	 }

}
