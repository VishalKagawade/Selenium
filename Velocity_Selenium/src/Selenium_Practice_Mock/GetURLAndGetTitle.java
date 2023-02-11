package Selenium_Practice_Mock;

public class GetURLAndGetTitle extends CodeForBrowsInitialization{
	

	
	public void checkUrl(String url) {
	String urlOfPage = driver.getCurrentUrl();  // returns the url of webpage
	
	if(url.equals(urlOfPage))
		System.out.println("Test is pass");
	else
		System.out.println("test is fail");
	}
	
	public void checkTitle(String title) {
		String titleofPage= driver.getTitle();
		
		if(title.equals(titleofPage))
			System.out.println("Test for title is pass");
		else
			System.out.println("Test for title is fail");
		
	}
	
	public static void main(String[] args) {
		browserInit("chrome");
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		GetURLAndGetTitle obj	= new GetURLAndGetTitle();
		obj.checkUrl("https://www.instagram.com/");
		obj.checkTitle("Instagram");
	}

}
