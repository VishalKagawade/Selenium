package Selenium_Practice_Mock;

public class CloseAndQuiteMethod extends CodeForBrowsInitialization {

	public static void main(String[] args)  {

		browserInit("chrome");
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close(); // close only current tab
		// driver.quit(); // close entire browser

	}

}
