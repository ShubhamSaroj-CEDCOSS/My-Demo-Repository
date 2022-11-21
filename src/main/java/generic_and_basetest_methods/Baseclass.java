package generic_and_basetest_methods;

import java.lang.reflect.Method;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Baseclass {

	protected Webutil wu= Webutil.getObject();

	@BeforeSuite
	public void tcOpenApp() {

		wu.extReport("Report//results.html");	

	}

	@BeforeClass
	public void launchingMethod() {

		wu.openLoginPage(wu, "chrome", "https://sshubhamsaroj.myshopify.com/admin");

	}

	@BeforeMethod
	public void LoginPageMethod(Method method) {

		String tcName=method.getName();
		wu.setExtentLogger(tcName);		

	}
	
	@AfterMethod
	public void tclogOut(ITestResult result ,Method method) {
		
		int status=result.getStatus();
		if(status==ITestResult.FAILURE) {
			String tcName=method.getName();
			String imgPath=	wu.takeSnapShot(tcName);
			wu.snapShotCaptureReportattach(imgPath);	
			wu.getLogger().log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
			wu.getLogger().log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
			
			}
	}

	@AfterSuite
	public void closeApplication() {

		wu.flushReport();

	}

}