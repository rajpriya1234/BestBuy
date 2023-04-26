package Project1.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Project1.pages.Signin;

public class signin extends Signin {
	@Test
public void Sign() {
		
		try {
			launchBrowser("https://www.bestbuy.com/");
			Signin sign=PageFactory.initElements(driver, Signin.class);
			sign.Country();
			sign.Account();
			sign.CreateAccount();
			sign.firstname("Natraj");
			sign.lastname(" T");
			sign.mailId("rajsank304@gmail.com");
			sign.password("natraj@ 1234");
			sign.Confirmpassword("natraj@ 1234");
			sign.phonenumber("7339215169");
			sign.recovery();
			sign.Create();
			sign.Skip();
			sign.profile();
			sign.Signout();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
