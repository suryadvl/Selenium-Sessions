package com.seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
//		driver.get("https://www.flipkart.com/");
//		
//		Thread.sleep(5000);
//
//		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("macbook pro");
//		
//		driver.findElement(By.xpath("//form[contains(@class,'header-form-search')]//*[local-name()='svg']")).click();
//		
		
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		Thread.sleep(5000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path']";
	     List<WebElement> statesList =  driver.findElements(By.xpath("svgXpath"));
	    
	    System.out.println(statesList.size());
	   
	    Actions act = new Actions(driver);
	    
	    for(WebElement e: statesList) {
	    act.moveToElement(e).perform();
	      
	     String nameAttr = e.getAttribute("name");
	     Thread.sleep(1000);
		
	}
	}}

