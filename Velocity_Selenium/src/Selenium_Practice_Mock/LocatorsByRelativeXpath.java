package Selenium_Practice_Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByRelativeXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		boolean dashboardpage = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText().equals("Dashboard");
		if (dashboardpage==true)
			System.out.println("Test case pass, Dashboard is appearing ");
		else
			System.out.println("Test case is fail, Dashboard is not appearing");
		
		driver.findElement(By.xpath("//p[text()='Paul Collings']//parent::span/i")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(2000);
		driver.close();

	}
}