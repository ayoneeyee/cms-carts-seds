package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.BrowserUtil;

public abstract class BaseTest {
    // ========== Test Case Setup and Clean up methods ============//
    @BeforeMethod
    public void beforeEachTestCase() {
        BrowserUtil.openBrowser();
    }

    @AfterMethod
    public void afterEachTestCase() {
        BrowserUtil.closeBrowser();
    }

    public String getUsername() {
        String usernameInput = System.getProperty("user");
        return usernameInput;
    }

    public String getPassword() {
        String passInput = System.getProperty("pass");
        return passInput;
    }

}
