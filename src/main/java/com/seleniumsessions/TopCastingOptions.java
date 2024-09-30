package com.seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
	//1.	ChromeDriver driver = new ChromeDriver();
		
      //2 WebDriver driver = new ChromeDriver();
        //driver = new FirefoxDriver();
        
      
		// recommend and valid  - remote machines (cloud AWS , server machine ) = GRID)
     // 3.  WebDriver driver = new RemoteWebDriver();
		
       
       // topcast from parent interface , but not recommended
       SearchContext driver1 = new ChromeDriver();
       
      
       // child class wil get all the inherit methods
      RemoteWebDriver driver2 =  new ChromeDriver();
      
      // chromium class , we cant use bcoz firefox driver is not valid for chromioun- it used onlyfor chrome and edge.
      
       
      
      ChromiumDriver driver3 = new ChromeDriver();
      
     //   SearchContext sc = new RemoteWebDriver(remoteAdress,capabilities);
      

	}

}
