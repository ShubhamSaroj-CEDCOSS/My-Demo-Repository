package shopify_to_wish_home_page_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify_To_Wish_Home_OR {

	/* Shopify Settings OR */
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement locSettings;
	
	@FindBy(xpath = "//span[text()='Apps and sales channels']")
	WebElement clApps;

	@FindBy(xpath = "//span[text()='Wish Marketplace - Integration']")
	WebElement clWishApp;

	@FindBy(xpath = "//span[text()='Open app']")
	WebElement clOpenApp;
	
	/* Wish Home OR */
	@FindBy(xpath = "//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//ul[1]//li[2]//div[1]//a[1]")
	WebElement clNotUploadedSKU;
	/* SKUs(Product Information) OR */
	@FindBy(xpath = "//h1[text()='Manage Products']")
	WebElement inManageProducts;
	
	@FindBy(xpath = "//a[text()='NOT UPLOADED']")
	WebElement inNotUploded;
	
	@FindBy(xpath = "//span[text()='Home']")
	WebElement clHome;
	
	@FindBy(xpath = "//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//div[2]//div[1]//ul[1]//li[1]//div[1]//a[1]")
	WebElement clUploadedSKU;
	
	@FindBy(xpath = "//a[text()='ENABLED']")
	WebElement inEnabled;
	
	@FindBy(xpath = "(//a[contains(@class,'Polaris-ResourceItem__Link')])[3]")
	WebElement clDisabledSKU;
	
	@FindBy(xpath = "//a[text()='DISABLED']")
	WebElement inDisabled;
	
	@FindBy(xpath = "//a[text()='All Products']")
	WebElement clAllProducts;
	
	@FindBy(xpath = "//a[text()='ALL']")
	WebElement inAllManagedProducts;
	/* Order Information OR */
	@FindBy(xpath = "//span[text()='Orders']")
	WebElement inOrders;
	
	@FindBy(xpath = "//span[text()='Sales Orders']")
	WebElement inSalesOrder;
	
	@FindBy(xpath = "//div[contains(@class,'mb-20')]//div[2]//div[1]//div[2]//div[1]//ul[1]//li[1]//div[1]//a[1]")
	WebElement clUnFulfilledOrders;
	
	@FindBy(xpath = "//a[text()='NEW']")
	WebElement inNew;
	
	@FindBy(xpath = "(//a[@class='Polaris-ResourceItem__Link'])[6]")
	WebElement clFulfilledOrders;
	
	@FindBy(xpath = "//a[text()='SHIPPED']")
	WebElement inShipped;
	
	@FindBy(xpath = "(//a[contains(@class,'Polaris-ResourceItem__Link')])[7]")
	WebElement clRefundedOrders;
	
	@FindBy(xpath = "//a[text()='REFUNDED']")
	WebElement inRefunded;
	
	@FindBy(xpath = "//a[contains(@href,'https://apps.cedcommerce.com/marketplace-integration/wish/order/list-fail')]")
	WebElement clFailedOrders;
	
	@FindBy(xpath = "//span[text()='Failed Orders']")
	WebElement inFailedOrders;
	
	@FindBy(xpath = "//a[text()='FAILED']")
	WebElement inFailed;
	
	@FindBy(xpath = "//a[text()='All Orders']")
	WebElement clAllOrders;
	
	@FindBy(xpath = "//a[text()='ALL']")
	WebElement inAllOrders;
	/* Filter Data OR */
	@FindBy(xpath = "//span[text()='This Week']")
	WebElement clFilterThisWeek;
	
	@FindBy(xpath = "//div[text()='This Year']")
	WebElement clThisYear;
	
	@FindBy(xpath = "//span[text()='This Year']")
	WebElement inFilterThisYear;
	
	@FindBy(xpath = "//span[text()='This Year']")
	WebElement clFilterThisYear;
	
	@FindBy(xpath = "//div[text()='This Month']")
	WebElement clThisMonth;
	
	@FindBy(xpath = "//span[text()='This Month']")
	WebElement inFilterThisMonth;
	
	@FindBy(xpath = "//span[text()='This Month']")
	WebElement clFilterThisMonth;
	
	@FindBy(xpath = "//div[text()='This Week']")
	WebElement clThisWeek;
	
	@FindBy(xpath = "//span[text()='This Week']")
	WebElement inFilterThisWeek;
	/* To Do OR */
	@FindBy(xpath = "//div[2]//div[1]//div[1]//div[3]//div[2]//div[1]//ul[1]//li[2]//div[1]//a[1]")
	WebElement clToDo;
	
	@FindBy(xpath = "//b[text()='20']")
	WebElement in20Item;
	/* Recent Activities OR */
	@FindBy(xpath = "//span[text()='Orders']")
	WebElement clOrders;
	
	@FindBy(xpath = "//span[text()='Sales Orders']")
	WebElement clSalesOrders;
	
	@FindBy(xpath = "//div[@class='Polaris-ActionMenu__ActionsLayout']//button[@id='fetch-wish-orders']")
	WebElement clFetchOrder;
	
	@FindBy(xpath = "(//div[@class='Polaris-Stack__Item Polaris-TextStyle--variationSubdued'])[1]")
	WebElement inOrdersFetched;
	
	@FindBy(xpath = "(//div[@class='Polaris-Stack__Item Polaris-TextStyle--variationSubdued'])[1]")
	WebElement inOrderFetched;
	/* Errors Info OR */
	@FindBy(xpath = "//span[text()='Products']")
	WebElement clProducts;
	
	@FindBy(xpath = "//span[text()='Manage Products']")
	WebElement clManagedProducts;
	
	@FindBy(xpath = "(//span[@class='Polaris-Checkbox'])[1]")
	WebElement clAllSelectBox;
	
	@FindBy(xpath = "(//select[@id='wish_product_select'])[2]")
	WebElement clBulkAction;
	
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	WebElement clSubmit;
	
	@FindBy(xpath = "//span[text()='Back']")
	WebElement clBack;
	
	@FindBy(xpath = "(//a[@class='Polaris-ResourceItem__Link'])[13]")
	WebElement inProductUpError;
	
	@FindBy(xpath = "//h1[text()='Errors']")
	WebElement inInfoErrors;
	
	@FindBy(xpath = "//a[text()='Product Upload Error']")
	WebElement inProUpError;
	
	@FindBy(xpath = "//th[text()='Sku']")
	WebElement inErrorSKU;
	
	@FindBy(xpath = "//th[text()='Error And Solution']")
	WebElement inErrorSolution;
	
	@FindBy(xpath = "//th[text()='Error Time ( Utc)']")
	WebElement inErrorTime;
			
	@FindBy(xpath = "(//span[text()='Know More'])[1]")
	WebElement clErrorsKnowMore;
	
	@FindBy(xpath = "//a[text()='PRODUCT DELETE WEBHOOK']")
	WebElement inProDelWebhook;
	
	@FindBy(xpath = "//a[text()='INVENTORY UPDATE WEBHOOK']")
	WebElement inInUpWebhook;
	/* Account Info OR */	
	@FindBy(xpath = "(//div[@class='Polaris-Stack__Item Polaris-TextStyle--variationSubdued'])[8]")
	WebElement inSubscription;
	
	@FindBy(xpath = "(//div[@class='Polaris-Stack__Item Polaris-TextStyle--variationSubdued'])[9]")
	WebElement inSKUpLimit;
	
	@FindBy(xpath = "(//div[@class='Polaris-Stack__Item Polaris-TextStyle--variationSubdued'])[10]")
	WebElement inSKImLimit;
	
	@FindBy(xpath = "(//div[@class='Polaris-Stack__Item Polaris-TextStyle--variationSubdued'])[11]")
	WebElement inOrImLimit;
	
	@FindBy(xpath = "(//span[text()='Know More'])[2]")
	WebElement clErrorsKnowMore2;
	
	@FindBy(xpath = "//h1[text()='Shubham Saroj']")
	WebElement inSS;
	/* FAQ's OR */
	@FindBy(xpath = "//a[@href='/marketplace-integration/wish/help/index#div_136']")
	WebElement clFaqs1;
	
	@FindBy(xpath = "//a[text()='How can I upload/publish my products on Wish?']")
	WebElement inFaqs1;
	
	@FindBy(xpath = "//a[@href='/marketplace-integration/wish/help/index#div_141']")
	WebElement clFaqs2;
	
	@FindBy(xpath = "//a[text()='Does the App support other currencies? My store currency is in Euro, how will the app process it to Wish?']")
	WebElement inFaqs2;
	
	@FindBy(xpath = "//a[@href='/marketplace-integration/wish/help/index#div_140']")
	WebElement clFaqs3;
	
	@FindBy(xpath = "//a[text()='How can I see the status of my current products? ']")
	WebElement inFaqs3;
	
	@FindBy(xpath = "//span[text()='View More']")
	WebElement clFaqsViewMore;
	
	@FindBy(xpath = "//h1[text()='Wish Integration Tutorial and Knowledge Base']")
	WebElement inKnowledgeBase;
	/* Social Links OR */		
	@FindBy(xpath = "//span[@class='fa fa-twitter']")
	WebElement clTwitter;
	
	@FindBy(xpath = "//span[@class='fa fa-facebook']")
	WebElement clFacebook;
	
	@FindBy(xpath = "//span[@class='fa fa-linkedin']")
	WebElement clLinkedIn;
	
	@FindBy(xpath = "//span[@class='fa fa-youtube']")
	WebElement clYoutube;
	
	@FindBy(xpath = "//a[text()='Blogs']")
	WebElement clBlogs;
	
	@FindBy(xpath = "(//a[@href='/marketplace-integration/wish/help/index'])[3]")
	WebElement clFAQs;
	
	@FindBy(xpath = "//a[text()='FAQs']")
	WebElement inFAQs;
	
	@FindBy(xpath = "//a[text()='News']")
	WebElement clNews;
	
	@FindBy(xpath = "//a[text()='Documentation']")
	WebElement clDocumentation;
	/* Refresh Dashboard Link OR */	
	@FindBy(xpath = "//strong[text()='here ']")
	WebElement clHere;
	
	@FindBy(xpath = "//em[@class='Polaris-TextStyle--variationSubdued']")
	WebElement inLastRefresh;
			
}