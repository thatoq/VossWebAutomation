package Test;

import BaseTest.WebBaseTest;
import Modules.CollectionModule;
import Modules.FillOutFormsModule;
import Modules.HomeModule;
import Modules.LoginModule;
import Page_Objects.CollectionPage;
import Page_Objects.FillOutFormsPage;
import Page_Objects.HomePage;
import Page_Objects.LoginPage;
import Utils.DataProviderObject;
import Utils.DriverFactory;
import Utils.Global_Variables;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FillOutFormsTest extends WebBaseTest {
    WebDriver driver;

    @Test(dataProvider = "FillOutForms", dataProviderClass = DataProviderObject.class)
    public void FilloutForms (String browser,String name1,String message1, String name2,String message2,String answer) throws Exception {
        driver = DriverFactory.getInstance().getBrowserInstance(browser);
        driver.get(Global_Variables.URL);
        driver.manage().window().maximize();

        HomeModule homeModule = new HomeModule(new HomePage(driver));
        homeModule.ClickFilloutFormsLink();

        FillOutFormsModule fillOutFormsModule=new FillOutFormsModule(new FillOutFormsPage(driver));
        fillOutFormsModule.validateFillOutFormsPageFields(name1,message1,name2,message2,answer);

    }
}
