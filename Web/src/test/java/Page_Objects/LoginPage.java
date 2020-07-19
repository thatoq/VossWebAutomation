package Page_Objects;

import Utils.ReadPageElementsFile;
import Utils.SeleniumWaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

public class LoginPage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By email=By.xpath(prop.getProperty("Email"));
    By password = By.xpath(prop.getProperty("Password"));
    By signIn = By.xpath(prop.getProperty("SignInButton"));


    public LoginPage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isInputEmail(String emailAdress) {
        try {
            // Verify visibility of these elements from the user page
            WebElement emailElement= seleniumWaitHelper.waitForElementVisibility(email);
            emailElement.sendKeys(emailAdress);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputPassword(String userPassword) {
        try {
            // Verify visibility of these elements from the user page
            WebElement passwordElement= seleniumWaitHelper.waitForElementVisibility(password);
            passwordElement.sendKeys(userPassword);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isClickSignIn() {
        try {
            // Verify visibility of these elements from the home page
            WebElement signInElement=  seleniumWaitHelper.waitForElementVisibility(signIn);
            signInElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
