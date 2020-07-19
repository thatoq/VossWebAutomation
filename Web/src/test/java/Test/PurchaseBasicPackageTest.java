package Test;

import BaseTest.WebBaseTest;
import Modules.FakePricingModule;
import Modules.FillOutFormsModule;
import Modules.HomeModule;
import Page_Objects.FakePricingPage;
import Page_Objects.FillOutFormsPage;
import Page_Objects.HomePage;
import Utils.DataProviderObject;
import Utils.DriverFactory;
import Utils.Global_Variables;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PurchaseBasicPackageTest extends WebBaseTest {
    WebDriver driver;

    @Test(dataProvider = "FakePricing", dataProviderClass = DataProviderObject.class)
    public void PurchaseBasicPackage (String browser) throws Exception {
        driver = DriverFactory.getInstance().getBrowserInstance(browser);
        driver.get(Global_Variables.URL);
        driver.manage().window().maximize();

        HomeModule homeModule = new HomeModule(new HomePage(driver));
        homeModule.ClickFakePricingPageLink();
        FakePricingModule fakePricingModule=new FakePricingModule(new FakePricingPage(driver));
        fakePricingModule.ValidateFakePricingPageFields();

    }
}
