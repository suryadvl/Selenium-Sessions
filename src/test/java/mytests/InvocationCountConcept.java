package mytests;

import org.testng.annotations.Test;

public class InvocationCountConcept {
	
	@Test(invocationCount=10 , priority=1)
	public void paymentTest() {
		
		System.out.println("payment");
	}
	
	
	@Test(invocationCount=10 , priority=2)
	public void cartTest() {
		
		System.out.println("search Cart");
	}
	

}

