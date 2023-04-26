package Project1.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project1.pages.Brokenlink;

public class brokenlink extends Brokenlink{
	@Test
public void brokenLink() {
		
		launchBrowser("https://www.bestbuy.com/");
		Brokenlink bro=PageFactory.initElements(driver, Brokenlink.class);
		bro.broken();
		
	}


}
