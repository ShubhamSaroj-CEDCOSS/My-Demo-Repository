                                                                              package shopify_to_wish_bulk_operations_page_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify_To_Wish_Bulk_Operations_OR {

	/* Shopify Settings OR */
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement locSettings;
	
	@FindBy(xpath = "//span[text()='Apps and sales channels']")
	WebElement clApps;

	@FindBy(xpath = "//span[text()='Wish Marketplace - Integration']")
	WebElement clWishApp;

	@FindBy(xpath = "//span[text()='Open app']")
	WebElement clOpenApp;
	
	/* Wish Bulk Operations OR */
	@FindBy(xpath = "//span[text()='Bulk Operations']")
	WebElement clBulkOperations;
	
	@FindBy(xpath = "//span[text()='Product Upload']")
	WebElement clProductUpload;
	
	@FindBy(xpath = "//span[text()='Export']")
	WebElement clExport;
	
	@FindBy(xpath = "//p[text()=' Please Select Product Status. ']")
	WebElement inPlSeProStatus;
	
	@FindBy(xpath = "//input[@placeholder='Please select']")
	WebElement clPlaceholder;
	
	@FindBy(xpath = "//li[text()='ENABLED']")
	WebElement clEnabled;
	
	@FindBy(xpath = "//span[text()='×']")
	WebElement clCross;
	
	@FindBy(xpath = "//li[text()='DISABLED']")
	WebElement clDisabled;
	
	@FindBy(xpath = "//p[text()=' No Products found. ']")
	WebElement inNoProFound;
	
	@FindBy(xpath = "//li[text()='NOT UPLOADED']")
	WebElement clNotUploaded;
	
	@FindBy(xpath = "//li[text()='ENABLED']")
	WebElement inEnabled;
	
	@FindBy(xpath = "//li[text()='DISABLED']")
	WebElement inDisabled;
	
	@FindBy(xpath = "//li[text()='NOT UPLOADED']")
	WebElement inNotUploaded;
		
	@FindBy(xpath = "//span[text()='Product Update']")
	WebElement clProductUpdate;
	
	@FindBy(xpath = "(//select[@id='export-status'])[1]")
	WebElement clChooseAnyOne;
	
	@FindBy(xpath = "(//input[@placeholder='Please select'])[1]")
	WebElement clPlaceholder1;
	
	@FindBy(xpath = "//li[text()='Enabled']")
	WebElement clEnabled1;
	
	@FindBy(xpath = "//span[text()='Back']")
	WebElement clBack;
	
	@FindBy(xpath = "//li[text()='price']")
	WebElement clPrice;
	
	@FindBy(xpath = "//span[@id='products_rule']")
	WebElement inRuleUpPro;
	
	@FindBy(xpath = "//span[@id='variants_rule']")
	WebElement inRuleUpVar;
		
	@FindBy(xpath = "//option[text()='Update Product']")
	WebElement inUpdateProduct;
	
	@FindBy(xpath = "//option[text()='Update Variant']")
	WebElement inUpdateVariant;
	
}
