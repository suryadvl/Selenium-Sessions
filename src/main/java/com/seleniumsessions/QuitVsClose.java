package com.seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equalsIgnoreCase("selenium")) {
			System.out.println("Testcase pass"+title);
		}
		else {System.out.println("Testcase fail" +title);
		}
		//driver.quit();
		driver.close();
		System.out.println(driver.getTitle()); // gets  no such session exception comes
		
	}

	}


