package ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
    static ExtentReports extent;
    final static String filePath="/.ExtentReports/ExtentReportResults.html";
    public synchronized static ExtentReports getReporter() {
        if (extent == null) {
            //Set HTML reporting file location
            String workingDir = System.getProperty("user.dir");
            extent = new ExtentReports(workingDir + "/ExtentReports/ExtentReportResults.html", true);
        }
        return extent;
    }

}
