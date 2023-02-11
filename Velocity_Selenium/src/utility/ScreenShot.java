package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static WebDriver driver;
	
	public void screenShot(String filename) throws IOException {
		TakesScreenshot screenshot= (TakesScreenshot)driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\visha\\Pictures\\Screenshots\\"+filename+".png");
		FileHandler.copy(source, destination);
		
		
	}

}
