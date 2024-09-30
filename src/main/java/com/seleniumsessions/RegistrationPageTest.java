package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumpractice.BrowserUtil;
import com.seleniumpractice.ElementUtil;

public class RegistrationPageTest {

	public static void main(String[] args) {

		/* creating browserutil object to access the custom methods */

		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.intiBrowser("chrome");
		brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brutil.getTitle();
		System.out.println(title);
		
		By header = By.tagName("h1");
		

		/* Identifyin the elements by ID and storing it for further need */

		By fName = By.id("input-firstname");
		By lName = By.name("lastname");
		By emailId = By.xpath("//*[@id=\"input-email\"]");
		By TeleNum = By.cssSelector("#input-telephone");
		By pwd = By.xpath("//*[@id=\"input-password\"]");
		By confirmPwd = By.xpath("//*[@id=\"input-confirm\"]");
		By check = By.name("agree");
		By cont = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By regSucess = By.tagName("h1");
		//By regSucess = By.xpath("//*[@id=\"content\"]/h1");

		/*
		 * creating ElementUtil object and passing driver object(to be in same
		 * session)to access the custom methods
		 */

		ElementUtil eleutil = new ElementUtil(driver);
		
        System.out.println(eleutil.getElement(header).getText());
		eleutil.doSendKeys(fName, "priya");
		eleutil.doSendKeys(lName, "surya");
		eleutil.doSendKeys(emailId, "priyasurya4@gmail.com");
		eleutil.doSendKeys(TeleNum, "1234567890");
		eleutil.doSendKeys(pwd, "Test");
		eleutil.doSendKeys(confirmPwd, "Test");
		eleutil.doClick(check);
		eleutil.doClick(cont);
		
		 
		
		  
    	  String s = eleutil.getElement(regSucess).getText();
		  if
		  (s.equals("Your Account Has Been Created!")) 
		  { System.out.println("Account Created  and PASS " + s); }
		  else {
		  
		  System.out.println("Account not created and Testcase failed "); }
		 

		/* closing the browser */
		// brutil.closeBrowser();

	}

}
