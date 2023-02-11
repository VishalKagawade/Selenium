package testngcheck;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationKeyword {
	
	@Test(priority = 1, invocationCount=10)
	public void ab() {
		System.out.println("first test case");
		Reporter.log("Checking reporter", true);
	}

}
