package com.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserUtil1 {
	
   WebDriver driver ;
  public WebDriver initBrowser(String browserName) {
	  
	  switch (browserName.trim().toLowerCase()){
	  
	  case "chrome":
	  driver = new ChromeDriver();
	  break;
	  
	  case "edge":
		  driver = new EdgeDriver();
		  break;
		  
	  default :
		  System.out.println("Enter valid browser" +browserName);
		  
		  throw new BrowserExceptions1("Pass Valid Browser");
		  
			  
	  }
	  
	  return driver;
	  
  }	
 	
  
     public void launchURL(String url) {
    	 
    	 if(url.indexOf("http") !=0|| url.length()==0) {
    		 
    		 throw new BrowserExceptions1("Plz pass valid URL" + url);
    	 }
    	 driver.get(url);
    	 
     }
     
     
     public String getTitle() {
    	 
    	return  driver.getTitle();
     }
	
     public void closeBrowser() {
    	 
    	 driver.close();
     }

     
 public void quitBrowser() {
    	 
    	 driver.quit();
     }
}
