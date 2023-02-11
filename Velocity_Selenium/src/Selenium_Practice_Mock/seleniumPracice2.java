package Selenium_Practice_Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumPracice2 {
	
	 public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement chbox = driver.findElement(By.xpath("//input[@class='cb1-element']"));
		chbox.click();
		System.out.println(chbox.isSelected());
		System.out.println(chbox.isEnabled());
	}

}
