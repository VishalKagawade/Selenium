package Selenium_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author vishal
 * @date 2022-12-30
 */
public class CodeForBrowserInitialization {

	public static WebDriver driver; // static variable

	public static WebDriver browserInit(String browser) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\visha\\Selenium\\edgedriver_win64\\msedgedriver.exe");

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");

		if (browser.equals("edge"))
			driver = new EdgeDriver();
		if (browser.equals("chrome"))
			driver = new ChromeDriver();
		return driver;

	}

}
