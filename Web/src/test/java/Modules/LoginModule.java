package Modules;

import ExtentReport.ExtentTestManager;
import Page_Objects.HomePage;
import Page_Objects.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;

public class LoginModule {
    private LoginPage loginPage;

    public LoginModule(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    public void validateLoginPageFields(String email, String pasword) throws InterruptedException {


        boolean isEmail = loginPage.isInputEmail(email);
        Assert.assertTrue(isEmail, "Failed to validate that email was entered successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,email+" "+"email was entered successfully");

        boolean isPassword = loginPage.isInputPassword(pasword);
        Assert.assertTrue(isPassword, "Failed to validate that password was entered successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS, "password was entered successfully");

        boolean isSignIn = loginPage.isClickSignIn();
        Assert.assertTrue(isSignIn, "Failed to validate that sign in button was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"sign in button was clicked successfully");

    }
}
