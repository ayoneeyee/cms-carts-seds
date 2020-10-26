package utility;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Steps {

    private static ExtentTest testcase;


    public static void init(ExtentTest inTestCase) {
        testcase = inTestCase;
    }


    public static void log(String message) {
        testcase.info(message);
    }


    public static void imgLog(String message) {
        String screenshot = ((TakesScreenshot) UIActions.driver).getScreenshotAs(OutputType.BASE64);
        testcase.addScreenCaptureFromBase64String(screenshot, message);
    }


}






