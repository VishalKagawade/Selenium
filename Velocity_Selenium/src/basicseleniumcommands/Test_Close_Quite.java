package basicseleniumcommands;

import Selenium_First.CodeForBrowserInitialization;

public class Test_Close_Quite extends CodeForBrowserInitialization {
	
	public static void main(String[] args) {
		
		browserInit("chrome");
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();   //closes only browser current tab
		
		driver.quit();  //close entire browser
		
		
		
	}

}
