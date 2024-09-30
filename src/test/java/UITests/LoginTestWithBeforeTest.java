package UITests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestWithBeforeTest {
	
WebDriver driver;
	
	
	@BeforeMethod
	public void setUP() {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@Test
	public void pageTitleTest() {
		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		
		Assert.assertEquals(actTitle, "Account Login");
	}
	
	
	@Test
	public void pageURLTest() {
		
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		
		Assert.assertTrue(actURL.contains("route=account/login"));
	}

	
	@Test
	public void pageLogoTest() {
		
		
		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
		
		
	}
	
	@AfterTest()
	public void tearDown() {
		
		driver.quit();
	}
	

}
