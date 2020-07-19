package Modules;

import ExtentReport.ExtentTestManager;
import Page_Objects.FakePricingPage;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.IOException;

public class FakePricingModule {
    public WebDriver driver;
    private FakePricingPage fakePricingPage;
    public FakePricingModule(FakePricingPage fakePricingPage) {
        this.fakePricingPage = fakePricingPage;
    }

    public void ValidateFakePricingPageFields() throws IOException {
        boolean isPurchase = fakePricingPage.isClickPurchase();
        Assert.assertTrue(isPurchase, "Failed to validate that Purchase button was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"Purchase button was clicked successfully");
    }

}
