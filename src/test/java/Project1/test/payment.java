package Project1.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Project1.pages.Payment;

public class payment extends Payment {
	@Test
public void payMent() {
		
		try {
			launchBrowser("https://www.bestbuy.com/checkout/r/payment");
			payment pay=PageFactory.initElements(driver, payment.class);
			pay.Cardno("9876543210987654");
			pay.Fname("Natrajan");
			pay.Lname("T");
			pay.Address("103,north car street");
			pay.city("madurai");
			pay.State("4");
			pay.post("647738");
			pay.placed();
			pay.screenShot("confirmed");
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	public void closeBrowser() {
		try {
			driver.close();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}}


}
