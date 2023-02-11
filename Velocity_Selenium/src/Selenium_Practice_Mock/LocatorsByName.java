package Selenium_Practice_Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsByName extends CodeForBrowsInitialization {

	public static void main(String[] args) {
		browserInit("chrome");
		driver.get("https://www.calculator.net/mass-calculator.html");
		driver.manage().window().maximize();

		WebElement density = driver.findElement(By.name("cdensity"));
		density.clear();
		density.sendKeys("1500");

		WebElement volume = driver.findElement(By.name("cvolume"));
		volume.clear();
		volume.sendKeys("5");

		driver.findElement(By.xpath("//input[@alt='Calculate']")).click();
		
		

	}

}
