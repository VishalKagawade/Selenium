package Selenium_Practice_Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckIsSelect {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement btnradio = driver.findElement(By.xpath("//*[text()='Female']//preceding-sibling::input"));
		btnradio.click();
		Thread.sleep(2000);
		
		System.out.println(btnradio.isSelected());
		
		
		Thread.sleep(2000);
		WebElement btnradio2 = driver.findElement(By.xpath("//*[text()='Male']//parent::label//input"));
	//	btnradio2.click();
		System.out.println(btnradio2.isSelected());
		
		
		
		
		driver.close();
	}

}
