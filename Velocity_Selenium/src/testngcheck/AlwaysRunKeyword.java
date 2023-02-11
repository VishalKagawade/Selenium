package testngcheck;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunKeyword {

	@Test(priority = -2)
	public void ba() {
		System.out.println("Second test case");
		Assert.assertEquals(false, true);
	}

	@Test(priority = -1, dependsOnMethods = "ba", alwaysRun = true)
	public void ab() {
		System.out.println("first test case");
		Reporter.log("Checking reporter", true);

	}
}
