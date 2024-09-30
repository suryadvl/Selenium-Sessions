package mytests;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {
	
	
	@Test()
	public void loginTest() {
		
		System.out.println("Login Test");
		
		
	}
	
	

	@Test(dependsOnMethods ="loginTest")
	public void homePageTest() {
		
		System.out.println("homePageTest");
	}
	
	
	@Test(dependsOnMethods ="homePageTest")
	public void searchTest() {
		
		System.out.println("searchTest");
	}
	 
	 
	
}
