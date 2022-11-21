package shopify_to_wish_help_page_methods;

import org.openqa.selenium.support.PageFactory;
import generic_and_basetest_methods.Webutil;

public class Shopify_To_Wish_Help extends Shopify_To_Wish_Help_OR {

	Webutil util;

	public Shopify_To_Wish_Help(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;

	}

	public void shopifySettings() {

		util.click(locSettings, "Click on shopify settings successfully");
		util.click(clApps, "Click on apps and sales channels successfully");
		util.click(clWishApp, "Click on wish integration app successfully");
		util.click(clOpenApp, "Click on open app button successfully");

	}
	
	public void wishHelp() {
		
		//Knowledge Base
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
        util.click(clAccept, "Click on accept successfully");
        util.click(clHelp, "Click on help successfully");
        util.click(clKnowledgeBase, "Click on knowledge base successfully");
        util.verifyAttributeValue(inGeneral, "href", "https://apps.cedcommerce.com/marketplace-integration/wish/help/index#collapse1");
        util.verifyAttributeValue(inProduct, "href", "https://apps.cedcommerce.com/marketplace-integration/wish/help/index#collapse2");
        util.click(clGeneral, "Click on general successfully");
        util.verifyAttributeValue(inGeneralHelp, "id", "collapse1");
        util.jsScrollBottom();
        util.holdOn(2);
        util.click(clProduct, "Click on product successfully");
        util.verifyAttributeValue(inProductHelp, "id", "collapse2");
        util.jsScrollTop();
        util.holdOn(2);
        util.click(clVideos, "Click on videos successfully");
        util.verifyAttributeValue(inHowProWish, "title", "How to upload Product on wish");
        util.verifyAttributeValue(inHowShiTem, "title", "How to create a Shipping Template");
        util.click(clHowProWish, "Click on how to upload product on wish successfully");
        util.verifyInnerText(inTextHowProWish, "How to upload Product on wish", "How to upload Product on wish snapshot");
        util.click(clClose, "Click on close successfully");
        util.click(clHowShiTem, "Click on how to create a shipping template successfully");
        util.verifyInnerText(inTextHowShiTem, "How to create a Shipping Template", "How to create a Shipping Template snapshot");
        util.click(clClose, "Click on close successfully");
        util.click(clBlog, "Click on blog successfully");
        util.verifyAttributeValue(inStartSellWish, "class", "Polaris-TextContainer");
        util.holdOn(2);
        util.jsScrollBottom();
        util.holdOn(2);
        util.verifyInnerText(inSuccessStories, "Success Stories", "Success Stories snapshot");
        util.verifyAttributeValue(inStartSellWishHelp, "class", "Polaris-Layout__AnnotationContent");
        util.verifyAttributeValue(inSuccessStoriesHelp, "class", "Polaris-Layout__AnnotationContent");
        
        //Documentation
        util.click(clDocumentation, "Click on documentation successfully");
		util.getWindoHandleByUrl("https://docs.cedcommerce.com/shopify/wish-marketplace-integration-app-guide/", "Open document tab successfully");
        util.verifyTitle("Wish Marketplace Integration App Guide - CedCommerce", "Document snapshot");
        
	}

}
