package basicseleniumcommands;

import Selenium_First.CodeForBrowserInitialization;

public class CurrentUrlAndWebTitle extends CodeForBrowserInitialization {

	public void checkInTitleOfPage(String title) {
		String titleofpage = driver.getTitle(); // returms title of webpage
		if (titleofpage.equals(title))
			System.out.println("Test is Pass");
		else
			System.out.println("Test is fail");
	}

	public void checkURLOfCurrentPage(String url) {
		String urlofpage = driver.getCurrentUrl(); // returms url of webpage

		if (urlofpage.equals(url))
			System.out.println("Test is Pass");
		else
			System.out.println("Testb is Fail");
	}

	public static void main(String[] args) {
		browserInit("edge");
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		CurrentUrlAndWebTitle obj = new CurrentUrlAndWebTitle();
		obj.checkInTitleOfPage("Intagram");
		obj.checkURLOfCurrentPage("https://www.instagram.com/");
		
		driver.quit();
	}

}
