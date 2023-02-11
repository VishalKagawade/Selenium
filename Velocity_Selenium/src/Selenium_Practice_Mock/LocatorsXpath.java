package Selenium_Practice_Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\visha\\Selenium\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.calculator.net/mass-calculator.html");
		driver.manage().window().maximize();

		Thread.sleep(2000);
		WebElement density = driver.findElement(By.xpath("//input[@name='cdensity']"));
		density.clear();
		density.sendKeys("1500");

		Thread.sleep(2000);
		WebElement volume = driver.findElement(By.xpath("//input[@name='cvolume']"));
		volume.clear();
		volume.sendKeys("10");

		Thread.sleep(2000);
		WebElement calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));
		calculate.click();

	}

}
