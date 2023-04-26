package Project1.test;



import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project1.pages.Menu;

public class menu extends Menu {
	
	@Test
	public void order() {
		
		try {
			launchBrowser("https://www.bestbuy.com/site/electronics/top-deals/pcmcat1563299784494.c?id=pcmcat1563299784494&intl=nosplash");
			Menu menubar=PageFactory.initElements(driver, Menu.class);
			menubar.menubar();
			menubar.Department();
			menubar.Brand();
			menubar.Samsung();
			menubar.Addcart();
			menubar.Cart();
			menubar.Checkout();
			menubar.Guest();
			menubar.Id("rajsank304@gmail.com");
			menubar.Ph("7339215169");
			menubar.Button();
			menubar.Continuepayment();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}
