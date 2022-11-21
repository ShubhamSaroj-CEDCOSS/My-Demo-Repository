package shopify_to_wish_home_page_methods;

import org.openqa.selenium.support.PageFactory;
import generic_and_basetest_methods.Webutil;

public class Shopify_To_Wish_Home extends Shopify_To_Wish_Home_OR {

	Webutil util;

	public Shopify_To_Wish_Home(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;

	}

	public void shopifySettings() {

		util.click(locSettings, "Click on shopify settings successfully");
		util.click(clApps, "Click on apps and sales channels successfully");
		util.click(clWishApp, "Click on wish integration app successfully");
		util.click(clOpenApp, "Click on open app button successfully");

	}

	public void wishHome() {

		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		//SKUs(Product Information)
		//TC NO. 1
		util.click(clNotUploadedSKU, "Click on not uploaded sku(s) successfully");	
		util.verifyInnerText(inManageProducts, "Manage Products", "Manage Products snapshot");
		util.verifyInnerText(inNotUploded,"NOT UPLOADED","Not uploaded innertext snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 1");
		//TC NO. 2
		util.click(clUploadedSKU, "Click on uploaded sku(s) successfully");
		util.verifyInnerText(inManageProducts, "Manage Products", "Manage Products snapshot");
		util.verifyInnerText(inEnabled, "ENABLED", "Enabled snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 2");
		//TC NO. 3
		util.click(clDisabledSKU, "Click on disabled sku(s) successfully");
		util.verifyInnerText(inManageProducts, "Manage Products", "Manage Products snapshot");
		util.verifyInnerText(inDisabled, "DISABLED", "Disabled snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 3");
		//TC NO. 5
		util.click(clAllProducts, "Click on all products link successfully");
		util.verifyInnerText(inManageProducts, "Manage Products", "Manage Products snapshot");
		util.verifyInnerText(inAllManagedProducts, "ALL", "All managed products snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 5");
		//Order Information
		//TC NO. 6
		util.click(clUnFulfilledOrders, "Click on un fulfilled orders successfully");	
		util.verifyInnerText(inOrders, "Orders", "Orders snapshot");
		util.verifyInnerText(inSalesOrder, "Sales Orders", "Sales Orders snapshot");
		util.verifyInnerText(inNew, "NEW", "New snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 6");
		//TC NO. 7
		util.click(clFulfilledOrders, "Click on fulfilled orders successfully");
		util.verifyInnerText(inOrders, "Orders", "Orders snapshot");
		util.verifyInnerText(inSalesOrder, "Sales Orders", "Sales Orders snapshot");
		util.verifyInnerText(inShipped, "SHIPPED", "Shipped snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 7");
		//TC NO. 8
		util.click(clRefundedOrders, "Click on refunded orders successfully");
		util.verifyInnerText(inOrders, "Orders", "Orders snapshot");
		util.verifyInnerText(inSalesOrder, "Sales Orders", "Sales Orders snapshot");
		util.verifyInnerText(inRefunded, "REFUNDED", "Refunded snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 8");
		//TC NO. 9
		util.click(clFailedOrders, "Click on failed orders successfully");
		util.verifyInnerText(inOrders, "Orders", "Orders snapshot");
        util.verifyInnerText(inFailedOrders, "Failed Orders", "Failed Orders snapshot");
		util.verifyInnerText(inFailed, "FAILED", "Failed snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 9");
		//TC NO. 10
		util.click(clAllOrders, "Click on all orders successfully");
		util.verifyInnerText(inOrders, "Orders", "Orders snapshot");
		util.verifyInnerText(inSalesOrder, "Sales Orders", "Sales Orders snapshot");
		util.verifyInnerText(inAllOrders, "ALL", "All orders snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 10");
		//Filter Data
		//TC NO. 11
		util.click(clFilterThisWeek, "Click on filter data drop down successfully");
		util.click(clThisYear, "Click on this year successfully");
		util.verifyInnerText(inFilterThisYear, "This Year", "This year snapshot");
		util.click(clFilterThisYear, "Click on filter data drop down successfully");
		util.click(clThisMonth, "Click on this month successfully");
		util.verifyInnerText(inFilterThisMonth, "This Month", "This month snapshot");
		util.click(clFilterThisMonth, "Click on filter data drop down successfully");
		util.click(clThisWeek, "Click on this week successfully");
		util.verifyInnerText(inFilterThisWeek, "This Week", "This week snapshot");
		util.printExtentTestMsg("TC NO. 11");
		//To Do
		//TC NO. 12
		util.jsScrollByValue("window.scrollBy(0,400);");
		util.holdOn(2);
		util.click(clToDo, "Click on to do successfully");  
		util.verifyInnerText(inOrders, "Orders", "Orders snapshot");
		util.verifyInnerText(inSalesOrder, "Sales Orders", "Sales Orders snapshot");
		util.verifyInnerText(inNew, "NEW", "New snapshot");
		util.verifyInnerText(in20Item, "20", "20 item snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 12");
		//Recent Activities
		//TC NO. 13
		util.click(clOrders, "Click on orders successfully");
		util.click(clSalesOrders, "Click on sales orders successfully");
		util.click(clFetchOrder, "Click on fetch orders successfully");
		util.holdOn(5);
		util.click(clHome, "Click on home successfully");
		util.jsScrollByValue("window.scrollBy(0,600);");
		util.holdOn(2);
		String orderFetched = inOrdersFetched.getText();
		util.printExtentTestMsg("Order Fetched Update Time is -"+orderFetched);
		util.printExtentTestMsg("TC NO. 13");
		//Errors Info
		//TC NO. 15
		util.click(clProducts, "Click on products successfully");
		util.click(clManagedProducts, "Click on managed products successfully");
		util.jsScrollByValue("window.scrollBy(0,200);");
		util.holdOn(2);
		util.click(clAllSelectBox, "Click on all select checkbox successfully");
		util.click(clBulkAction, "Click on bulk action successfully");
		util.selectByVisibleText(clBulkAction, "Upload Product On Wish", "Select upload product on wish successfully");
		util.click(clSubmit, "Click on submit successfully");
		util.holdOn(25);
		util.click(clBack, "Click on back button successfully");
		util.click(clHome, "Click on home successfully"); 
		util.jsScrollByValue("window.scrollBy(0,1000);");
		util.holdOn(2);
	    String proUpError = inProductUpError.getText();
	    util.printExtentTestMsg("Product Upload(s) Error is -"+proUpError);
	    util.printExtentTestMsg("TC NO. 15");
	    //TC NO. 16
	    util.click(inProductUpError, "Click on 25 errors successfully");
	    util.verifyInnerText(inInfoErrors, "Errors", "Errors snapshot");
	    util.verifyInnerText(inProUpError, "Product Upload Error", "Product Upload Error snapshot");
        util.verifyInnerText(inErrorSKU, "Sku", "Sku snapshot");
        util.verifyInnerText(inErrorSolution, "Error And Solution", "Error And Solution snapshot");
        util.verifyInnerText(inErrorTime, "Error Time ( Utc)", "Error Time ( Utc) snapshot");
		util.click(clHome, "Click on home successfully"); 
		util.printExtentTestMsg("TC NO. 16");
		//TC NO. 17
		util.jsScrollByValue("window.scrollBy(0,1000);");
		util.holdOn(2);
		util.click(clErrorsKnowMore, "Click on errors info know more successfully");
	    util.verifyInnerText(inInfoErrors, "Errors", "Errors snapshot");
	    util.verifyInnerText(inProUpError, "Product Upload Error", "Product Upload Error snapshot");
        util.verifyInnerText(inProDelWebhook, "PRODUCT DELETE WEBHOOK", "PRODUCT DELETE WEBHOOK snapshot");
        util.verifyInnerText(inInUpWebhook, "INVENTORY UPDATE WEBHOOK", "INVENTORY UPDATE WEBHOOK snapshot");
		util.click(clHome, "Click on home successfully"); 
		util.printExtentTestMsg("TC NO. 17");
		//Account Info
		//TC NO. 18
		util.jsScrollByValue("window.scrollBy(0,1200);");
		util.holdOn(2);
		String purchased = inSubscription.getText();
		util.printExtentTestMsg("Subscripton is -"+purchased);
		String skuUpLimit = inSKUpLimit.getText();
		util.printExtentTestMsg("SKU Upload Limit is -"+skuUpLimit);
		String skuImLimit = inSKImLimit.getText();
		util.printExtentTestMsg("SKU Import Limit is -"+skuImLimit);
		String orImLimit = inOrImLimit.getText();
		util.printExtentTestMsg("Order Import Limit is -"+orImLimit);
		util.printExtentTestMsg("TC NO. 18");
		//TC NO. 19
		util.click(clErrorsKnowMore2, "Click on account info know more successfully");
		util.verifyInnerText(inSS, "Shubham Saroj", "Shubham saroj snapshot");
		util.click(clHome, "Click on home successfully"); 
		util.printExtentTestMsg("TC NO. 19");
		//FAQ's
		//TC NO. 21
		util.jsScrollByValue("window.scrollBy(0,1200);");
		util.holdOn(2);
		util.click(clFaqs1, "Click on faqs1 successfully");
		util.verifyInnerText(inFaqs1, "How can I upload/publish my products on Wish?", "Faqs1 snapshot");
		util.holdOn(3);
		util.click(clHome, "Click on home successfully"); 
		util.jsScrollByValue("window.scrollBy(0,1200);");
		util.holdOn(2);
		util.click(clFaqs2, "Click on faqs2 successfully");
		util.verifyInnerText(inFaqs2, "Does the App support other currencies? My store currency is in Euro, how will the app process it to Wish?", "Faqs2 snapshot");
		util.holdOn(4);
		util.click(clHome, "Click on home successfully"); 
		util.jsScrollByValue("window.scrollBy(0,1200);");
		util.holdOn(2);
		util.click(clFaqs3, "Click on faqs3 successfully");
		util.verifyInnerText(inFaqs3, "How can I see the status of my current products?", "Faqs3 snapshot");
		util.holdOn(4);
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 21");
		//TC NO. 22
		util.jsScrollByValue("window.scrollBy(0,1200);");
		util.holdOn(2);
		util.click(clFaqsViewMore, "Click on faqs view more successfully");
		util.verifyInnerText(inKnowledgeBase, "Wish Integration Tutorial and Knowledge Base", "Knowledge base snapshot");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 22");
		//Social Links
		//TC NO. 23
		util.jsScrollByValue("window.scrollBy(0,1800);");
		util.holdOn(2);
		util.click(clTwitter, "Click on twitter successfully");
		util.getWindoHandleByUrl("https://twitter.com/cedcommerce?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor", "Open twitter tab successfully");
		util.verifyTitle("Twitter", "Twitter snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clFacebook, "Click on facebook successfully");
		util.getWindoHandleByUrl("https://www.facebook.com/CedCommerce/", "Open facebook tab successfully");
		util.verifyTitle("CedCommerce - Home | Facebook", "Twitter snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clLinkedIn, "Click on linkedin successfully");
		util.getWindoHandleByUrl("https://www.linkedin.com/authwall?trk=bf&trkInfo=AQGrBPXOEalMTQAAAWArrVUgzY5WsceJ1CPkoqrzfEgW-DO3zMyUpzVFZcUggY-w9cCL_t64GT8IECA2K47KDkyf85C4QwflYG-60kWt0fp_kf6esqnMnsXenfMWltS3hUX7Y7o=&originalReferer=&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Fcedcommerce", "Open linkedin tab successfully");
		util.verifyTitle("Sign In | LinkedIn", "Linkedin snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clYoutube, "Click on youtube successfully");
		util.getWindoHandleByUrl("https://www.youtube.com/channel/UCLRUCC_jvKf4tfZ2omjaW8Q", "Open youtube tab successfully");
		util.verifyTitle("CedCommerce - YouTube", "Youtube snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.printExtentTestMsg("TC NO. 23");
		//TC NO. 24
		util.click(clBlogs, "Click on blogs successfully");
		util.getWindoHandleByUrl("https://cedcommerce.com/blog/shopify/", "Open blogs tab successfully");
		util.verifyTitle("shopify", "Blogs snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clFAQs, "Click on faqs successfully");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/help/index", "Open faqs tab successfully");
		util.verifyInnerText(inFAQs, "FAQs", "FAQs snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clNews, "Click on news successfully");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/case-studies/", "Open news tab successfully");
		util.verifyTitle("Case Study | CedCommerce - Shopify", "News snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clDocumentation, "Click on documentation successfully");
		util.getWindoHandleByUrl("https://docs.cedcommerce.com/shopify/wish-marketplace-integration-app-guide/", "Open documentation tab successfully");
		util.verifyTitle("Wish Marketplace Integration App Guide - CedCommerce", "Documentation snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clHome, "Click on home successfully");
		util.printExtentTestMsg("TC NO. 24");
		//Refresh Dashboard Link
		//TC NO. 25
		util.click(clHere, "Click on here successfully");
		String lastRefresh = inLastRefresh.getText();
		util.printExtentTestMsg("Last Refresh Update Time is -"+lastRefresh);
		util.printExtentTestMsg("TC NO. 25");

	}

}