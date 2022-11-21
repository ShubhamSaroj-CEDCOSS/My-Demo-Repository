package shopify_to_wish_products_page_methods;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import generic_and_basetest_methods.Webutil;

public class Shopify_To_Wish_Products extends Shopify_To_Wish_Products_OR {

	Webutil util;

	public Shopify_To_Wish_Products(Webutil wu) {

		PageFactory.initElements(wu.getDriver(), this);
		this.util=wu;

	}

	public void shopifySettings() {

		util.click(locSettings, "Click on shopify settings successfully");
		util.click(clApps, "Click on apps and sales channels successfully");
		util.click(clWishApp, "Click on wish integration app successfully");
		util.click(clOpenApp, "Click on open app button successfully");

	}

	public void wishProducts() {

		// Product - Managed Products	
		util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/site/index", "Open wish tab successfully");
		util.click(clProducts, "Click on products successfully");
		//		util.click(clManageProducts, "Click on manage products successfully");
		// Manage Products - More Action
		//Verify more action dropdown.
		//		util.click(clMoreAction, "Click on more action successfully");
		//		util.verifyInnerText(inExportProducts, "Export Products", "Export Products snapshot");
		//		util.verifyInnerText(inImportProducts, "Import Products", "Import Products snapshot");
		//		//Verify export products option.
		//		util.click(clExportProducts, "Click on export products successfully");
		//		util.verifyAttributeValue(inProductsOpt, "id", "product_editing_columns");
		//		util.click(clVariants, "Click on variants successfully");
		//		util.verifyAttributeValue(inVariantsOpt, "id", "variants_editing_columns");
		//		util.click(clClose, "Click on close successfully");
		//		//Verify import products option.
		//		util.click(clMoreAction, "Click on more action successfully");
		//        util.click(clImportProducts, "Click on import products successfully");
		//        util.verifyAttributeValue(inChooseFile, "id", "file");
		//        util.click(clClose2, "Click on close 2 successfully");
		//        //Verify export products modal.
		//		util.click(clMoreAction, "Click on more action successfully");
		//		util.click(clExportProducts, "Click on export products successfully");
		//		util.verifyAttributeValue(inExportOpt, "class", "Polaris-Modal__BodyWrapper");
		//		util.click(clClose, "Click on close successfully");
		//		//Verify import pop-up.
		//		util.click(clMoreAction, "Click on more action successfully");
		//        util.click(clImportProducts, "Click on import products successfully");
		//        util.verifyAttributeValue(inChooseFile, "id", "file");
		//        util.verifyAttributeValue(inClose2, "id", "sync-cancel");
		//        util.verifyAttributeValue(inImport, "id", "import");
		//        util.click(clClose2, "Click on close 2 successfully");
		//        //Verify current page option on export modal.
		//		util.click(clMoreAction, "Click on more action successfully");
		//		util.click(clExportProducts, "Click on export products successfully");
		//		util.verifyAttributeValue(inCurrentPage, "class", "Polaris-Choice__Label");
		//		//Verify all products option on export modal.
		//		util.verifyAttributeValue(inAllProducts, "class", "Polaris-Choice__Label");
		//		util.click(clClose, "Click on close successfully");

		//		// Manage Products - Search Box
		//		//Check by searching Product TitIe.
		//		util.sendkeys(locSearch, "Denim Jacket"+Keys.ENTER, "Search jeans product successfully");
		//		util.jsScrollBottom();
		//		util.holdOn(3);
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching SKU.
		//        util.sendkeys(locSearch, Keys.CONTROL+ "a"+Keys.DELETE, "Selected all text successfully");
		//		util.sendkeys(locSearch, "DJ9435SS"+Keys.ENTER, "Search sku successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching Product id.
		//        util.sendkeys(locSearch, Keys.CONTROL+ "a"+Keys.DELETE, "Selected all text successfully");
		//		util.sendkeys(locSearch, "7849598681329"+Keys.ENTER, "Search product id successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching Variant id.
		//        util.sendkeys(locSearch, Keys.CONTROL+ "a"+Keys.DELETE, "Selected all text successfully");
		//		util.sendkeys(locSearch, "43444986708209"+Keys.ENTER, "Search product variant id successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching Wish product id.
		//        util.sendkeys(locSearch, Keys.CONTROL+ "a"+Keys.DELETE, "Selected all text successfully");
		//		util.sendkeys(locSearch, "63668e863a231f9a7dfe89b7"+Keys.ENTER, "Search wish product id successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching Wish Variant id.
		//        util.sendkeys(locSearch, Keys.CONTROL+ "a"+Keys.DELETE, "Selected all text successfully");
		//		util.sendkeys(locSearch, "63668e863a231f9a7dfe89b6"+Keys.ENTER, "Search wish variant id successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		util.click(clManageProducts, "Click on manage products successfully");

		//		// Manage Products - More filters
		//		//Check by searching with SKU fiIter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//		util.click(clSKU, "Click on sku successfully");
		//		util.sendkeys(locSKU, "DJ9435SS", "Search sku successfully");
		//		util.click(clDone, "Click on done successfully");
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching with Shopify product type filter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//		util.click(clShopifyProType, "Click on shopify product type successfully");
		//		util.sendkeys(locShopifyProType, "Jacket", "Search shopify product type successfully");
		//		util.click(clDone, "Click on done successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching with Vendor filter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//		util.click(clVendor, "Click on vendor successfully");
		//		util.sendkeys(locVendor, "SShubhamsaroj", "Search vendor successfully");
		//		util.click(clDone, "Click on done successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching with Type of product filter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//        util.click(clTypesOfPro, "Click on types of product successfully");
		//        util.click(locTypesOfPro, "Click on types of product dropdown successfully");
		//        util.selectByVisibleText(locTypesOfPro, "VARIANTS", "Select variant successfully");
		//		util.click(clDone, "Click on done successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching with Review status FiIter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//        util.click(clReviewStatus, "Click on review status successfully");
		//        util.click(locReviewStatus, "Click on review status dropdown successfully");
		//        util.selectByVisibleText(locReviewStatus, "PENDING", "Select pending successfully");
		//        util.click(clDone, "Click on done successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching with Price filter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//        util.click(clPrice, "Click on price successfully");
		//        util.sendkeys(locPriceFrom, "500", "Search price from successfully");
		//        util.sendkeys(locPriceTo, "1500", "Search price to successfully");
		//        util.click(clDone, "Click on done successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching with Weight filter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//        util.click(clWeight, "Click on weight successfully");
		//        util.sendkeys(locWeightFrom, "0.1", "Search weight from successfully");
		//        util.sendkeys(locWeightTo, "0.9", "Search weight to successfully");
		//        util.click(clDone, "Click on done successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Check by searching with Inventory filter.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//        util.click(clInventory, "Click on inventory successfully");
		//        util.sendkeys(locInventoryFrom, "10", "Search inventory from successfully");
		//        util.sendkeys(locInventoryTo, "60", "Search inventory to successfully");
		//        util.click(clDone, "Click on done successfully");
		//		util.verifyInnerText(inDenimJacket, "Denim Jacket", "Denim Jacket snapshot");
		//		//Verify done button.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//        util.click(clDone, "Click on done successfully");
		//        util.verifyAttributeValue(locFilters, "class", "current-filters-list");
		//        //Verify clear all filters button.
		//		util.click(clMoreFilters, "Click on more filters successfully");
		//		util.click(clClearAllFilter, "Clear all filters successfully");

		// Manage Products - Bulk Action
		//Verify Uploading Product on Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");	
		//		util.selectByVisibleText(locChooseAction, "Upload Product On Wish", "Choose upload product on wish successfully");
		//        util.click(clSubmit, "Click on submit successfully");
		//        util.verifyInnerText(inUploadingProWish, "Uploading products on wish.", "Uploading products on wish. snapshot");
		//		util.verifyInnerText(inDownloadErrors, "Download Errors", "Download Errors snapshot");
		//		util.click(clBack, "Click on back successfully");
		//Verify Disable Product on Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Disable Product On Wish", "Choose disable product on wish successfully");
		//        util.click(clSubmit, "Click on submit successfully");
		//        util.verifyAttributeValue(inDisablePro, "class", "msg");
		//        util.click(clOK, "Click on ok successfully");
		//        util.verifyInnerText(inDisableProWish, "Disable products on wish.com", "Disable products on wish.com snapshot");
		//        util.click(clBack, "Click on back successfully");
		//Verify Enable Product on Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Enable Product On Wish", "Choose enable product on wish successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.verifyAttributeValue(inDisablePro, "class", "msg");
		//		util.click(clOK, "Click on ok successfully");
		//		util.verifyInnerText(inEnableProWish, "Enable products on wish.com", "Disable products on wish.com snapshot");
		//		util.click(clBack, "Click on back successfully");
		//Verify Sync Product from shopify
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Sync Product from Shopify", "Choose sync product from shopify successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.click(clSync, "Click on sync successfully");
		//		util.verifyInnerText(inYayAction, "Yay! The action has been successfully executed!", "Yay! The action has been successfully executed! snapshot");
		//		util.click(clBack, "Click on back successfully");
		//Verify Update Shipping on Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Update Shipping On Wish", "Choose update shipping on wish successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.verifyInnerText(inUpdateShippWish, "Update Shipping price on wish.com", "Update Shipping price on wish.com snapshot");
		//		util.click(clBack, "Click on back successfully");
		//Verify Update Price on Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Update Price On Wish", "Choose update price on wish successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.verifyInnerText(inUpdatePriceWish, "Updating Price on wish.com", "Updating Price on wish.com snapshot");
		//		util.click(clBack, "Click on back successfully");
		//Verify Update Inventory on Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Update Inventory On Wish", "Choose update inventory on wish successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.holdOn(2);
		//		util.verifyInnerText(inUpdateInventoryWish, "Updating Inventory on wish.com", "Updating Inventory on wish.com snapshot");
		//		util.holdOn(2);
		//		util.click(clBack, "Click on back successfully");
		//Verify Update Status from Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Update Status From Wish", "Choose update status from wish successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.verifyInnerText(inUpdateStatusWish, "Updating Products status from wish.com", "Updating Products status from wish.com snapshot");
		//		util.click(clBack, "Click on back successfully");
		//Verify Delete Product from Wish
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Delete Product From Wish", "Choose delete from wish successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.verifyAttributeValue(inDeletePro, "class", "msg");
		//		util.click(clOK, "Click on ok successfully");
		//		util.verifyInnerText(inDeleteProWish, "Deleting products from wish.com", "Deleting products from wish.com snapshot");
		//		util.click(clBack, "Click on back successfully");
		//Verify Edit product Details
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clCheckBox, "Click on checkbox successfully");
		//		util.click(locChooseAction, "Click on choose action dropdown successfully");
		//		util.selectByVisibleText(locChooseAction, "Edit Products Details", "Choose edit product detail successfully");
		//		util.click(clSubmit, "Click on submit successfully");
		//		util.verifyInnerText(inEditProduct, "Edit products", "Edit products snapshot");
		//		util.click(clCloseEdit, "Click on close successfully");
		//Verify main/individual checkbox
		//		util.verifyInnerText(inProCount, "1", "Product count snapshot");
		//		util.verifyInnerText(inVarCount, "2", "Variant count snapshot");
		//		util.click(clManageProducts, "Click on manage products successfully");

