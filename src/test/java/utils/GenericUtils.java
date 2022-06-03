package utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver=driver;
	}
	
	public void switchToChildWindow() {
		 Set<String> windows=driver.getWindowHandles();
		  String parentWindow = driver.getWindowHandle();
		    for(String handle:windows) {
		    	if(handle!=parentWindow) {
		    		driver.switchTo().window(handle);
		    	}
		    	System.out.println(handle);	
		    }    
	}
}
