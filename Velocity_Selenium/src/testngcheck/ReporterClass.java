package testngcheck;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {
	
	@Test (priority=1)
	public void ba() {
		System.out.println("first test case");
	}
	
	@Test (priority=-1)
	public void ab() {
		System.out.println("second test case");
		Reporter.log("checking reporter", true);
		
		
		//  Reporter.log("String", true )--> message will display in console as well as html report
		//  Reporter.log("String", true )--> message will display in html report only
	}
	

}
