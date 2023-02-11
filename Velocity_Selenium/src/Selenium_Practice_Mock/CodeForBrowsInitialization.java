package Selenium_Practice_Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CodeForBrowsInitialization {

	static WebDriver driver;

	public static WebDriver browserInit(String browser)  {
		System.setProperty("webdrive.chrome.driver","C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\visha\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	
		if(browser.equals("chrome"))
			driver = new ChromeDriver();
		if(browser.equals("edge"))
			driver = new EdgeDriver();
		return driver;
		
		//  so the purpose of creating browser set up and initialization i.e. creating a class which will be consisting 
		// of method that will select the browser set up using if condition
		
		// so moving forward we need not to create the browser set up again and again we simply can call the method 
		// specifying the browser name in it
		
	}
	
	public static void main(String[] args) {
		browserInit("chrome");   // here we simply called a method browserInit along with browser name so here we need 
									//not to write the initial set up
		driver.get("https://www.youtube.com/");
		
	}

}
