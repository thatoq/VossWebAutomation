package Modules;

import ExtentReport.ExtentTestManager;
import Page_Objects.CollectionPage;
import Page_Objects.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;

public class CollectionModule {
    private CollectionPage collectionPage;
    public CollectionModule(CollectionPage collectionPage) {
        this.collectionPage = collectionPage;
    }

    public void validateCollectionPageFields() {


        boolean isDropDownToggle = collectionPage.isClickDropDownToggle();
        Assert.assertTrue(isDropDownToggle, "Failed to validate that dropdown toggle was clicked.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"dropdown toggle was clicked successfully");

        boolean isLogout = collectionPage.isClickLogout();
        Assert.assertTrue(isLogout, "Failed to validate that logout was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS, "logout was clicked successfully");
    }
}
