package Page_Objects;

import Utils.ReadPageElementsFile;
import Utils.SeleniumWaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

public class HomePage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By title=By.xpath(prop.getProperty("pageTitle"));
    By logonAutomation = By.linkText(prop.getProperty("loginLink"));
    By forms=By.linkText(prop.getProperty("fillOutForms"));
    By fakePricing=By.xpath(prop.getProperty("fakePricingPage"));


    public HomePage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public String getPageTitle() {
        try {
            // Verify visibility of these elements from the home page
            WebElement titleElement=  seleniumWaitHelper.waitForElementVisibility(title);

            return titleElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    public boolean isClickLogonAutomation() {
        try {
            // Verify visibility of these elements from the home page
            WebElement logonAutomationElement=  seleniumWaitHelper.waitForElementVisibility(logonAutomation);
            logonAutomationElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isClickFillOutForm() {
        try {
            // Verify visibility of these elements from the home page
            WebElement fillOutFormsElement=  seleniumWaitHelper.waitForElementVisibility(forms);
            fillOutFormsElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isClickFakePricingPage() {
        try {
            // Verify visibility of these elements from the home page
            WebElement fakePricingElement=  seleniumWaitHelper.waitForElementVisibility(fakePricing);
            fakePricingElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public WebDriver getDriver() {
        return driver;
    }


}
