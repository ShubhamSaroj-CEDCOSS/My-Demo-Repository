package shopify_login_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopifyLoginPageOR {

	@FindBy(xpath = "//input[@name='account[email]']")
	WebElement locEmailId;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement locContinue;

	@FindBy(xpath = "//input[@name='account[password]']")
	WebElement locPassword;

	@FindBy(xpath = "//button[@name='commit']") 
	WebElement locLoginBt;

}
