package basicseleniumcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice11 {
	
	

	public static void main(String[] args) {
		

	System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	
	}

}
