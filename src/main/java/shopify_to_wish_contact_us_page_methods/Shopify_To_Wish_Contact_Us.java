package shopify_to_wish_contact_us_page_methods;

import org.openqa.selenium.support.PageFactory;
import generic_and_basetest_methods.Webutil;

public class Shopify_To_Wish_Contact_Us extends Shopify_To_Wish_Contact_Us_OR {

	Webutil util;

	public Shopify_To_Wish_Contact_Us(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;

	}
	
	public void shopifySettings() {

		util.click(locSettings, "Click on shopify settings successfully");
		util.click(clApps, "Click on apps and sales channels successfully");
		util.click(clWishApp, "Click on wish integration app successfully");
		util.click(clOpenApp, "Click on open app button successfully");

	}
	
	public void wishContactUs() {
		
		//Contact Us
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
        util.click(clAccept, "Click on accept successfully");
        util.click(clContactUs, "Click on contact us successfully");
        util.click(clQueryType, "Click on query type dropdown successfully");
        util.selectByVisibleText(clQueryType, "Other", "Select Other dropdown successfully");
        util.verifyInnerText(inOther, "Other", "Other snapshot");
        util.selectByVisibleText(clQueryType, "Listing Optimization and Product SEO", "Select Listing Optimization and Product SEO dropdown successfully");
        util.verifyInnerText(inSEO, "Listing Optimization and Product SEO", "Listing Optimization and Product SEO snapshot");
        util.selectByVisibleText(clQueryType, "Request a demo", "Select Request a demo dropdown successfully");
        util.verifyInnerText(inReqDemo, "Request a demo", "Request a demo snapshot");
        util.selectByVisibleText(clQueryType, "Pricing", "Select Pricing dropdown successfully");
        util.verifyInnerText(inPricing, "Pricing", "Pricing snapshot");
        util.selectByVisibleText(clQueryType, "Order", "Select Pricing dropdown successfully");
        util.verifyInnerText(inOrder, "Order", "Order snapshot");
        util.selectByVisibleText(clQueryType, "Product", "Select Product dropdown successfully");
        util.verifyInnerText(inProduct, "Product", "Product snapshot");
        util.click(clQueryType, "Click on query type dropdown successfully");
        util.sendkeys(locMessage, "Nothing", "Input message text box is successfully");
        util.verifyElementVisible(locSubmit, "Submit snapshot");
        util.refreshPage();
        util.verifyElementInvisible(locSubmit, "Submit snapshot");   
        util.click(clWhatsapp, "Click on whatsapp support successfully");
		util.getWindoHandleByUrl("https://chat.whatsapp.com/KNEkdy6QE2nFKXKJOUjFRY", "Open whatsapp support tab successfully");
        util.verifyTitle("WhatsApp Group Invite", "Whatsapp snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/contact-us", "Open wish tab successfully");	
        util.click(clSkype, "Click on skype support successfully");
		util.getWindoHandleByUrl("https://join.skype.com/UzqVhEKRn2md", "Open skype support tab successfully");
		util.verifyTitle("Join conversation", "Skype snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/contact-us", "Open wish tab successfully");	
        util.click(clTicket, "Click on ticket support successfully");
		util.getWindoHandleByUrl("https://support.cedcommerce.com/open.php", "Open ticket support tab successfully");
        util.verifyTitle("Support Team CedCommerce", "Ticket snapshot");
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/contact-us", "Open wish tab successfully");
        
	}
	
}
