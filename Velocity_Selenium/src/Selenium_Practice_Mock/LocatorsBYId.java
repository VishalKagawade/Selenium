package Selenium_Practice_Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsBYId extends CodeForBrowsInitialization {
	
	public static void main(String[] args) throws InterruptedException {
		browserInit("chrome");
		driver.get("https://www.calculator.net/mass-calculator.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement density = driver.findElement(By.id("cdensity"));
		density.clear();
		density.sendKeys("1500");
		WebElement volume = driver.findElement(By.id("cvolume"));
		volume.clear();
		volume.sendKeys("5");
		
		
		WebElement calculate = driver.findElement(By.xpath("//input[@type='image']"));
		// -->    //input[@value='Calculate']  2nd xpath
		//  -->    //input[@alt='Calculate']   3rd xpath
		
		calculate.click();
		
		
		
		
		

		
		
		
		
	}

}
