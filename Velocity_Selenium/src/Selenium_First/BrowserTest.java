package Selenium_First;

public class BrowserTest extends CodeForBrowserInitialization {
	
	public static void main(String[] args) {
		browserInit("edge");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}

}
