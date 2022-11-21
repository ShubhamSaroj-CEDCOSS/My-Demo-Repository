package generic_and_basetest_methods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Webutil {

	private WebDriver driver;
	private static Webutil wu;
	private ExtentReports extReport;
	private static ExtentTest extTest;

	Logger log = LogManager.getLogger("Webutil");

	public static Webutil getObject() {	
		if (wu==null) {
			wu=new Webutil();
		}
		return wu;   
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void launchBrowser(String browsername) {

		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}else if(browsername.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	}

	public void openUrl(String url) {	
		driver.get(url);
	}

	public void openLoginPage(Webutil wu, String browserName, String url) {
		wu.launchBrowser(browserName);
		wu.openUrl(url);
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void backPage() {
		driver.navigate().back();
	}

	public void closeBrowser() {
		driver.close();
	}	

	public void quiteBrowser() {
		driver.quit();
	}

	public void iframe(WebElement webEle) {
		driver.switchTo().frame(webEle);
	}

	public void handleFrame() {
		driver.switchTo().defaultContent();
	}
	
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}
	
	public String alertGGetText() {
		String p=driver.switchTo().alert().getText();
		return p;
	}
	
	public void jsScrollOnElement(WebElement webEle) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", webEle);
	}

	public void jsScrollByValue(String value) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript(value);
	}

	public void jsScrollBottom() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public void jsScrollTop() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}

	public void sendkeys(WebElement webEle, String inputvalue, String msg) {

		try {
			webEle.sendKeys(inputvalue);
		}catch (ElementNotInteractableException e) {
			webEle.sendKeys(inputvalue);
		}
		extTest.log(Status.INFO, msg);
		log.info(msg);
	}

	public void click(WebElement webEle, String msg) {		

		try {
			webEle.click();	
		}catch (ElementClickInterceptedException e) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(webEle));
			webEle.click();	
		}catch (StaleElementReferenceException e) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(webEle));
			webEle.click();	
		}
		extTest.log(Status.INFO, msg);
		log.info(msg);
	}

	public void verifyInnerText(WebElement weEle, String expectedText, String snapshotname) {

		try {
			String actualText=weEle.getText();
			if(actualText.equalsIgnoreCase(expectedText)) {
				extTest.log(Status.PASS, " Where Actual Text is :- "+actualText+" & Expected Text is :- "+expectedText);
			}else {
				extTest.log(Status.FAIL, " Where Actual Text is :- "+actualText+" & Expected Text is :- "+expectedText);
				String img = wu.takeSnapShot(snapshotname);
				wu.snapShotCaptureReportattach(img);
			}
		}catch (NoSuchElementException e) {
			extTest.log(Status.FAIL, e);
		}	
	}

	public void verifyTitle(String expectedTitle, String snapshotname) {

		String actualTitle = driver.getTitle();
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			extTest.log(Status.PASS, " Where Actual Title is :- "+actualTitle+" & Expected is :- "+expectedTitle);
		}else {
			extTest.log(Status.FAIL, " Where Actual Title is :- "+actualTitle+" & Expected is :- "+expectedTitle);
			String img = wu.takeSnapShot(snapshotname);
			wu.snapShotCaptureReportattach(img);
		}
	}

	public void verifyAttributeValue(WebElement weEle, String attributeName, String expectedAttributeValue) {

		String actualAttributeValue = weEle.getAttribute(attributeName);
		if(actualAttributeValue.equalsIgnoreCase(expectedAttributeValue)){
			extTest.log(Status.PASS, " Where Actual Attribute Value is :- "+actualAttributeValue+" & Expected Attribute Value is :- "+expectedAttributeValue);
		}else {
			extTest.log(Status.FAIL, " Where Actual Attribute Value is :- "+actualAttributeValue+" & Expected Attribute Value is :- "+expectedAttributeValue);
		}
	}
	
	public void verifyElementSelected(WebElement weEle, String snapshotname) {
		
		boolean status = weEle.isSelected();
		if (status) {
			extTest.log(Status.PASS, "Checkbox is checked");

		} else {
			extTest.log(Status.FAIL, "Checkbox is unchecked");
			String img = wu.takeSnapShot(snapshotname);
			wu.snapShotCaptureReportattach(img);
		}	
	}

	public void verifyElementVisible(WebElement weEle, String snapshotname){

		boolean  weStatus = weEle.isDisplayed();
		Dimension dim =  weEle.getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		if(weStatus==true && height>0 && width>0){
			extTest.log(Status.PASS, "Element is Visible");
		}else {
			extTest.log(Status.FAIL, "Element is Invisible");
			String img = wu.takeSnapShot(snapshotname);
			wu.snapShotCaptureReportattach(img);
		}
	}

	public void verifyElementInvisible(WebElement weEle, String snapshotname){

		boolean  weStatus = weEle.isDisplayed();
		Dimension dim =  weEle.getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		if(weStatus==true && height>0 && width>0){
			extTest.log(Status.FAIL, "Element is Visible");
			String img = wu.takeSnapShot(snapshotname);
			wu.snapShotCaptureReportattach(img);			
		}else {
			extTest.log(Status.PASS, "Element is Invisible");
		}
	}

	public void verifyDisabled(WebElement weEle, String snapshotname) {

		boolean status = weEle.isEnabled();
		if(status==false){
			extTest.log(Status.PASS, "Element is Disabled");
		}else {
			extTest.log(Status.FAIL, "Element is Enabled");	
			String img = wu.takeSnapShot(snapshotname);
			wu.snapShotCaptureReportattach(img);
		}
	}

	public void selectByVisibleText(WebElement webEle, String selectText, String msg) {

		try {
			Select selobj=new Select(webEle);
			selobj.selectByVisibleText(selectText);
		}catch(StaleElementReferenceException e) {
			Select selobj=new Select(webEle);
			selobj.selectByVisibleText(selectText);
		}
		extTest.log(Status.INFO, msg);
		log.info(msg);
	}
	
	public void verifySelectedDropDown(WebElement webEle) {
		
		Select select = new Select(webEle);
		WebElement option = select.getFirstSelectedOption();
		String SelectedText = option.getText();
		extTest.log(Status.PASS, "Selected text is -"+SelectedText);

	}
	
	public void verifyDropdownValue(WebElement webEle) {
		 
		Select select = new Select(webEle);  
		List<WebElement> options = select.getOptions();  
		for(WebElement we:options)  
		{  
		 System.out.println(we.getText());  
		}  
	}

	public void extReport(String reportResultName) {

		ExtentHtmlReporter ExtHtmlRport = new ExtentHtmlReporter(reportResultName);
		ExtHtmlRport.config().setReportName("Wish Regression Automation Reports");
		ExtHtmlRport.config().setDocumentTitle("Extent Reports");
		extReport =new ExtentReports();	
		extReport.attachReporter(ExtHtmlRport);
		extReport.setSystemInfo("username", System.getProperty("user.name"));
		extReport.setSystemInfo("OS", System.getProperty("user.os"));
		extReport.setSystemInfo("Envoirment", "QA");

	}

	public void setExtentLogger(String testCaseName) {
		extTest=extReport.createTest(testCaseName);
	}

	public ExtentTest getLogger() {
		return extTest;
	}

	public void printExtentTestMsg(String msg) {
		extTest.log(Status.PASS, msg);
	}

	public void flushReport() {
		extReport.flush();
	}	

	public String takeSnapShot(String snapshotname)  {

		TakesScreenshot  tss= (TakesScreenshot) driver;
		File source = tss.getScreenshotAs(OutputType.FILE);
		File destinationFile=	new File("Report/"+snapshotname+".jpeg");
		try {
			Files.copy(source, destinationFile);
		}catch(IOException e) {

		}
		return destinationFile.getAbsolutePath();
	}

	public void snapShotCaptureReportattach(String imgPath) {

		try {
			extTest.addScreenCaptureFromPath(imgPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getWindoHandleByUrl(String ExpURLvalue ,String msg) {	

		Set<String> AllWindowValue=driver.getWindowHandles();		
		for(String AllValue: AllWindowValue) {		
			driver.switchTo().window(AllValue);		
			String  getTitleValue=	driver.getCurrentUrl();	
			if(getTitleValue.contains(ExpURLvalue)) {
				break;
			}
		}
		extTest.log(Status.INFO, msg);
		log.info(msg);
	}

	public void holdOn(long miles) {

		try {
			Thread.sleep(miles*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isFileDownloaded(String filePath) {

		final int SLEEP_TIME_MILLIS = 1000;
		File file = new File(filePath);
		final int timeout = 60* SLEEP_TIME_MILLIS;
		int timeElapsed = 0;
		while (timeElapsed<timeout){
			if (file.exists()) {
				extTest.log(Status.PASS, filePath + " is present");
				return true;
			} else {
				timeElapsed +=SLEEP_TIME_MILLIS;
				try {
					Thread.sleep(SLEEP_TIME_MILLIS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

}