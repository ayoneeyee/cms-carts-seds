package pageobjects;

import org.openqa.selenium.By;
import utility.UIActions;

public class HomePage extends UIActions {
    //=== List of elements user interacts in this page ====//
    private final By report_banner = xpath("//h1");
    private final By contact_link = xpath("(//a[text()='CARTSHELP@cms.hhs.gov'])[1]");
    private final By year = xpath("//div[text()='2020']");
    private final By status = xpath("//div[text()='In Progress']");
    private final By actions = css("[target]");


    //=== List of methods that represents user's action in this page ===//
    public boolean reportBannerIsThere() {
      return elementIsVisibleToUser(report_banner);
    }

    public boolean contactLinkIsThere() {
        return grabAsWebElement(contact_link).isDisplayed();
    }

    public boolean reportIsThere() {
        boolean result1 = elementIsVisibleToUser(year);
        waitfor(1);
        boolean result2 = elementIsVisibleToUser(status);
        boolean result3 = elementIsVisibleToUser(actions);
        waitfor(1);
        return  result1 && result2 && result3;
    }

    public void editReport() {
        click(actions);
    }


}
