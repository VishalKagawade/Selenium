package practicesele;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrctSele {
	
	public static WebDriver driver;
	
	public static String getPageText(String txt1) {
		WebElement page = driver.findElement(By.xpath("//h4[text()='Dashboard']"));
		return page.getText();
	}
	
	public static String getBlocksOnDashoards(String entrtxt) {
		WebElement txt = driver.findElement(By.xpath("//h6[text()='"+entrtxt+"']"));
		String gettxt = txt.getText();
		return gettxt;
	}
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://dthahab.com/Account/Login");
		driver.manage().window().maximize();
		
		
			driver.findElement(By.id("Username")).sendKeys("VELOCITY");
			driver.findElement(By.id("Password")).sendKeys("VELOCITY123");
			driver.findElement(By.xpath("//*[text()='Log In']")).click();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		
		WebElement txt =driver.findElement(By.xpath("//h6[text()='Orders']"));
		String textfrompage = txt.getText();
		System.out.println(textfrompage);
		
		String cc= getPageText("Dashboard");
		System.out.println(cc);
		
		String dd = getBlocksOnDashoards("Orders");
		System.out.println(dd);
		
	}
  
	

}
