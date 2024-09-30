package com.seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {


		BrowserUtil brutil = new BrowserUtil();
		
		brutil.initDriver("chrome");
		brutil.launch("https://www.Aamazon.com");
		String title = brutil.getPageTitle();

		if(title.equals("Amazon")) {
			
			System.out.println("Case is Pass");
		}
		
		else {
			
			System.out.println("case is fail");
		}

		brutil.closeBrowser();
	
	
	}
	
	
	
	
	
	
	
	
	
	

}
