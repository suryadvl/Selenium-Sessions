package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumpractice.ElementUtil;

public class ElementTextTest {

	public static void main(String[] args) {
		
		BrowserUtil brutil = new BrowserUtil();
	       
	       WebDriver driver =  brutil.initDriver("chrome");
	      
	      brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	      By header = By.tagName("h2");
	      By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
	      By forgotpwd = By.linkText("Forgotten Password");
	      By footerHeader = By.tagName("h5");
	      
	      ElementUtil eleutil = new ElementUtil(driver);
	      
	      String M1=   eleutil.doGetElementText(header);
	      String M2 =  eleutil.doGetElementText(para);
	      String M3 =  eleutil.doGetElementText(forgotpwd);
	      String M4 =  eleutil.doGetElementText(footerHeader);
	     
		  
	      
	      

	}

}
