package shopify_wish_installation_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify_Wish_Installation_OR {
	
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement clSettings;
	
	@FindBy(xpath = "//span[text()='Apps and sales channels']")
	WebElement clApps;
	
	@FindBy(xpath = "//span[text()='Shopify App Store']")
	WebElement clShopifyAppStore;
	
	@FindBy(xpath = "(//input[@placeholder='Search apps'])[3]")
	WebElement locSearchApp;
	
	@FindBy(xpath = "//p[text()='Wish Marketplace Integration']")
	WebElement clWishApp;
	
	@FindBy(xpath = "(//input[@value='Add app'])[3]")
	WebElement clAddApp;
	
	@FindBy(xpath = "(//span[text()='Install app'])[1]")
	WebElement clInstallApp;
	
	/* Registration OR */
	@FindBy(xpath = "//input[@value='Shubham']")
	WebElement inFirstName;
	
	@FindBy(xpath = "(//input[@readonly='true'])[1]")
	WebElement inFirstNameBox;
	
	@FindBy(xpath = "//input[@value='Saroj']")
	WebElement inLastName;
	
	@FindBy(xpath = "(//input[@readonly='true'])[2]")
	WebElement inLastNameBox;
	
	@FindBy(xpath = "//input[@value='shubhamsaroj@cedcommerce.com']")
	WebElement inEmail;
	
	@FindBy(xpath = "(//input[@readonly='true'])[3]")
	WebElement inEmailBox;
	
	@FindBy(xpath = "//select[@id='time_zone']")
	WebElement clTimeZone;
	
	@FindBy(xpath = "//div[@style='display: block;']")
	WebElement inOtherTimeZone;
	
	@FindBy(xpath = "//label[text()='Other Time Zone']")
	WebElement locOtherTimeZone;
	
	@FindBy(xpath = "//select[@id='time_slot']")
	WebElement clTimeSlot;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement clNext;
	
	@FindBy(xpath = "//div[text()='How did you hear about us? cannot be blank.']")
	WebElement inHowDidMessage;
	
	@FindBy(xpath = "//select[@id='reference']")
	WebElement clHowDid;
	
	@FindBy(xpath = "//div[@style='display: block;']")
	WebElement inOtherReference;
	
	@FindBy(xpath = "//div[text()='Please Choose Agreement.']")
	WebElement inPlChoAgreement;
	
	@FindBy(xpath = "//span[@class='Polaris-Checkbox__Backdrop']")
	WebElement clCheckBox;
	
	@FindBy(xpath = "//p[text()='Connect with WISH']")
	WebElement inCoWithWish;
	
	/* Connect With Wish OR */
	@FindBy(xpath = "//a[text()='Click Here ']")
	WebElement clClickHere;	
	
	@FindBy(xpath = "//a[@type='button']")
	WebElement clConnectBtn;
	
	@FindBy(xpath = "//div[text()='Login']")
	WebElement inLogin;
	
	@FindBy(xpath = "//input[@placeholder='Email address or username']")
	WebElement locEmail;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement locPassword;
	
	@FindBy(xpath = "//div[text()='Log in']")
	WebElement clLogin;
	
	@FindBy(xpath = "//input[@id='submit']")
	WebElement clAllowAccess;
	
	@FindBy(xpath = "//a[text()=' Confirm']")
	WebElement clConfirm;
	
	/* Import Products OR */
	@FindBy(xpath = "//select[@id='ced-product-import']")
	WebElement clImportOption;
	
	@FindBy(xpath = "//span[text()='Instant import']")
	WebElement clInstantImport;
	
	@FindBy(xpath = "//p[text()=' 101 (new + existing) SKU(s) imported successfully ']")
	WebElement inImportedSuccessfully;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement clNextBtn;
	
	@FindBy(xpath = "//span[text()='Product Vendor']")
	WebElement clProductVendor;
	
	@FindBy(xpath = "//a[text()='Fetch products from Shopify']")
	WebElement clFetchPro;
	
	@FindBy(xpath = "//a[text()='Select All']")
	WebElement clSelectAll;
	
	@FindBy(xpath = "//button[text()='Start Import']")
	WebElement clStartImport;
	
	@FindBy(xpath = "//span[text()='Collections']")
	WebElement clCollection;
	
	@FindBy(xpath = "//h2[text()='All products import confirmation']")
	WebElement inAllProImConfirmation;
	
	@FindBy(xpath = "//span[text()='Instant import']")
	WebElement inInstantImport;
	
	@FindBy(xpath = "//span[text()='Backend import']")
	WebElement inBackendImport;
	
	@FindBy(xpath = "//div[@class='Polaris-Modal-Header']//a//span")
	WebElement clCross;
	
	@FindBy(xpath = "//h2[text()='Filtered product import confirmation']")
	WebElement inFilProImpConfirmation;

	@FindBy(xpath = "//option[text()='All products import']")
	WebElement inAllProImport;
	
	@FindBy(xpath = "//option[text()='Published products import']")
	WebElement inPubProImport;
	
	@FindBy(xpath = "//option[text()='Apply filter for']")
	WebElement inAppFilFor;
	
	@FindBy(xpath = "//li[text()='Home page']")
	WebElement inHomePage;
	
	@FindBy(xpath = "//li[text()='manual collection']")
	WebElement inManualCollection;
	
	@FindBy(xpath = "//li[text()='Summer Collection']")
	WebElement inSummerCollection;
	
	@FindBy(xpath = "//label[text()='Select Option(s)']")
	WebElement clSelectOpt;
		
	@FindBy(xpath = "//a[text()='Re-fetch products from Shopify']")
	WebElement clReFetchPro;
	
	@FindBy(xpath = "//li[@title='Home page']")
	WebElement inCollHomePage;
	
	@FindBy(xpath = "//ul[@class='select2-selection__rendered']")
	WebElement clSelOpt;
	
	@FindBy(xpath = "//a[text()='Unselect All']")
	WebElement clUnselectAll;
	
	@FindBy(xpath = "//input[@placeholder='Select an option']")
	WebElement inSelectOption;
	
	@FindBy(xpath = "//span[text()='Accept']")
	WebElement clAccept;
	
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement clWishSettings;
	
	@FindBy(xpath = "//span[text()='Product Configuration']")
	WebElement clProConfiguration;
	
	@FindBy(xpath = "//h2[text()='Allow Product Create']")
	WebElement locAllowProCreate;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement inAllProBox;
	
	/* Product Syncing Configuration OR */
	@FindBy(xpath = "//h2[text()='Product Syncing Configuration']")
	WebElement inProSyncConfig;
	
}