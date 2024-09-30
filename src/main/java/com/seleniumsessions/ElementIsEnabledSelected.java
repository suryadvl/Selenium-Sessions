package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {
	
	static WebDriver driver;

	public static void main(String[] args) {

       driver = new ChromeDriver();
       
       
       /* Below  lines are for Is Selected method*/
       
       
     //  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
       
     //  By chkBtn = By.name("agree");
       
     //  ElementUtil eleutil = new ElementUtil(driver);
  		
	//	  if(eleutil.isElementSelected(chkBtn)) {
		  
	//	  System.out.println("CheckBox is Tick"); }
		  
	//	  else {
		  
	//	  System.out.println("CheckBox is not Tick"); }
		  
		
       /* Below  lines are for Is Enabled method*/
       
       driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
         By pass = By.id("pass");
       
         ElementUtil eleutil = new ElementUtil(driver);
		  if(eleutil.isElementEnabled(pass)) {
			  
			  System.out.println("Password text feild is enabled");
		  }
		  
		 else {
			 
			 System.out.println("Password text is not Enabled");
		 }

	}

}
