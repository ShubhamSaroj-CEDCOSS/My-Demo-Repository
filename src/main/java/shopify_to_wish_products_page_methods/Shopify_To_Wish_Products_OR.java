package shopify_to_wish_products_page_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify_To_Wish_Products_OR {

	/* Shopify Settings OR */
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement locSettings;
	
	@FindBy(xpath = "//span[text()='Apps and sales channels']")
	WebElement clApps;

	@FindBy(xpath = "//span[text()='Wish Marketplace - Integration']")
	WebElement clWishApp;

	@FindBy(xpath = "//span[text()='Open app']")
	WebElement clOpenApp;
	
	/* Wish Products OR */
	@FindBy(xpath = "//span[text()='Products']")
	WebElement clProducts;
	
	@FindBy(xpath = "//span[text()='Manage Products']")
	WebElement clManageProducts;
	
	@FindBy(xpath = "//button[@id='show-more-btn-popup']")
	WebElement clMoreAction;
	
	@FindBy(xpath = "//span[text()='Export Products']")
	WebElement inExportProducts;
	
	@FindBy(xpath = "//span[text()='Import Products']")
	WebElement inImportProducts;
	
	@FindBy(xpath = "//span[text()='Export Products']")
	WebElement clExportProducts;
	
	@FindBy(xpath = "//div[@id='product_editing_columns']")
	WebElement inProductsOpt;
	
	@FindBy(xpath = "//span[text()='Variants']")
	WebElement clVariants;
	
	@FindBy(xpath = "//div[@id='variants_editing_columns']")
	WebElement inVariantsOpt;
	
	@FindBy(xpath = "//button[@id='sync-cancel']")
	WebElement clClose;
	
	@FindBy(xpath = "//span[text()='Import Products']")
	WebElement clImportProducts;
	
	@FindBy(xpath = "//input[@id='file']")
	WebElement inChooseFile;
	
	@FindBy(xpath = "(//button[@id='sync-cancel'])[2]")
	WebElement clClose2;
	
	@FindBy(xpath = "(//div[@class='Polaris-Modal__BodyWrapper'])[2]")
	WebElement inExportOpt;
	
	@FindBy(xpath = "(//button[@id='sync-cancel'])[2]")
	WebElement inClose2;
	
	@FindBy(xpath = "//button[@id='import']")
	WebElement inImport;
	
	@FindBy(xpath = "(//span[@class='Polaris-Choice__Label'])[1]")
	WebElement inCurrentPage;
	
	@FindBy(xpath = "(//span[@class='Polaris-Choice__Label'])[2]")
	WebElement inAllProducts;
	
	@FindBy(xpath = "//input[@name='WishProductsSearch[search]']")
	WebElement locSearch;
	
	@FindBy(xpath = "//span[text()='Denim Jacket']")
	WebElement inDenimJacket;
	
	@FindBy(xpath = "//button[text()='More Filters']")
	WebElement clMoreFilters;
	
	@FindBy(xpath = "//span[text()='SKU']")
	WebElement clSKU;
	
	@FindBy(xpath = "//input[@placeholder='Enter SKU']")
	WebElement locSKU;
	
	@FindBy(xpath = "//span[text()='Done']")
	WebElement clDone;
	
	@FindBy(xpath = "//span[text()='Shopify product type']")
	WebElement clShopifyProType;
	
	@FindBy(xpath = "//input[@placeholder='Enter product type']")
	WebElement locShopifyProType;
	
	@FindBy(xpath = "//span[text()='Vendor']")
	WebElement clVendor;
	
	@FindBy(xpath = "//input[@placeholder='Enter vendor']")
	WebElement locVendor;
	
	@FindBy(xpath = "//span[text()='Type of product']")
	WebElement clTypesOfPro;
	
	@FindBy(xpath = "//select[@id='Select1']")
	WebElement locTypesOfPro;
	
	@FindBy(xpath = "//span[text()='Review Status']")
	WebElement clReviewStatus;
	
	@FindBy(xpath = "//select[@id='Select2']")
	WebElement locReviewStatus;
	
	@FindBy(xpath = "//span[text()='Price']")
	WebElement clPrice;
	
	@FindBy(xpath = "//input[@placeholder='price from']")
	WebElement locPriceFrom;
	
	@FindBy(xpath = "//input[@placeholder='price to']")
	WebElement locPriceTo;
	
	@FindBy(xpath = "//span[text()='Weight']")
	WebElement clWeight;
	
	@FindBy(xpath = "//input[@placeholder='weight from']")
	WebElement locWeightFrom;
	
	@FindBy(xpath = "//input[@placeholder='weight to']")
	WebElement locWeightTo;
	
	@FindBy(xpath = "//span[text()='Inventory']")
	WebElement clInventory;
	
	@FindBy(xpath = "//input[@placeholder='inventory from']")
	WebElement locInventoryFrom;
	
	@FindBy(xpath = "//input[@placeholder='inventory to']")
	WebElement locInventoryTo;
	
	@FindBy(xpath = "//ul[@class='current-filters-list']")
	WebElement locFilters;
	
	@FindBy(xpath = "//button[@id='reset-filter']")
	WebElement clClearAllFilter;
	
	@FindBy(xpath = "(//span[@class='Polaris-Checkbox'])[2]")
	WebElement clCheckBox;
	
	@FindBy(xpath = "(//select[@id='wish_product_select'])[2]")
	WebElement locChooseAction;
	
	@FindBy(xpath = "(//button[text()='Submit'])[2]")
	WebElement clSubmit;
	
	@FindBy(xpath = "//span[text()='Uploading products on wish.']")
	WebElement inUploadingProWish;
	
	@FindBy(xpath = "//span[text()='Download Errors']")
	WebElement inDownloadErrors;
	
	@FindBy(xpath = "//span[text()='Back']")
	WebElement clBack;
	
	@FindBy(xpath = "//p[@class='msg']")
	WebElement inDisablePro;
	
	@FindBy(xpath = "//button[text()='Ok']")
	WebElement clOK;

	@FindBy(xpath = "//span[text()='Disable products on wish.com']")
	WebElement inDisableProWish;
	
	@FindBy(xpath = "//span[text()='Enable products on wish.com']")
	WebElement inEnableProWish;
	
	@FindBy(xpath = "//span[text()='Sync']")
	WebElement clSync;
	
	@FindBy(xpath = "//p[text()='Yay! The action has been successfully executed!']")
	WebElement inYayAction;
	
	@FindBy(xpath = "//span[text()='Update Shipping price on wish.com']")
	WebElement inUpdateShippWish;
	
	@FindBy(xpath = "//span[text()='Updating Price on wish.com']")
	WebElement inUpdatePriceWish;
	
	@FindBy(xpath = "//span[text()='Updating Inventory on wish.com']")
	WebElement inUpdateInventoryWish;
	
	@FindBy(xpath = "//span[text()='Updating Products status from wish.com']")
	WebElement inUpdateStatusWish;
	
	@FindBy(xpath = "//p[@class='msg']")
	WebElement inDeletePro;
	
	@FindBy(xpath = "//span[text()='Deleting products from wish.com']")
	WebElement inDeleteProWish;
	
	@FindBy(xpath = "//h2[text()='Edit products']")
	WebElement inEditProduct;
	
	@FindBy(xpath = "(//span[text()='Close'])[2]")
	WebElement clCloseEdit;
	
	@FindBy(xpath = "(//span[@class='product-count' and text()='1'])[2]")
	WebElement inProCount;
	
	@FindBy(xpath = "(//span[@class='variant-count' and text()='2'])[2]")
	WebElement inVarCount;
	
	@FindBy(xpath = "//div[@class='kv-expand-row']")
	WebElement clExpandButtton;
	
	@FindBy(xpath = "//p[text()='DJ0625SS']")
	WebElement inSKU1;
	
	@FindBy(xpath = "//p[text()='DJ9435SS']")
	WebElement inSKU2;
	
	@FindBy(xpath = "//div[@class='kv-expand-icon kv-state-expanded']")
	WebElement inExpandButtton;
	
	@FindBy(xpath = "//input[@id='wishproductvariantssearch-sku']")
	WebElement locExpandSKU;
	
	@FindBy(xpath = "//span[text()='ENABLED : 2']")
	WebElement inVariantEnabled;
	
	@FindBy(xpath = "(//span[@class='switch-handle'])[1]")
	WebElement clEnable1;
	
	@FindBy(xpath = "(//span[@data-on='Yes'])[1]")
	WebElement inSwitchOn1;
	
	@FindBy(xpath = "//button[@data-toggle='dropdown']")
	WebElement clToggleDropdown;

	@FindBy(xpath = "//a[@title='edit']")
	WebElement clEditProduct;
	
	@FindBy(xpath = "//input[@id='title']")
	WebElement locTitle;
	
	/* Shipping Template OR */	
	@FindBy(xpath = "//span[text()='Shipping Template']")
	WebElement clShippingTemplate;
	
	@FindBy(xpath = "//a[text()='Click Here']")
	WebElement clClickHere;
	
	@FindBy(xpath = "//a[text()='How does Shipping Template work?']")
	WebElement inShippTemp;
	
	@FindBy(xpath = "//input[@placeholder='Template name']")
	WebElement locTemplate;
	
}
