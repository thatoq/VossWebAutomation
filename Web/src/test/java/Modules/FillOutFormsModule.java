package Modules;

import ExtentReport.ExtentTestManager;
import Page_Objects.FillOutFormsPage;
import Page_Objects.LoginPage;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;

public class FillOutFormsModule {
private FillOutFormsPage fillOutFormsPage;
    public FillOutFormsModule(FillOutFormsPage fillOutFormsPage) {
        this.fillOutFormsPage = fillOutFormsPage;
    }
    public void validateFillOutFormsPageFields(String name1,String message1, String name2,String message2,String answer) throws InterruptedException {


        boolean isName1 = fillOutFormsPage.isInputName1(name1);
        Assert.assertTrue(isName1, "Failed to validate that name was entered successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,name1+" "+"name was entered successfully");

        boolean isMessage1 = fillOutFormsPage.isInputMessage1(message1);
        Assert.assertTrue(isMessage1, "Failed to validate that message was entered successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS, message1+" "+"message was entered successfully");

        boolean isSubmit = fillOutFormsPage.isClickSubmit1();
        Assert.assertTrue(isSubmit, "Failed to validate that submit button was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"submit button was clicked successfully");


        boolean isName2 = fillOutFormsPage.isInputName2(name2);
        Assert.assertTrue(isName2, "Failed to validate that name was entered successfully..");
        ExtentTestManager.getTest().log(LogStatus.PASS,name2+" "+"name was entered successfully");

        boolean isMessage2 = fillOutFormsPage.isInputMessage2(message2);
        Assert.assertTrue(isMessage2, "Failed to validate that message was entered successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS, message2+" "+"message was entered successfully");

        boolean isAnswer = fillOutFormsPage.isInputAnswer(answer);
        Assert.assertTrue(isAnswer, "Failed to validate that answer was entered successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS, answer+" "+"answer was entered successfully");

        boolean isSubmit2 = fillOutFormsPage.isClickSubmit2();
        Assert.assertTrue(isSubmit2, "Failed to validate that submit button was clicked successfully.");
        ExtentTestManager.getTest().log(LogStatus.PASS,"submit button was clicked successfully");

    }

}
