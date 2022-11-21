package shopify_to_wish_contact_us_page_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify_To_Wish_Contact_Us_OR {

	/* Shopify Settings OR */
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement locSettings;

	@FindBy(xpath = "//span[text()='Apps and sales channels']")
	WebElement clApps;

	@FindBy(xpath = "//span[text()='Wish Marketplace - Integration']")
	WebElement clWishApp;

	@FindBy(xpath = "//span[text()='Open app']")
	WebElement clOpenApp;
	
	/* Wish Contact Us OR */
	@FindBy(xpath = "//span[text()='Accept']")
	WebElement clAccept;
	
	@FindBy(xpath = "//span[text()='Contact Us ']")
	WebElement clContactUs;
	
	@FindBy(xpath = "//select[@id='query_type']")
	WebElement clQueryType;
	
	@FindBy(xpath = "//option[text()='Other']")
	WebElement inOther;
	
	@FindBy(xpath = "//option[text()='Listing Optimization and Product SEO']")
	WebElement inSEO;
	
	@FindBy(xpath = "//option[text()='Request a demo']")
	WebElement inReqDemo;
	
	@FindBy(xpath = "//option[text()='Pricing']")
	WebElement inPricing;
	
	@FindBy(xpath = "//option[text()='Order']")
	WebElement inOrder;
	
	@FindBy(xpath = "//option[text()='Product']")
	WebElement inProduct;
	
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement locMessage;
	
	@FindBy(xpath = "//span[@class='Polaris-Button__Text next-button-span']")
	WebElement locSubmit;
	
	@FindBy(xpath = "//a[text()='WhatsApp Support']")
	WebElement clWhatsapp;
	
	@FindBy(xpath = "//a[text()='Skype Support']")
	WebElement clSkype;
	
	@FindBy(xpath = "//a[text()='Ticket Support']")
	WebElement clTicket;
	
}
