package com.seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrameHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("div#imageTemplateContainer img")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));
		
		driver.findElement(By.id("RESULT_TextField-1")).sendKeys("Surya");
		
		// need to come out of the iframe and swithc to main frame
		
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.cssSelector("div#imageTemplateContainer img")).getText();
		System.out.println(text);

		
	}

}
