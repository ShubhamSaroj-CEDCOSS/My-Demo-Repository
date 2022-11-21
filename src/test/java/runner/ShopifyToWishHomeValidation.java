package runner;

import org.testng.annotations.Test;
import generic_and_basetest_methods.Baseclass;
import shopify_login_methods.ShopifyLoginPage;
import shopify_to_wish_home_page_methods.Shopify_To_Wish_Home;

public class ShopifyToWishHomeValidation extends Baseclass {

	@Test
	public void validateTC_01() {

		ShopifyLoginPage slp = new ShopifyLoginPage(wu);	
		slp.validLogin();

	}

	@Test
	public void validateTC_02() {

		Shopify_To_Wish_Home swh = new Shopify_To_Wish_Home(wu);
		swh.shopifySettings();

	}
	
	@Test
	public void validateTC_03() {
		
		Shopify_To_Wish_Home swh = new Shopify_To_Wish_Home(wu);
		swh.wishHome();
		
	}

}
