package runner;

import org.testng.annotations.Test;
import generic_and_basetest_methods.Baseclass;
import shopify_login_methods.ShopifyLoginPage;
import shopify_to_wish_bulk_operations_page_methods.Shopify_To_Wish_Bulk_Operations;

public class ShopifyToWishBulkOperationsValidation extends Baseclass {

	@Test
	public void validateTC_01() {

		ShopifyLoginPage lp = new ShopifyLoginPage(wu);	
		lp.validLogin();

	}

	@Test
	public void validateTC_02() {

		Shopify_To_Wish_Bulk_Operations swb = new Shopify_To_Wish_Bulk_Operations(wu);
		swb.shopifySettings();

	}
	
	@Test
	public void validateTC_03() {
		
		Shopify_To_Wish_Bulk_Operations swb = new Shopify_To_Wish_Bulk_Operations(wu);
		swb.wishBulkOperations();
		
	}
	
}
