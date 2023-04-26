package Project1.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project1.pages.verifylink;

public class Verifylink extends verifylink {
	
	@Test
	public void tops() {
		try {
			launchBrowser("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494&intl=nosplash");
			verifylink link=PageFactory.initElements(driver, verifylink.class);
			link.Topdeals();
			link.Deals();
			link.Totaltech();
			link.Credit();
			link.Gift();
			link.Giftidea();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


