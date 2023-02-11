package testngcheck;

import org.testng.annotations.Test;

public class CheckingTestSequenceWithPriority {
	
	@Test (priority=1)
	public void ba() {
		System.out.println("2nd Test");
	}
	
	@Test (priority=2)
	public void ab() {
		System.out.println("1st Test");
	}

}
