package Modules;

import ExtentReport.ExtentTestManager;
import Page_Objects.HomePage;
import Utils.GetScreenshot;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class HomeModule {
    public WebDriver driver;
    private HomePage homePage;
    public HomeModule(HomePage homePage) {
        this.homePage = homePage;
    }

    public void VerifyPageTitle() throws IOException {
        String expectedTitle="Automation Practice";

        Assert.assertEquals(expectedTitle, homePage.getPageTitle(),"Failed to verify page title.");
        ExtentTestManager.getTest().log(LogStatus.PASS,expectedTitle+" "+"is the title");
        String screenshotPath= GetScreenshot.capture(homePage.getDriver(),"screenshotforExtendRport");
        ExtentTestManager.getTest().log(LogStatus.PASS,ExtentTestManager.startTest("Login").addScreenCapture(screenshotPath));


    }
    public void ClicklogonAutomation() throws IOException {

        boolean isHomepage = homePage.isClickLogonAutomation();
        Assert.assertTrue(isHomepage, "Failed to validate that logon automation was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"logon automation was clicked successfully");

    }
    public void ClickFilloutFormsLink() throws IOException {

        boolean isHomepage = homePage.isClickFillOutForm();
        Assert.assertTrue(isHomepage, "Failed to validate that Fill Out Form was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Fill Out Form was clicked successfully");

    }
    public void ClickFakePricingPageLink() throws IOException {

        boolean isHomepage = homePage.isClickFakePricingPage();
        Assert.assertTrue(isHomepage, "Failed to validate that Fake Pricing Page Link was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Fake Pricing Page Link was clicked successfully");

    }

}
