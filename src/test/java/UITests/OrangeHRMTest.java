package UITests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest {

	@Test(priority=1)
	public void pageTitleTest() {

		
		String actTitle = driver.getTitle();
		System.out.println(actTitle);

		Assert.assertEquals(actTitle, "30-Day Advanced Free Trial | OrangeHRM");
	}

	@Test(priority=2)
	public void pageURLTest() {

		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);

		Assert.assertTrue(actURL.contains("30-day-free-trial"));
	}

}
