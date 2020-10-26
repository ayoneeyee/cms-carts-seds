package utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

    private static WebDriver driver;

    /**
     * Static method that opens chrome browser
     * for the user
     */
    public static void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    /**
     * Static method that opens user specified browser type, available
     * browser types are Chrome, Firefox, and Edge
     *
     * @param browserType types of browser user wants to open
     */
    public static void openBrowser(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
    }


    /**
     * Static method that closes the open browser
     */
    public static void closeBrowser() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }


    /**
     * Static method that returns the driver object to the caller
     *
     * @return
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new NullPointerException("Driver is not initiated or it is null");
        }
        return driver;
    }

}
