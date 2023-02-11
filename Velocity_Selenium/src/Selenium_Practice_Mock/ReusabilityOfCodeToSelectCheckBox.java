package Selenium_Practice_Mock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Selenium_First.CodeForBrowserInitialization;

public class ReusabilityOfCodeToSelectCheckBox extends CodeForBrowserInitialization {

	public void login() {
		

		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

	}

	public void checkonParticularEmployeeName(String fName, String lName) {
		driver.findElement(By.xpath(
				"//*[contains(text(),'" + fName + " ')]//parent::div//following-sibling::div//*[contains(text(),'"
						+ lName + "')]//parent::div//preceding-sibling::div//span//i"))
				.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		browserInit("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ReusabilityOfCodeToSelectCheckBox obj = new ReusabilityOfCodeToSelectCheckBox();
		obj.login();
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		Thread.sleep(2000);
		obj.checkonParticularEmployeeName("chari","battu");
		obj.checkonParticularEmployeeName("Charlie","Carter");
		
	}

}
