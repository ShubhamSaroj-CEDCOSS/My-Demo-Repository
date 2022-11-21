                                                                                                                                                                                                                                                                                                                                     package shopify_to_wish_bulk_operations_page_methods;

import org.openqa.selenium.support.PageFactory;
import generic_and_basetest_methods.Webutil;

public class Shopify_To_Wish_Bulk_Operations extends Shopify_To_Wish_Bulk_Operations_OR {

	Webutil util;

	public Shopify_To_Wish_Bulk_Operations(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;

	}

	public void shopifySettings() {

		util.click(locSettings, "Click on shopify settings successfully");
		util.click(clApps, "Click on apps and sales channels successfully");
		util.click(clWishApp, "Click on wish integration app successfully");
		util.click(clOpenApp, "Click on open app button successfully");

	}

    public void wishBulkOperations() {
		// Bulk Operations - Product Upload - Export
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
        util.click(clBulkOperations, "Click on bulk operations successfully");
        util.click(clProductUpload, "Click on product upload successfully");
        util.click(clExport, "Click on export successfully");
        util.verifyInnerText(inPlSeProStatus, "Please Select Product Status.", "Please select product status. snapshot");
        util.click(clPlaceholder, "Click on placeholder successfully");
        util.click(clEnabled, "Click on enabled successfully");
        util.click(clExport, "Click on export successfully");
        util.isFileDownloaded("/home/cedcoss/Downloads");
        util.click(clCross, "Click on cross successfully");
        util.click(clDisabled, "Click on disabled successfully");
        util.click(clExport, "Click on export successfully");
        util.verifyInnerText(inNoProFound, "No Products found.", "No Products found. snapshot");
        util.click(clPlaceholder, "Click on placeholder successfully");
        util.click(clNotUploaded, "Click on not uploaded successfully");
        util.click(clExport, "Click on export successfully");
        util.isFileDownloaded("/home/cedcoss/Downloads");
        util.click(clCross, "Click on cross successfully");
        util.verifyInnerText(inEnabled, "ENABLED", "Enabled snapshot");
        util.verifyInnerText(inDisabled, "DISABLED", "Disabled snapshot");
        util.verifyInnerText(inNotUploaded, "NOT UPLOADED", "Not uploaded snapshot");     
       
        // Bulk Operations - Product Update - Export
        util.click(clProductUpdate, "Click on product update successfully");
        util.click(clChooseAnyOne, "Click on choose any one dropdown successfully");
        util.selectByVisibleText(clChooseAnyOne, "Update Product", "Select update product successfully");
        util.click(clExport, "Click on export successfully");
        util.verifyInnerText(inPlSeProStatus, "Please Select Product Status.", "Please select product status. snapshot");
        util.click(clChooseAnyOne, "Click on choose any one dropdown successfully");
        util.selectByVisibleText(clChooseAnyOne, "Update Variant", "Select update product successfully");
        util.click(clExport, "Click on export successfully");
        util.verifyInnerText(inPlSeProStatus, "Please Select Product Status.", "Please select product status. snapshot");
        util.click(clChooseAnyOne, "Click on choose any one dropdown successfully");
        util.selectByVisibleText(clChooseAnyOne, "Update Product", "Select update product successfully");
        util.click(clPlaceholder1, "Click on placeholder successfully");
        util.click(clEnabled1, "Click on enabled successfully");
        util.click(clExport, "Click on export successfully");
        util.holdOn(5);
        util.click(clBack, "Click on back successfully");
        util.isFileDownloaded("/home/cedcoss/Downloads");
        util.click(clChooseAnyOne, "Click on choose any one dropdown successfully");
        util.selectByVisibleText(clChooseAnyOne, "Update Variant", "Select update product successfully");
        util.click(clPlaceholder1, "Click on placeholder successfully");
        util.click(clEnabled1, "Click on enabled successfully");
        util.click(clPlaceholder1, "Click on placeholder successfully");
        util.click(clPrice, "Click on price successfully");
        util.click(clExport, "Click on export successfully");
        util.holdOn(5);
        util.click(clBack, "Click on back successfully");
        util.isFileDownloaded("/home/cedcoss/Downloads");
        util.click(clChooseAnyOne, "Click on choose any one dropdown successfully");
        util.selectByVisibleText(clChooseAnyOne, "Update Product", "Select update product successfully");
        util.verifyAttributeValue(inRuleUpPro, "id", "products_rule");
        util.click(clChooseAnyOne, "Click on choose any one dropdown successfully");
        util.selectByVisibleText(clChooseAnyOne, "Update Variant", "Select update product successfully");
        util.verifyAttributeValue(inRuleUpVar, "id", "variants_rule");
        util.click(clChooseAnyOne, "Click on choose any one dropdown successfully");
        util.verifyInnerText(inUpdateProduct, "Update Product", "Update Product snapshot");
        util.verifyInnerText(inUpdateVariant, "Update Variant", "Update Variant snapshot");
       
	}

}
