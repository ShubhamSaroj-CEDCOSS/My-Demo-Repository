package shopify_to_wish_wish_notifications_page_methods;

import org.openqa.selenium.support.PageFactory;
import generic_and_basetest_methods.Webutil;

public class Shopify_To_Wish_Wish_Notifications extends Shopify_To_Wish_Wish_Notifications_OR {

	Webutil util;

	public Shopify_To_Wish_Wish_Notifications(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;

	}

	public void shopifySettings() {

		util.click(locSettings, "Click on shopify settings successfully");
		util.click(clApps, "Click on apps and sales channels successfully");
		util.click(clWishApp, "Click on wish integration app successfully");
		util.click(clOpenApp, "Click on open app button successfully");

	}
	
	public void wishNotifications() {
		
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
        util.click(clAccept, "Click on accept successfully");
        util.click(clWiNotifications, "Click on wish notifications successfully");
        util.click(clFetchNotifications, "Click on fetch notifications successfully");
        util.verifyInnerText(inNoNewNotifications, "No new Notifications found on your store.", "No new Notifications found on your store. snapshot");
        
	}

}
