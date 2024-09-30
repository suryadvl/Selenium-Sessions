package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterHelpPrint {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		String help = driver.findElement(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]")).getText();
//		System.out.println(help);
		
	//	String text = driver.findElement(By.xpath("(//div[@class='list-group']/a)[last()]")).getText();
		
		String text = driver.findElement(By.xpath("(//div[@class='list-group']/a)[position()=1]")).getText();
		System.out.println(text);

		
		
				
	    
	    

	}

}
