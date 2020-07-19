package BaseTest;

import ExtentReport.ExtentManager;
import ExtentReport.ExtentTestManager;
import Utils.DriverFactory;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.lang.reflect.Method;

public class WebBaseTest {
    public WebDriver driver;
    ExtentTest extentTest;
    String screenshotPath;

    @BeforeMethod
    public  void beforeMethod(Method method)
    {
        ExtentTestManager.startTest(method.getName());
    }
    @AfterMethod
    public void afterMethod(ITestResult result) throws IOException {
        if (result.getStatus()==ITestResult.FAILURE){
            ExtentTestManager.getTest().log(LogStatus.FAIL,result.getThrowable());
        }else if (result.getStatus()==ITestResult.SKIP){
            ExtentTestManager.getTest().log(LogStatus.SKIP,"Test Skipped"+result.getThrowable());
        }else {
            ExtentTestManager.getTest().log(LogStatus.PASS,"Test Passed");
        }
        ExtentManager.getReporter().endTest(ExtentTestManager.getTest());
        ExtentManager.getReporter().flush();
    }
    @AfterMethod(alwaysRun = true)
    public void destroyDriver()
    {
        if(DriverFactory.getInstance().getDriver() != null) {
            DriverFactory.getInstance().quitDriver();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }


}
