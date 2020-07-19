package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetScreenshot {
    public static String capture(WebDriver driver, String screenshotName) throws IOException {
       // String dateName=new SimpleDateFormat().format(new Date());
        TakesScreenshot ts=((TakesScreenshot)driver);
        File source=ts.getScreenshotAs(OutputType.FILE);
        String destination=System.getProperty("user.dir")+"/Screenshots"+screenshotName+ ".png";
        File finalDestination=new File(destination);
        FileUtils.copyFile(source,finalDestination);
        return destination;

    }
}
