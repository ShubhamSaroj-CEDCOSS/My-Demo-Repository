package runner;

import org.testng.annotations.Test;
import generic_and_basetest_methods.Baseclass;
import shopify_login_methods.ShopifyLoginPage;
import shopify_wish_onboarding_methods.Shopify_Wish_Onboarding;

public class ShopifyWishOnboardingValidation extends Baseclass {

	@Test
	public void validateTC_01() {

		ShopifyLoginPage slp = new ShopifyLoginPage(wu);	
		slp.validLogin();

	}

	@Test
	public void validateTC_02() {

		Shopify_Wish_Onboarding swo = new Shopify_Wish_Onboarding(wu);
		swo.shopifySettings();

	}
	
	@Test
	public void validateTC_03() {

		Shopify_Wish_Onboarding swo = new Shopify_Wish_Onboarding(wu);
		swo.wishOnboarding();

	}
	
}
