package mytests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@BeforeSuite
	public void connectWithDB() {
		
		System.out.println("BS - connect With DB");
		
	}
	
	
	@BeforeTest
	public void createDBUser() {
		
		System.out.println("BT - createUser");
		
	}
	
	
	@BeforeClass
	public void openBrowser() {
		
		System.out.println("BC - open Browser");
		
	}
	
	
	@BeforeMethod
	public void loginToApp() {
		
		System.out.println("BM - loginToApp");
		
	}
	

	@Test
	public void searchTest() {
		
		System.out.println("Search Test");
	}
	
	@Test
	public void cartTest() {
		
		System.out.println("search Cart");
	}
	
	@Test
	public void paymentTest() {
		
		System.out.println("payment");
	}
	
	
	
	

}
