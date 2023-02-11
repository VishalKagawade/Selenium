package testngcheck;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledKeyword {
	
	@Test (priority=1, enabled=false)
	public void ba() {
		System.out.println("Second test case");
	}
	
	@Test (priority=-1)
	public void ab() {
		System.out.println("first test case");
		Reporter.log("Checking reporter",true);
	}


}
