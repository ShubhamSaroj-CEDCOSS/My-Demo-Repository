package shopify_to_wish_wish_notifications_page_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify_To_Wish_Wish_Notifications_OR {

	/* Shopify Settings OR */
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement locSettings;
	
	@FindBy(xpath = "//span[text()='Apps and sales channels']")
	WebElement clApps;

	@FindBy(xpath = "//span[text()='Wish Marketplace - Integration']")
	WebElement clWishApp;

	@FindBy(xpath = "//span[text()='Open app']")
	WebElement clOpenApp;
	
	/* Wish Notifications OR */
	@FindBy(xpath = "//span[text()='Accept']")
	WebElement clAccept;
	
	@FindBy(xpath = "//span[text()='Wish Notifications']")
	WebElement clWiNotifications;
	
	@FindBy(xpath = "//button[@class='Polaris-ActionMenu-MenuAction ']")
	WebElement clFetchNotifications;
	
	@FindBy(xpath = "//p[text()=' No new Notifications found on your store. ']")
	WebElement inNoNewNotifications;
	
}
