package alerthandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IFrame {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("wecriver.chrome.driver","C:\\Users\\visha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement iframe= driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement source = driver.findElement(By.cssSelector("#slider span"));
		Actions act = new Actions(driver);
		act.clickAndHold(source).build().perform();
		Thread.sleep(1000);
		act.moveToElement(source,550,0).release().build().perform();
		Thread.sleep(500);
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Download")).click();
		
	}

}
