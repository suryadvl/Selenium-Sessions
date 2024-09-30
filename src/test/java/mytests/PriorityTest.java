package mytests;

import org.testng.annotations.Test;

public class PriorityTest {
	
	
	@Test(priority=0)
	public void searchTest() {
		
		System.out.println("Search Test");
	}
	
	@Test(priority=2)
	public void cartTest() {
		
		System.out.println("search Cart");
	}
	
	@Test(priority=3)
	public void paymentTest() {
		
		System.out.println("payment");
	}
	
	

}
