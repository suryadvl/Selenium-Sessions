package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumpractice.BrowserUtil;
import com.seleniumpractice.ElementUtil;

public class ClickTest {

	public static void main(String[] args) {


		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.intiBrowser("chrome");
		brutil.launch("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By clickLogin = By.linkText("Login");
		By clickRegister = By.linkText("Register");
		By clickForgotten = By.linkText("Forgotten Password");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doClick(clickLogin);
		eleutil.doClick(clickRegister);
		eleutil.doClick(clickForgotten);
		
		
		
		
		
		

	}

}
