package com.seleniumpractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinks1 {
	
	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		 By footerLinks = By.xpath("//div[@class='col-sm-3']/ul");
		 
		  getElementsCount(footerLinks);
		  PrintElementTextList(footerLinks);
		  
		  
		// getElementTextList(footerLinks);
		  
 
	}
	
	
	 public static List<WebElement> getElements(By locator){
		  
		   return driver.findElements(locator);
		  
		  
	  }
	  
	  public static void getElementsCount(By locator) {
		  
	  System.out.println(getElements(locator).size());
		  
  }
	
	
	  public static  List<String>  getElementTextList(By locator) {
		  
		  List<WebElement> eleList = getElements(locator);
		  
		  List<String> eleListText = new ArrayList<String>();
		  
		  for(WebElement e : eleList ) {
			  
			  String eleText = e.getText();
			  if(eleText.length()!=0) {
			  
			   eleListText.add(eleText);
			  }
			  
		  }
		  
		  return eleListText;
		  
		  
	  }
	  
	  
	  
	  public static void PrintElementTextList(By locator) {
		  
		  List<String> eleText = getElementTextList(locator);
		  
		   for( String s : eleText) {
			   
			   System.out.println(s);
			   
		   }
		  
	  }

}
