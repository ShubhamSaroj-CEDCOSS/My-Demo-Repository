package shopify_to_wish_help_page_methods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shopify_To_Wish_Help_OR {

	/* Shopify Settings OR */
	@FindBy(xpath = "//span[text()='Settings']")
	WebElement locSettings;

	@FindBy(xpath = "//span[text()='Apps and sales channels']")
	WebElement clApps;

	@FindBy(xpath = "//span[text()='Wish Marketplace - Integration']")
	WebElement clWishApp;

	@FindBy(xpath = "//span[text()='Open app']")
	WebElement clOpenApp;
	
	/* Wish Help OR */
	@FindBy(xpath = "//span[text()='Accept']")
	WebElement clAccept;
	
	@FindBy(xpath = "//span[text()='Help']")
	WebElement clHelp;
	
	@FindBy(xpath = "//span[text()='Knowledge Base']")
	WebElement clKnowledgeBase;
	
	@FindBy(xpath = "//a[@href='#collapse1']")
	WebElement inGeneral;
	
	@FindBy(xpath = "//a[@href='#collapse2']")
	WebElement inProduct;
	
	@FindBy(xpath = "//a[@href='#collapse1']")
	WebElement clGeneral;
	
	@FindBy(xpath = "//div[@id='collapse1']")
	WebElement inGeneralHelp;
	
	@FindBy(xpath = "//a[@href='#collapse2']")
	WebElement clProduct;
	
	@FindBy(xpath = "//div[@id='collapse2']")
	WebElement inProductHelp;
	
	@FindBy(xpath = "//a[text()='Videos']")
	WebElement clVideos;
	
	@FindBy(xpath = "//img[@title='How to upload Product on wish']")
	WebElement inHowProWish;
	
	@FindBy(xpath = "//img[@title='How to create a Shipping Template']")
	WebElement inHowShiTem;
	
	@FindBy(xpath = "//img[@title='How to upload Product on wish']")
	WebElement clHowProWish;
	
	@FindBy(xpath = "//h2[text()='How to upload Product on wish']")
	WebElement inTextHowProWish;
	
	@FindBy(xpath = "//span[text()='Close']")
	WebElement clClose;
	
	@FindBy(xpath = "//img[@title='How to create a Shipping Template']")
	WebElement clHowShiTem;
	
	@FindBy(xpath = "//h2[text()='How to create a Shipping Template']")
	WebElement inTextHowShiTem;
	
	@FindBy(xpath = "//a[text()='Blog']")
	WebElement clBlog;
	
	@FindBy(xpath = "(//div[@class='Polaris-TextContainer'])[1]")
	WebElement inStartSellWish;
	
	@FindBy(xpath = "//h2[text()='Success Stories']")
	WebElement inSuccessStories;
	
	@FindBy(xpath = "(//div[@class='Polaris-Layout__AnnotationContent'])[1]")
	WebElement inStartSellWishHelp;
	
	@FindBy(xpath = "(//div[@class='Polaris-Layout__AnnotationContent'])[2]")
	WebElement inSuccessStoriesHelp;
	
	@FindBy(xpath = "//span[text()='Documentation']")
	WebElement clDocumentation;

}
