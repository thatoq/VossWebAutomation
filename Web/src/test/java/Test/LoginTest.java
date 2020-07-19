package Test;

import BaseTest.WebBaseTest;
import ExtentReport.ExtentTestManager;
import Modules.CollectionModule;
import Modules.HomeModule;
import Modules.LoginModule;
import Page_Objects.CollectionPage;
import Page_Objects.HomePage;
import Page_Objects.LoginPage;
import Utils.DataProviderObject;
import Utils.DriverFactory;
import Utils.Global_Variables;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends WebBaseTest {
    WebDriver driver;

    @Test(dataProvider = "Login", dataProviderClass = DataProviderObject.class)
    public void VerifyPageTitle (String browser,String email,String password) throws Exception {
        driver = DriverFactory.getInstance().getBrowserInstance(browser);
        driver.get(Global_Variables.URL);
        driver.manage().window().maximize();

        HomeModule homeModule = new HomeModule(new HomePage(driver));
        homeModule.VerifyPageTitle();

        homeModule.ClicklogonAutomation();

        LoginModule loginModule=new LoginModule(new LoginPage(driver));
        loginModule.validateLoginPageFields(email,password);

        CollectionModule collectionModule=new CollectionModule(new CollectionPage(driver));
        collectionModule.validateCollectionPageFields();
    }
}
