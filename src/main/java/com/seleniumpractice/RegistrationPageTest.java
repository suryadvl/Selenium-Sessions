package com.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
	

	public static void main(String[] args) {
		
		
   /* creating browserutil object to access the custom methods */	
		
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.intiBrowser("chrome");
		brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		String title = brutil.getTitle();
		System.out.println(title);
		
		
	/*  Identifyin the elements by ID and storing it for further need */
		
		 By fName = By.id("input-firstname");
		 By lName = By.name("lastname");
		 By emailId = By.xpath("//*[@id=\"input-email\"]");
		 By TeleNum = By.cssSelector("#input-telephone");
		 By pwd = By.xpath("//*[@id=\"input-password\"]");
		 By confirmPwd = By.xpath("//*[@id=\"input-confirm\"]");
		 By check =By.name("agree");
		 By cont = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		 By Accountcreated = By.tagName("Your Account Has Been Created!");
		 
		 /* creating ElementUtil object and passing driver object(to be in same session)to access the custom methods */ 
		 
		 ElementUtil eleutil = new ElementUtil(driver);
		 
		 eleutil.doSendKeys(fName, "Surya");
		 eleutil.doSendKeys(lName, "Danda");
		 eleutil.doSendKeys(emailId, "suryanarayana.dvl@gmail.com");
		 eleutil.doSendKeys(TeleNum, "1234567890");
		 eleutil.doSendKeys(pwd, "Test");
		 eleutil.doSendKeys(confirmPwd, "Test");
		 eleutil.doClick(check);
		 eleutil.doClick(cont);
		 String s = eleutil.getElement(Accountcreated).getText();
		 if(s.equals(Accountcreated)) {
		 System.out.println("Account Created "+s);
		 }
		 else {
			 
			 System.out.println("Account not created and Testcase failed ");
		 }
		 
		 
		 
		 
		 
		 /* closing the browser */
		// brutil.closeBrowser();
		 
		 
		 
	}

}
