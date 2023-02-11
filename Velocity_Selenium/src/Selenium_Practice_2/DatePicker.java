package Selenium_Practice_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("datepicker1")).click();

		Thread.sleep(500);

		int i = 0;
		while (i == 0) {
			String monthyear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			if (!monthyear.equals("March 1998"))
				driver.findElement(By.xpath("//*[text()='Prev']")).click();
			else
				break;

		}
		
		driver.findElement(By.xpath("//*[text()='12']")).click();

	}

}
