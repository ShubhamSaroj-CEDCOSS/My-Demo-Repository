package runner;

import org.testng.annotations.Test;
import generic_and_basetest_methods.Baseclass;
import shopify_login_methods.ShopifyLoginPage;
import shopify_wish_installation_methods.Shopify_Wish_Installation;

public class ShopifyWishInstallationValidation extends Baseclass {

	@Test
	public void validateTC_01() {

		ShopifyLoginPage slp = new ShopifyLoginPage(wu);	
		slp.validLogin();
		Shopify_Wish_Installation swi = new Shopify_Wish_Installation(wu);
		swi.wishInstallation();

	}
	
	@Test
	public void validateTC_02() {

		Shopify_Wish_Installation swi = new Shopify_Wish_Installation(wu);
		swi.wishOnboarding();

	}
	
}