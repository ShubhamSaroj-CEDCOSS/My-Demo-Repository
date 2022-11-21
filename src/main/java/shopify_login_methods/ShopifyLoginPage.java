package shopify_login_methods;

import org.openqa.selenium.support.PageFactory;
import generic_and_basetest_methods.Webutil;

public class ShopifyLoginPage extends ShopifyLoginPageOR {

	Webutil util;

	public ShopifyLoginPage(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;
	}

	public void validLogin() {

		util.sendkeys(locEmailId, "ShubhamSaroj@cedcommerce.com", "Input email id in email box is successfully");
		util.click(locContinue,"Click on continue with email button successfully");

		util.sendkeys(locPassword, "SShubhamcedcoss", "Input password in password box is successfully");
		util.click(locLoginBt,"Click on login button successfully");

	}

}
