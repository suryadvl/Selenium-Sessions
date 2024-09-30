package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest{
	

	@Test(priority=1)
	public void pageTitleTest() {
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	
	@Test(priority=2)
	public void pageURLTest() {
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertTrue(actURL.contains("route=account/login"));
	}

	
	@Test(priority=3)
	public void pageLogoTest(){
				
	     Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
		 // driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		 
		 
	}
	
	

	
}
