package shopify_wish_installation_methods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import generic_and_basetest_methods.Webutil;

public class Shopify_Wish_Installation extends Shopify_Wish_Installation_OR {

	Webutil util;
	
	public Shopify_Wish_Installation(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;

	}
	
	public void wishInstallation() {

		util.click(clWishSettings, "Click on shopify settings successfully");
		util.click(clApps, "Click on apps and sales channels successfully");
		util.click(clShopifyAppStore, "Click on shopify app store successfully");
		util.getWindoHandleByUrl("https://apps.shopify.com/?st_campaign=app-index&st_source=admin&utm_content=contextual&utm_medium=shopify&utm_source=admin", "Open shopify app store tab successfully");
        util.sendkeys(locSearchApp, "Wish"+Keys.ENTER, "Input wish in search box successfully");
        util.jsScrollOnElement(clWishApp);
        util.click(clWishApp, "Click on wish marketplace integration app successfully");
        util.click(clAddApp, "Click on add app successfully");
        util.click(clInstallApp, "Click on install app successfully");
		
	}
	
	public void wishOnboarding() {
		
		//Registration
		//TC_WISH_OB_001
		util.verifyAttributeValue(inFirstName, "value", "Shubham");
		//TC_WISH_OB_002
		util.verifyAttributeValue(inFirstNameBox, "readonly", "true");
		//TC_WISH_OB_003
		util.verifyAttributeValue(inLastName, "value", "Saroj");
		//TC_WISH_OB_004
		util.verifyAttributeValue(inLastNameBox, "readonly", "true");
		//TC_WISH_OB_005
		util.verifyAttributeValue(inEmail, "value", "shubhamsaroj@cedcommerce.com");
		//TC_WISH_OB_006
		util.verifyAttributeValue(inEmailBox, "readonly", "true");
		//TC_WISH_OB_009
		util.click(clTimeZone, "Click on time zone successfully");
		util.selectByVisibleText(clTimeZone, "Other", "Select other successfully");
		util.jsScrollByValue("scrollBy(0,300);");
		util.holdOn(2);
		util.click(clTimeZone, "Click on time zone successfully");
		util.verifyAttributeValue(inOtherTimeZone, "style", "display: block;");
		//TC_WISH_OB_008
		util.click(clTimeZone, "Click on time zone successfully");
		util.selectByVisibleText(clTimeZone, "Eastern Time", "Select eastern time successfully");
		util.verifySelectedDropDown(clTimeZone);
		util.click(clTimeZone, "Click on time zone successfully");
        //TC_WISH_OB_011
        util.click(clTimeSlot, "Click on time slot successfully");
		util.selectByVisibleText(clTimeSlot, "2-4 PM", "Select 2-4 PM successfully");
		util.verifySelectedDropDown(clTimeSlot);
        util.click(clTimeSlot, "Click on time slot successfully");
		//TC_WISH_OB_017
		util.click(clNext, "Click on next successfully");
		util.verifyInnerText(inHowDidMessage, "How did you hear about us? cannot be blank.", "How did you hear about us? cannot be blank. snapshot");
		//TC_WISH_OB_018
		util.click(clHowDid, "Click on how did you come to know about us ? successfully");
		util.selectByVisibleText(clHowDid, "Other", "Select other successfully");
		util.verifyAttributeValue(inOtherReference, "style", "display: block;");
		util.click(clHowDid, "Click on how did you come to know about us ? successfully");
		util.selectByVisibleText(clHowDid, "Shopify App Store", "Select shopify app store successfully");
		util.verifySelectedDropDown(clHowDid);
		//TC_WISH_OB_020
		util.click(clNext, "Click on next successfully");
		util.verifyInnerText(inPlChoAgreement, "Please Choose Agreement.", "Please Choose Agreement. snapshot");
		//TC_WISH_OB_019
		util.click(clCheckBox, "Click on i agree checkbox successfully");
		util.click(clNext, "Click on next successfully");
		util.verifyInnerText(inCoWithWish, "Connect with WISH", "Connect with WISH snapshot");
		
		//Connect With Wish
		//TC_WISH_OB_023
		util.click(clClickHere, "Click on click here successfully");
		util.getWindoHandleByUrl("https://merchant.wish.com/welcome-invite-only", "Open wish for merchants tab successfully");
		util.verifyTitle("Wish for Merchants", "Wish for Merchants snapshot");
		//TC_WISH_OB_024
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/wish-install/index", "Back wish onboarding step 2 successfully");
		util.click(clConnectBtn, "Click on connect button successfully");
		util.verifyInnerText(inLogin, "Login", "Login snapshot");
		util.sendkeys(locEmail, "zillionthings", "Input email id in email box is successfully");
		util.sendkeys(locPassword, "Best%2test", "Input password in password box is successfully");
		util.click(clLogin, "Click on login button successfully");
		util.jsScrollBottom();
		util.click(clAllowAccess, "Click on allow access successfully");
		util.holdOn(2);
		util.click(clConfirm, "Click on confirm successfully");

		//Import Products
		//TC_WISH_OB_025
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "All products import", "Select all products import successfully");
		util.click(clInstantImport, "Click on instant import successfully");
		util.verifyInnerText(inImportedSuccessfully, "101 (new + existing) SKU(s) imported successfully", "101 (new + existing) SKU(s) imported successfully snapshot");
		//TC_WISH_OB_026
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Published products import", "Select published products import successfully");
		util.click(clInstantImport, "Click on instant import successfully");
		util.verifyInnerText(inImportedSuccessfully, "101 (new + existing) SKU(s) imported successfully", "101 (new + existing) SKU(s) imported successfully snapshot");		
    	//TC_WISH_OB_028
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Apply filter for", "Select apply filter for successfully");
		util.click(clProductVendor, "Click on product vendor successfully");
		util.jsScrollBottom();
		util.holdOn(2);
		util.click(clFetchPro, "Click on fetch product from shopify successfully");
		util.click(clSelectAll, "Click on select all successfully");
		util.click(clStartImport, "Click on start import successfully");
		util.click(clInstantImport, "Click on instant import successfully");
		util.holdOn(30);
		util.jsScrollBottom();
		util.holdOn(2);
		util.verifyInnerText(inImportedSuccessfully, "101 (new + existing) SKU(s) imported successfully", "101 (new + existing) SKU(s) imported successfully snapshot");		
		//TC_WISH_OB_030
		util.jsScrollTop();
		util.holdOn(2);
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Apply filter for", "Select apply filter for successfully");
		util.click(clCollection, "Click on collections successfully");
		util.jsScrollBottom();
		util.holdOn(2);
		util.click(clFetchPro, "Click on fetch product from shopify successfully");
		util.click(clSelectAll, "Click on select all successfully");
		util.click(clStartImport, "Click on start import successfully");
		util.click(clInstantImport, "Click on instant import successfully");
		util.jsScrollBottom();
		util.holdOn(2);
		util.verifyInnerText(inImportedSuccessfully, "101 (new + existing) SKU(s) imported successfully", "101 (new + existing) SKU(s) imported successfully snapshot");			
		//TC_WISH_OB_031
		util.jsScrollTop();
		util.holdOn(2);
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "All products import", "Select all products import successfully");
		util.verifyInnerText(inAllProImConfirmation, "All products import confirmation", "All products import confirmation snapshot");
		util.verifyInnerText(inInstantImport, "Instant import", "Instant import snapshot");
		util.verifyInnerText(inBackendImport, "Backend import", "Backend import snapshot");
		util.click(clCross, "Click on cross successfully");
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Apply filter for", "Select apply filter for successfully");
		util.click(clCollection, "Click on collections successfully");
		util.jsScrollBottom();
		util.holdOn(2);
		util.click(clFetchPro, "Click on fetch product from shopify successfully");
		util.click(clSelectAll, "Click on select all successfully");
		util.click(clStartImport, "Click on start import successfully");
		util.verifyInnerText(inFilProImpConfirmation, "Filtered product import confirmation", "Filtered product import confirmation snapshot");
		util.verifyInnerText(inInstantImport, "Instant import", "Instant import snapshot");
		util.verifyInnerText(inBackendImport, "Backend import", "Backend import snapshot");
		util.click(clCross, "Click on cross successfully");
		//TC_WISH_OB_032
		util.jsScrollTop();
		util.holdOn(2);
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Select import options", "Select select import options successfully");
		util.verifyInnerText(inAllProImport, "All products import", "All products import snapshot");
		util.verifyInnerText(inPubProImport, "Published products import", "Published products import snapshot");
		util.verifyInnerText(inAppFilFor, "Apply filter for", "Apply filter for snapshot");
		util.click(clImportOption, "Click on import product option successfully");
		//TC_WISH_OB_033
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Apply filter for", "Select apply filter for successfully");
		util.click(clCollection, "Click on collections successfully");
		util.jsScrollBottom();
		util.holdOn(2);
		util.click(clFetchPro, "Click on fetch product from shopify successfully");
		util.verifyInnerText(inHomePage, "Home page", "Home page snapshot");
		util.verifyInnerText(inManualCollection, "manual collection", "Manual Collection snapshot");
		util.verifyInnerText(inSummerCollection, "Summer Collection", "Summer Collection snapshot");
		//TC_WISH_OB_034
		util.jsScrollTop();
		util.holdOn(2);
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Apply filter for", "Select apply filter for successfully");
		util.click(clCollection, "Click on collections successfully");
		util.jsScrollBottom();
		util.holdOn(2);
		util.click(clStartImport, "Click on start import successfully");
		if(!util.alertGGetText().equals("")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		util.alertAccept();
		util.printExtentTestMsg("Validation pop-up stating please select atleast one option should appear with ok button");
		//TC_WISH_OB_035
		util.jsScrollTop();
		util.holdOn(2);
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "Apply filter for", "Select apply filter for successfully");
		util.click(clCollection, "Click on collections successfully");
		util.jsScrollBottom();
		util.holdOn(2);
		util.click(clReFetchPro, "Click on fetch product from shopify successfully");
		util.click(clSelectAll, "Click on select all successfully");
		util.click(clStartImport, "Click on start import successfully");
		util.verifyInnerText(inFilProImpConfirmation, "Filtered product import confirmation", "Filtered product import confirmation snapshot");
		util.verifyInnerText(inInstantImport, "Instant import", "Instant import snapshot");
		util.verifyInnerText(inBackendImport, "Backend import", "Backend import snapshot");
		util.click(clCross, "Click on cross successfully");
    	//TC_WISH_OB_037
		util.verifyAttributeValue(inCollHomePage, "title", "Home page");
		util.click(clSelOpt, "Click on select option box successfully");
		util.click(clUnselectAll, "Click on unselect all successfully");
		util.verifyAttributeValue(inSelectOption, "placeholder", "Select an option");
		
		//TC_WISH_OB_041
		//Product Syncing Configuration
		util.jsScrollTop();
		util.holdOn(2);
		util.click(clImportOption, "Click on import product option successfully");
		util.selectByVisibleText(clImportOption, "All products import", "Select all products import successfully");
		util.click(clInstantImport, "Click on instant import successfully");
		util.click(clNextBtn, "Click on next successfully");
		util.verifyInnerText(inProSyncConfig, "Product Syncing Configuration", "Product Syncing Configuration snapshot");
		
	}
	
}