package runner;

import org.testng.annotations.Test;
import generic_and_basetest_methods.Baseclass;
import shopify_login_methods.ShopifyLoginPage;
import shopify_to_wish_products_page_methods.Shopify_To_Wish_Products;

public class ShopifyToWishProductsValidation extends Baseclass {

	@Test
	public void validateTC_01() {

		ShopifyLoginPage lp = new ShopifyLoginPage(wu);	
		lp.validLogin();

	}

	@Test
	public void validateTC_02() {

		Shopify_To_Wish_Products swp = new Shopify_To_Wish_Products(wu);
		swp.shopifySettings();

	}
	
	@Test
	public void validateTC_03() {
		
		Shopify_To_Wish_Products swp = new Shopify_To_Wish_Products(wu);
		swp.wishProducts();
			
	}
	
}
