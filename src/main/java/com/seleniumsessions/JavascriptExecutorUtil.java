package com.seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptExecutorUtil {

	private WebDriver driver;

	private JavascriptExecutor js;

	public JavascriptExecutorUtil(WebDriver driver) {
		this.driver = driver;

		js = (JavascriptExecutor) driver;

	}

	public String getPageTitle() {

		// JavascriptExecutor js = (JavascriptExecutor)driver ; // casting the
		// interfaces

		String title = js.executeScript("return document.title;").toString();
		return title;

	}

	public String getPageURL() {

		// JavascriptExecutor js = (JavascriptExecutor)driver ; // casting the
		// interfaces

		String url = js.executeScript("return document.URL;").toString();
		return url;

	}
	
	
	public void generateJSAlert(String mseg) {
		
		js.executeScript("alert('"+mseg+"')");
		
		
	}
	
	
	// to getText of the entire page.
	
	public String getPageInnerText() {
		
		return js.executeScript("document.documentElement.innerText;").toString();

	}
	
	
	public void goBackWithJS() {
		 js.executeScript("history.go(-1)");
		
	}
	
	
	public void goForwardWithJS() {
		 js.executeScript("history.go(1)");
		
	}
	
	
	public void goRefreshWithJS() {
		 js.executeScript("history.go(0)");
		
	}
	
	// checking the zoom feature in chrome , IE , Safari
	
	public void ZoomChromeEdgeSafari(String zoomPercentage) {
		
		String zoom = "document.body.style.zoom ='"+zoomPercentage+"'";
		js.executeScript(zoom);
		
		
	}
	
	
	// checking the zoom feature in Firefiox 
	
	public void ZoomFirefox(String zoomPercentage) {
		
		String zoom = "document.body.style.Moztransform ='scale("+zoomPercentage+")'";
		js.executeScript(zoom);
		
		
	}
	
	public void scrollMiddlePage() {
		
		js.executeScript("window.scroll(0,document.body.scrollHeight/2)");
		
	}
	
	
	public void scrollPageDown() {
		
		js.executeScript("window.scroll(0,document.body.scrollHeight);");
		
	}
	
	public void scrollPageUp() {
		
		js.executeScript("window.scroll(document.body.scrollHeight,0);");
		
	}
	
	
	
}
