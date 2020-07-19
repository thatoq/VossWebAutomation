package Page_Objects;

import Utils.ReadPageElementsFile;
import Utils.SeleniumWaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Properties;

public class FillOutFormsPage {
    private WebDriver driver;
    private ReadPageElementsFile propertiesFile = new ReadPageElementsFile();
    private Properties prop = propertiesFile.getElementProperties();
    private SeleniumWaitHelper seleniumWaitHelper;

    By name1 = By.xpath(prop.getProperty("Name1"));
    By message1 = By.xpath(prop.getProperty("Message1"));
    By submit1=By.xpath(prop.getProperty("Submitbutton1"));
    By name2 = By.xpath(prop.getProperty("Name2"));
    By message2 = By.xpath(prop.getProperty("Message2"));
    By additionAnswer=By.xpath(prop.getProperty("Answer"));
    By submit2=By.xpath(prop.getProperty("Submitbutton2"));



    public FillOutFormsPage(WebDriver driver) throws IOException {
        this.driver = driver;
        seleniumWaitHelper = new SeleniumWaitHelper(this.driver);
    }

    public boolean isInputName1(String name) {
        try {
            // Verify visibility of these elements from the user page
            WebElement name1Element= seleniumWaitHelper.waitForElementVisibility(name1);
            name1Element.sendKeys(name);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputMessage1(String message) {
        try {
            // Verify visibility of these elements from the user page
            WebElement message1Element= seleniumWaitHelper.waitForElementVisibility(message1);
            message1Element.sendKeys(message);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isClickSubmit1() {
        try {
            // Verify visibility of these elements from the home page
            WebElement submitElement=  seleniumWaitHelper.waitForElementVisibility(submit1);
            submitElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isInputName2(String name) {
        try {
            // Verify visibility of these elements from the user page
            WebElement nameElement= seleniumWaitHelper.waitForElementVisibility(name2);
            nameElement.sendKeys(name);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputMessage2(String message) {
        try {
            // Verify visibility of these elements from the user page
            WebElement messageElement= seleniumWaitHelper.waitForElementVisibility(message2);
            messageElement.sendKeys(message);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean isInputAnswer(String answer) {
        try {
            // Verify visibility of these elements from the user page
            WebElement answerElement= seleniumWaitHelper.waitForElementVisibility(additionAnswer);
            answerElement.sendKeys(answer);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isClickSubmit2() {
        try {
            // Verify visibility of these elements from the home page
            WebElement submitElement=  seleniumWaitHelper.waitForElementVisibility(submit2);
            submitElement.click();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