		//		// Manage Products - Expand Button
		//		//Check expand button.
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clExpandButtton, "Click on expand button successfully");
		//		util.holdOn(2);
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.verifyInnerText(inSKU1, "DJ0625SS", "SKU1 snapshot");
		//		util.verifyInnerText(inSKU2, "DJ9435SS", "SKU2 snapshot");
		//		util.click(clExpandButtton, "Click on expand button successfully");
		//		util.verifyAttributeValue(inExpandButtton, "class", "kv-expand-icon kv-state-expanded");	
		//		//TC_WISH_MP_076
		//		util.holdOn(2);
		//		util.click(clExpandButtton, "Click on expand button successfully");
		//		util.holdOn(2);
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//        util.sendkeys(locExpandSKU, "DJ9435SS"+Keys.ENTER, "Input sku successfully");
		//		util.verifyInnerText(inSKU2, "DJ9435SS", "SKU2 snapshot");
		//		util.holdOn(2);
		//		util.click(clExpandButtton, "Click on expand button successfully");
		//		util.refreshPage();
		//		//Check switch handle by enabling and disabling.
		//		util.holdOn(2);
		//		util.click(clExpandButtton, "Click on expand button successfully");
		//		util.holdOn(2);
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.verifyInnerText(inVariantEnabled, "ENABLED : 2", "ENABLED : 2 snapshot");
		//		util.holdOn(2);
		//		util.click(clEnable1, "Click on enable1 successfully");
		//		util.verifyAttributeValue(inSwitchOn1, "data-on", "Yes");
		//		util.holdOn(2);
		//		util.click(clExpandButtton, "Click on expand button successfully");

		//		// Manage Products - Edit Product(on toggle dropdown)
		//		//Check by editing basic information of product
		//		util.jsScrollBottom();
		//		util.holdOn(2);
		//		util.click(clToggleDropdown, "Click on toggle dropdown successfully");
		//		util.click(clEditProduct, "Click on edit product successfully");
		//		locTitle.clear();
		//		util.sendkeys(locTitle, "Denim Jacket2", "Input denim jacket 2 successfully");

		// Shipping Template - Templates
		//Check by clicking on Click Here link to know How Shipping Template works
        util.click(clShippingTemplate, "Click on shipping template successfully");
        util.click(clClickHere, "Click on click here successfully");
        util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/help/index#div_359", "Open faqs tab successfully");
        util.verifyInnerText(inShippTemp, "How does Shipping Template work?", "How does Shipping Template work? snapshot");
        util.getWindoHandleByUrl("https://apps.cedcommerce.com/marketplace-integration/wish/template/index", "Open shipping template tab successfully");
        //Check by editing templates.
        util.sendkeys(locTemplate, "My Template", "Input my template in box successfully");
        

	}

}