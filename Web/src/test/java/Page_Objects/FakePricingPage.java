package Page_Objects;

import Utils.ReadPageElementsFile;
import Utils.SeleniumWaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

public class FakePricingPage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By basic=By.xpath(prop.getProperty("basicPurchase"));

    public FakePricingPage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isClickPurchase() {
        try {
            // Verify visibility of these elements from the home page
            WebElement purchaseElement=  seleniumWaitHelper.waitForElementVisibility(basic);
            purchaseElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
