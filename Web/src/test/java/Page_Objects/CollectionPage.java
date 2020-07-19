package Page_Objects;

import Utils.ReadPageElementsFile;
import Utils.SeleniumWaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

public class CollectionPage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By dropDownToggle=By.xpath(prop.getProperty("DropdownToggle"));
    By logout = By.linkText(prop.getProperty("Logout"));


    public CollectionPage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isClickDropDownToggle() {
        try {
            // Verify visibility of these elements from the home page
            WebElement dropDownToggleElement=  seleniumWaitHelper.waitForElementVisibility(dropDownToggle);
            dropDownToggleElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isClickLogout() {
        try {
            // Verify visibility of these elements from the home page
            WebElement logoutElement=  seleniumWaitHelper.waitForElementVisibility(logout);
            logoutElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
