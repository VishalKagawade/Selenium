package basicseleniumcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MfacebookLogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://m.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("m_login_email"));
		username.sendKeys("vishal");
		WebElement password = driver.findElement(By.id("m_login_password"));
		password.sendKeys("vish1234");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		

	}

}
