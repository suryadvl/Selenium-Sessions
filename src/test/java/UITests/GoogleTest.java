package UITests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;

public class GoogleTest extends BaseTest {
	
	
	
	@Test(priority=1)
	public void pageTitleTest() {
		
		//driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		Assert.assertEquals(actTitle, "Google");
	}
	
	
	@Test(priority=2)
	public void pageURLTest() {
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertTrue(actURL.contains("google"));
	}

		
	
	}
