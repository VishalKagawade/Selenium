package Selenium_Practice_Mock;

public class CheckUrlAndTitleUsingBoolean extends CodeForBrowsInitialization {

	public boolean checkUrl(String url) {
		String urlOfpage = driver.getCurrentUrl();

		if (url.equals(urlOfpage))
			return true;
		else
			return false;

	}

	public boolean checkTitle(String title) {
		String titleofpage = driver.getTitle();

		if (title.equals(titleofpage))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		browserInit("chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		CheckUrlAndTitleUsingBoolean obj = new CheckUrlAndTitleUsingBoolean();
		System.out.println(obj.checkUrl("https://www.facebook.com/"));
		System.out.println(obj.checkTitle("Facebook – log in or sign up"));
		System.out.println(driver.getTitle());
	}

}
