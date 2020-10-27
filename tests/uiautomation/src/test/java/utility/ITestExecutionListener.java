package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.hamcrest.Condition;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestExecutionListener implements ITestListener {

    private ExtentReports extent;
    private ExtentTest testCaseSection;
    private ExtentSparkReporter spark;

    // ===== TEST CONTEXT ====== //
    // when the Smoke test starts
    public void onStart(ITestContext test) {
        String reportPath = System.getProperty("user.dir") + "/reports/";
        extent = new ExtentReports();
        spark = new ExtentSparkReporter(reportPath);
        spark.config().setTheme(Theme.STANDARD);
        extent.attachReporter(spark);

    }

    // when the Smoke test finishes
    public void onFinish(ITestContext test) {
        extent.flush();   // save report
    }

    // ===== TEST CASE  ====== //
    // For each test cases in Smoke test
    public void onTestStart(ITestResult result) {
        // creates test section in report
        testCaseSection = extent.createTest(result.getName());
        Steps.init(testCaseSection);
        String testCaseDescription = result.getMethod().getDescription();
        testCaseSection.info("Test Case Name: " + testCaseDescription);
    }

    // for each test cases results
    public void onTestSuccess(ITestResult result) {
        testCaseSection.pass("Test Case Passed");
        Steps.imgLog("Success");
    }

    public void onTestFailure(ITestResult result) {
        // TODO: implement screenshot capture code
        testCaseSection.fail("Test execution resulted in failure");
        String erroMsg = result.getThrowable().getMessage();
        Steps.logError(erroMsg);
        Steps.imgLog("failed");
    }

    public void onTestSkipped(ITestResult result) {
        testCaseSection.skip("Test execution was skipped");
        Steps.imgLog("skipped");
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        testCaseSection.fail(result.getThrowable().getStackTrace().toString());
        this.onTestFailure(result);
    }
}
