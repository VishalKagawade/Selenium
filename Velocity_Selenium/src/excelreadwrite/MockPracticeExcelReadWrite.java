package excelreadwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MockPracticeExcelReadWrite {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		//get excel path 
		File path = new File("C:\\Users\\visha\\Desktop\\Mock_Excel_Read.xlsx");
		
		FileInputStream load = new FileInputStream(path);
		
		XSSFWorkbook workbook= new XSSFWorkbook(load);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		String username1 = sheet.getRow(0).getCell(0).getStringCellValue();
		
		
		// using it in username
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys(username1);
	}

}
