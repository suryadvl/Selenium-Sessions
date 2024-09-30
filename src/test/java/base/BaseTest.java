package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected WebDriver driver;
	
	
	@Parameters({ "url", "browserName" })
	@BeforeTest
	public void setUP(@Optional("https://www.google.com") String url, @Optional("chrome") String browserName) {

		System.out.println("browser is :" + browserName);

		switch (browserName.toLowerCase().trim()) {

		case "chrome": {

			driver = new ChromeDriver();
			break;
		}

		case "firefox": {

			driver = new FirefoxDriver();
			break;
		}

		case "edge": {

			driver = new EdgeDriver();
			break;
		}
		
		case "safari": {

			driver = new SafariDriver();
			break;
		}

		default:
			System.out.println("Please suply the right browser" + browserName);
			throw new IllegalArgumentException("Wrong Browser :" + browserName);

		}

		
	}

	@AfterTest()
	public void tearDown() {

		driver.quit();
	}

}
