package mytests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	int age;
	@Test(expectedExceptions = ArithmeticException.class )
	public void cartTest() {
		
		System.out.println("search Cart");
		int i = 10/0;
		
		ExpectedExceptionConcept obj = null;
		obj.age = 20;  // NPE
		
		
		
	}
	
	

}
