package runner;

import org.testng.annotations.Test;
import generic_and_basetest_methods.Baseclass;
import shopify_login_methods.ShopifyLoginPage;
import shopify_to_wish_wish_notifications_page_methods.Shopify_To_Wish_Wish_Notifications;

public class ShopifyToWishWishNotificationsValidation extends Baseclass {

	@Test
	public void validateTC_01() {

		ShopifyLoginPage lp = new ShopifyLoginPage(wu);	
		lp.validLogin();

	}

	@Test
	public void validateTC_02() {

		Shopify_To_Wish_Wish_Notifications swn = new Shopify_To_Wish_Wish_Notifications(wu);
		swn.shopifySettings();

	}
	
	@Test
	public void validateTC_03() {
		
		Shopify_To_Wish_Wish_Notifications swn = new Shopify_To_Wish_Wish_Notifications(wu);
		swn.wishNotifications();
		
	}
	
}
