package com.seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathMethods {
	
	static WebDriver driver;

	public static void main(String[] args) {


		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
	// Xpath -> absolute (from root to the element ) and relative (idetifying with relative)
		
		
		// syntax for xpath 
		
		//****  //tagname[@attir='value']
		//      //input[@id='input-firstname']
		
        // we can also add multiple attri by sepaating with and operator
		
		//tagname[@attir='value'] and [@attri='value2']
		
		
		
		//syntax for contains 
		
		//**** //tagename[contains(@Attri,'value')]
		
		//    //input[contains(@id,'firstname')]
		
		
		//tagename[contains(@Attri,'value') and(@id='value')]

		
		
		//***** syntax for text() 
		
		//  //input[text()='value']
		
		//   //h1[text()='Register Account']
		
		
		
		//****** syntax contains with text() 
		
		//   //h1[contains(text(),'Register')]
		
		
		
		//******* contains with attri and no containd with text :
		
		////a[contains(@href,'account/wishlist') and (text()='Wish List')]
		
		
		//****** contains with attri and id :
		
		// //a[contains(text(),'Wish List') and (@class='list-group-item')]
		
		
		//***** starts-with()
		
		//  //input[starts-with(@attri,'value')]
		
		//   //input[starts-with(@name,'firstname')]
		
		
		//*** starts-with with text() 
		
		//h1[starts-with(text(),'Register')]
		
		
		//*****class 
		
		// invalid selector exception comes when we have multiple class is used in By.classname
		
		
		
		//******indexing with xpath
		
		// capture group means keep all xpath syntax in () and indexing do
		
		//  (//a[text()='Forgotten Password'])[1]
		//   (//a[text()='Forgotten Password'])[position()=1]
		//  (//a[text()='Forgotten Password'])[last()]
		// (//input[contains(@class,'form-control')])[last()-5]
		//  (//input[contains(@class,'form-control')])[position()=1]
		
		//***** 
		
		
		

	}

}
