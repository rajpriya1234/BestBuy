package Project1.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project1.pages.Login;

public class login extends Login {
	@Test
	public void Log() {
		try {
			launchBrowser("https://www.bestbuy.com/");
			Login log = PageFactory.initElements(driver, Login.class);
			log.Country();
			log.Account();
			log.Loggin();
			log.Mail("rajsank304@gmail.com");
			log.Password("Natraj@ 1234");
			log.Submit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	


}
