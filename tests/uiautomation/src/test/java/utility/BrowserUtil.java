package utility;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.rmi.server.ExportException;

public class BrowserUtil {

    private static WebDriver driver;
    private static ChromeDriverService driverService;

    /**
     * Static method that opens chrome browser
     * for the user
     */
//    public static void openBrowser() {
//       // WebDriverManager.chromedriver().setup();
//        int portNumber = Integer.valueOf(System.getProperty("port"));
//        System.out.println("We got the port number: " + portNumber);
//        String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
//        driverService = new ChromeDriverService.Builder()
//                .usingDriverExecutable(new File(driverPath))
//                .usingPort(portNumber)
//                .build();
//
//        System.out.println("GET URL: " + driverService.getUrl());
//
//        try {
//            driverService.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        driver = new RemoteWebDriver(driverService.getUrl(), new ChromeOptions());
//        driver.manage().window().maximize();
//    }
    public static void openBrowser() {
        // WebDriverManager.chromedriver().setup();
       // int portNumber = Integer.valueOf(System.getProperty("port"));
        String url = System.getProperty("url");
        //System.out.println("We got the port number: " + portNumber);
        //String driverPath = System.getProperty("user.dir") + "/drivers/chromedriver";
//        driverService = new ChromeDriverService.Builder()
//               // .usingDriverExecutable(new File(driverPath))
//                .usingPort(portNumber)
//                .build();

       // System.out.println("GET URL: " + driverService.getUrl());

//        try {
//            driverService.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try{
            driver = new RemoteWebDriver(new URL(url), new ChromeOptions());
        }catch (MalformedURLException ex) {
            System.out.println("ERROR:  Please check your URI string...");
        }

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
           // driverService.stop();
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
